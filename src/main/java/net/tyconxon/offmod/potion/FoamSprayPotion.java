
package net.tyconxon.offmod.potion;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.potion.Potion;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FoamSprayPotion {
	@ObjectHolder("offmod:foam_spray")
	public static final Potion potionType = null;

	@SubscribeEvent
	public static void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}

	public static class PotionCustom extends Potion {
		public PotionCustom() {
			super(new EffectInstance(Effects.HEALTH_BOOST, 1600, 2, false, true),
					new EffectInstance(PoisonResistancePotionEffect.potion, 2000, 0, false, true),
					new EffectInstance(Effects.FIRE_RESISTANCE, 2000, 2, false, true));
			setRegistryName("foam_spray");
		}
	}
}
