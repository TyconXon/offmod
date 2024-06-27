/**
 * The code of this mod element is always locked.
 *
 * You can register new events in this class too.
 *
 * If you want to make a plain independent class, create it using
 * Project Browser -> New... and make sure to make the class
 * outside net.tyconxon.offmod as this package is managed by MCreator.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
 *
 * This class will be added in the mod root package.
*/
package net.tyconxon.offmod;

import net.tyconxon.offmod.item.BottleOfSmokeItem;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.potion.Potions;
import net.minecraft.potion.Potion;
import net.minecraft.item.Items;
import net.minecraft.item.Item;

import java.lang.reflect.Method;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SmokePurification {
	public SmokePurification() {
		try {
			Class clazz = net.minecraft.potion.PotionBrewing.class;
			Method mth = ObfuscationReflectionHelper.findMethod(clazz, "func_193357_a", Potion.class, Item.class, Potion.class);
			mth.invoke(null, BottleOfSmokeItem.block, Items.WATER_BUCKET, Potions.WATER_BREATHING);
			// To add more recipes, you can copy the line above, for ex.
			// mth.invoke(null, potion2, item2, potion3);
		} catch (Throwable e) {
			System.err.println("ERROR: " + e); // You can change this part
		}
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		new SmokePurification();
	}

	@Mod.EventBusSubscriber
	private static class ForgeBusEvents {
		// Example Forge bus event registration
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
		}

		@OnlyIn(Dist.CLIENT)
		@SubscribeEvent
		public static void clientLoad(FMLClientSetupEvent event) {
		}
	}
}
