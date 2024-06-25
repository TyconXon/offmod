package net.tyconxon.offmod.world;

import net.tyconxon.offmod.OffmodModElements;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.GameRules;

import java.lang.reflect.Method;

@OffmodModElements.ModElement.Tag
public class VulnerablePersistanceGameRule extends OffmodModElements.ModElement {
	public static final GameRules.RuleKey<GameRules.IntegerValue> gamerule = GameRules.register("vulnerablePersistance", GameRules.Category.PLAYER,
			create(1));

	public VulnerablePersistanceGameRule(OffmodModElements instance) {
		super(instance, 63);
	}

	public static GameRules.RuleType<GameRules.IntegerValue> create(int defaultValue) {
		try {
			Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.IntegerValue.class, "func_223559_b", int.class);
			createGameruleMethod.setAccessible(true);
			return (GameRules.RuleType<GameRules.IntegerValue>) createGameruleMethod.invoke(null, defaultValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
