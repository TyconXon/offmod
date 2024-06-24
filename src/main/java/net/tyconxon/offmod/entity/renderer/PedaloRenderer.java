package net.tyconxon.offmod.entity.renderer;

import net.tyconxon.offmod.entity.PedaloEntity;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PedaloRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PedaloEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelpedalomodel(), 0.9f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("offmod:textures/pedalo.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.7.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelpedalomodel extends EntityModel<Entity> {
		private final ModelRenderer bb_main;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;

		public Modelpedalomodel() {
			textureWidth = 128;
			textureHeight = 128;
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.setTextureOffset(0, 0).addBox(-6.0F, -1.0F, -13.0F, 12.0F, 2.0F, 18.0F, 0.0F, false);
			bb_main.setTextureOffset(23, 25).addBox(-7.0F, -5.0F, -15.0F, 1.0F, 5.0F, 21.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 20).addBox(6.0F, -5.0F, -15.0F, 1.0F, 5.0F, 21.0F, 0.0F, false);
			bb_main.setTextureOffset(46, 20).addBox(-6.0F, -6.0F, -15.0F, 12.0F, 6.0F, 2.0F, 0.0F, false);
			bb_main.setTextureOffset(46, 28).addBox(-6.0F, -5.0F, 5.0F, 12.0F, 5.0F, 1.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 0).addBox(-2.0F, -11.0F, -19.0F, 4.0F, 5.0F, 5.0F, 0.0F, false);
			bb_main.setTextureOffset(10, 10).addBox(-1.0F, -10.0F, -14.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 10).addBox(-2.0F, -6.0F, -16.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
			bb_main.setTextureOffset(9, 26).addBox(-3.0F, -10.0F, -19.0F, 1.0F, 4.0F, 5.0F, 0.0F, false);
			bb_main.setTextureOffset(23, 20).addBox(2.0F, -10.0F, -19.0F, 1.0F, 4.0F, 5.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, -11.0F);
			bb_main.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(23, 29).addBox(-1.5F, -8.0F, -10.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(2.0F, 0.0F, -5.0F);
			bb_main.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.4363F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(42, 0).addBox(5.0F, -7.0F, -3.0F, 1.0F, 6.0F, 12.0F, 0.0F, false);
			cube_r2.setTextureOffset(0, 46).addBox(-10.0F, -7.0F, -3.0F, 1.0F, 6.0F, 12.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			bb_main.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(0, 20).addBox(-3.0F, -12.0F, 5.0F, 6.0F, 10.0F, 1.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 0.0F, -11.0F);
			bb_main.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(30, 20).addBox(-1.5F, -7.5F, -11.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}

}
