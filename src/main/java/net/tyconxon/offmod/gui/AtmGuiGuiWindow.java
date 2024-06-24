
package net.tyconxon.offmod.gui;

import net.tyconxon.offmod.OffmodMod;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class AtmGuiGuiWindow extends ContainerScreen<AtmGuiGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = AtmGuiGui.guistate;
	TextFieldWidget getWithdraw;

	public AtmGuiGuiWindow(AtmGuiGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 256;
		this.ySize = 180;
	}

	private static final ResourceLocation texture = new ResourceLocation("offmod:textures/atm_gui.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
		getWithdraw.render(ms, mouseX, mouseY, partialTicks);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		if (getWithdraw.isFocused())
			return getWithdraw.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
		getWithdraw.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "ATM", 10, 5, -12829636);
		this.font.drawString(ms, "-----------------------", 82, 68, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		getWithdraw = new TextFieldWidget(this.font, this.guiLeft + 82, this.guiTop + 32, 120, 20, new StringTextComponent("0")) {
			{
				setSuggestion("0");
			}

			@Override
			public void writeText(String text) {
				super.writeText(text);
				if (getText().isEmpty())
					setSuggestion("0");
				else
					setSuggestion(null);
			}

			@Override
			public void setCursorPosition(int pos) {
				super.setCursorPosition(pos);
				if (getText().isEmpty())
					setSuggestion("0");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:getWithdraw", getWithdraw);
		getWithdraw.setMaxStringLength(32767);
		this.children.add(this.getWithdraw);
		this.addButton(new Button(this.guiLeft + 10, this.guiTop + 59, 61, 20, new StringTextComponent("Deposit"), e -> {
			if (true) {
				OffmodMod.PACKET_HANDLER.sendToServer(new AtmGuiGui.ButtonPressedMessage(0, x, y, z));
				AtmGuiGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 10, this.guiTop + 32, 67, 20, new StringTextComponent("Withdraw"), e -> {
			if (true) {
				OffmodMod.PACKET_HANDLER.sendToServer(new AtmGuiGui.ButtonPressedMessage(1, x, y, z));
				AtmGuiGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 82, this.guiTop + 5, 124, 20, new StringTextComponent("What is my balance?"), e -> {
			if (true) {
				OffmodMod.PACKET_HANDLER.sendToServer(new AtmGuiGui.ButtonPressedMessage(2, x, y, z));
				AtmGuiGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
	}
}
