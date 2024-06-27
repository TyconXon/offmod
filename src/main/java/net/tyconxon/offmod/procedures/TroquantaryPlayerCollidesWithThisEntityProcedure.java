package net.tyconxon.offmod.procedures;

import net.tyconxon.offmod.potion.VulnerablePotionEffect;
import net.tyconxon.offmod.OffmodMod;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

public class TroquantaryPlayerCollidesWithThisEntityProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				OffmodMod.LOGGER.warn("Failed to load dependency sourceentity for procedure TroquantaryPlayerCollidesWithThisEntity!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (Math.random() < 0.7) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(VulnerablePotionEffect.potion, (int) 60, (int) 1));
		}
	}
}
