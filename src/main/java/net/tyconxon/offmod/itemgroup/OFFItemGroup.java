
package net.tyconxon.offmod.itemgroup;

import net.tyconxon.offmod.item.AshleyBatItem;
import net.tyconxon.offmod.OffmodModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@OffmodModElements.ModElement.Tag
public class OFFItemGroup extends OffmodModElements.ModElement {
	public OFFItemGroup(OffmodModElements instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("taboff") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AshleyBatItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
