
package net.tyconxon.offmod.itemgroup;

import net.tyconxon.offmod.block.ATMBlock;
import net.tyconxon.offmod.OffmodModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@OffmodModElements.ModElement.Tag
public class EarthboundItemGroup extends OffmodModElements.ModElement {
	public EarthboundItemGroup(OffmodModElements instance) {
		super(instance, 32);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabearthbound") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ATMBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
