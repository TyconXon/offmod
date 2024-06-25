package net.tyconxon.offmod.procedures;

import net.tyconxon.offmod.OffmodMod;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

public class BurntEntityShakingConditionProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OffmodMod.LOGGER.warn("Failed to load dependency entity for procedure BurntEntityShakingCondition!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof LivingEntity) ? (entity.hasNoGravity()) : false) {
			return true;
		}
		return false;
	}
}
