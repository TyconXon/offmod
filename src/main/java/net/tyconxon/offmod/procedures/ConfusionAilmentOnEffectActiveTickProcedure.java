package net.tyconxon.offmod.procedures;

import net.tyconxon.offmod.OffmodMod;

import net.minecraft.util.Hand;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

public class ConfusionAilmentOnEffectActiveTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OffmodMod.LOGGER.warn("Failed to load dependency entity for procedure ConfusionAilmentOnEffectActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (Math.random() <= 0.1) {
			if (Math.random() < 0.7) {
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
				}
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.2) {
							entity.setMotion(Math.random(), Math.random(), Math.random());
						} else {
							entity.setSprinting((true));
						}
					} else {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 500, (int) 3, (false), (false)));
					}
				} else {
					entity.setSneaking((true));
				}
			} else {
				entity.rotationYaw = (float) ((Math.random() * 100));
				entity.setRenderYawOffset(entity.rotationYaw);
				entity.prevRotationYaw = entity.rotationYaw;
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
					((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
					((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
				}
				entity.rotationPitch = (float) ((Math.random() * 100));
			}
		}
	}
}
