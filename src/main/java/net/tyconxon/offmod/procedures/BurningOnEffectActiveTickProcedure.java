package net.tyconxon.offmod.procedures;

import net.tyconxon.offmod.OffmodMod;

import net.minecraft.entity.Entity;

import java.util.Map;

public class BurningOnEffectActiveTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OffmodMod.LOGGER.warn("Failed to load dependency entity for procedure BurningOnEffectActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 3);
	}
}
