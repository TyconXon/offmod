package net.tyconxon.offmod.procedures;

import net.tyconxon.offmod.potion.StunnedPotionEffect;
import net.tyconxon.offmod.OffmodMod;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

public class ManiaEffectExpiresProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OffmodMod.LOGGER.warn("Failed to load dependency entity for procedure ManiaEffectExpires!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(StunnedPotionEffect.potion, (int) 60, (int) 1));
	}
}
