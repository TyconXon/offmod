package net.tyconxon.offmod.procedures;

import net.tyconxon.offmod.potion.BurningPotionEffect;
import net.tyconxon.offmod.OffmodMod;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.Collection;

public class BurningEffectExpiresProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OffmodMod.LOGGER.warn("Failed to load dependency entity for procedure BurningEffectExpires!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (new Object() {
			int check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == BurningPotionEffect.potion)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check(entity) >= 2) {
			entity.extinguish();
		}
	}
}
