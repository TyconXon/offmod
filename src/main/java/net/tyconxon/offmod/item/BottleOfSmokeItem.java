
package net.tyconxon.offmod.item;

import net.tyconxon.offmod.itemgroup.OFFItemGroup;
import net.tyconxon.offmod.OffmodModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@OffmodModElements.ModElement.Tag
public class BottleOfSmokeItem extends OffmodModElements.ModElement {
	@ObjectHolder("offmod:bottle_of_smoke")
	public static final Item block = null;

	public BottleOfSmokeItem(OffmodModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(OFFItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("bottle_of_smoke");
		}

		@Override
		public boolean hasContainerItem() {
			return true;
		}

		@Override
		public ItemStack getContainerItem(ItemStack itemstack) {
			return new ItemStack(Items.GLASS_BOTTLE);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
