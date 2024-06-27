package net.tyconxon.offmod.procedures;

import net.tyconxon.offmod.OffmodMod;

import net.minecraft.world.World;
import net.minecraft.entity.projectile.SmallFireballEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.DamagingProjectileEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;

import java.util.Map;

public class PKFireRightclickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OffmodMod.LOGGER.warn("Failed to load dependency entity for procedure PKFireRightclicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (Math.random() < 0.7) {
			{
				Entity _shootFrom = entity;
				World projectileLevel = _shootFrom.world;
				if (!projectileLevel.isRemote()) {
					ProjectileEntity _entityToSpawn = new Object() {
						public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback, byte piercing) {
							AbstractArrowEntity entityToSpawn = new ArrowEntity(EntityType.ARROW, world);
							entityToSpawn.setShooter(shooter);
							entityToSpawn.setDamage(damage);
							entityToSpawn.setKnockbackStrength(knockback);

							entityToSpawn.setPierceLevel(piercing);
							entityToSpawn.setFire(100);

							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, 1, 0, (byte) 3);
					_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1, _shootFrom.getPosZ());
					_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y, _shootFrom.getLookVec().z, 3, 0);
					projectileLevel.addEntity(_entityToSpawn);
				}
			}
		}
		{
			Entity _shootFrom = entity;
			World projectileLevel = _shootFrom.world;
			if (!projectileLevel.isRemote()) {
				ProjectileEntity _entityToSpawn = new Object() {
					public ProjectileEntity getFireball(World world, Entity shooter, double ax, double ay, double az) {
						DamagingProjectileEntity entityToSpawn = new SmallFireballEntity(EntityType.SMALL_FIREBALL, world);
						entityToSpawn.setShooter(shooter);
						entityToSpawn.accelerationX = ax;
						entityToSpawn.accelerationY = ay;
						entityToSpawn.accelerationZ = az;
						return entityToSpawn;
					}
				}.getFireball(projectileLevel, entity, (entity.getLookVec().x), (entity.getLookVec().y), (entity.getLookVec().z));
				_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1, _shootFrom.getPosZ());
				_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y, _shootFrom.getLookVec().z, 1, 1);
				projectileLevel.addEntity(_entityToSpawn);
			}
		}
	}
}
