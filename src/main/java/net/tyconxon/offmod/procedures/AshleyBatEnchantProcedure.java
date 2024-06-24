package net.tyconxon.offmod.procedures;

import net.tyconxon.offmod.OffmodMod;

import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantment;

import java.util.Map;

public class AshleyBatEnchantProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				OffmodMod.LOGGER.warn("Failed to load dependency itemstack for procedure AshleyBatEnchant!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double chosenLevel = 0;
		chosenLevel = Math.round(5 * Math.random());
		if (Math.round(5 * Math.random()) == 0) {
			chosenLevel = 3;
		}
		{
			Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
			if (_enchantments.containsKey(Enchantments.SMITE)) {
				_enchantments.remove(Enchantments.SMITE);
				EnchantmentHelper.setEnchantments(_enchantments, itemstack);
			}
		}
		(itemstack).addEnchantment(Enchantments.SMITE, (int) chosenLevel);
	}
}
