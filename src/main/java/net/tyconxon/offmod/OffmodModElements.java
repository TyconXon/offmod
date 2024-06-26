/*
 *    MCreator note:
 *
 *    This file is autogenerated to connect all MCreator mod elements together.
 *
 */
package net.tyconxon.offmod;

import net.minecraftforge.forgespi.language.ModFileScanData;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.block.Block;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class OffmodModElements {
	public final List<ModElement> elements = new ArrayList<>();
	public final List<Supplier<Block>> blocks = new ArrayList<>();
	public final List<Supplier<Item>> items = new ArrayList<>();
	public final List<Supplier<EntityType<?>>> entities = new ArrayList<>();
	public final List<Supplier<Enchantment>> enchantments = new ArrayList<>();
	public static Map<ResourceLocation, net.minecraft.util.SoundEvent> sounds = new HashMap<>();

	public OffmodModElements() {
		sounds.put(new ResourceLocation("offmod", "itemuse"), new net.minecraft.util.SoundEvent(new ResourceLocation("offmod", "itemuse")));
		sounds.put(new ResourceLocation("offmod", "global"), new net.minecraft.util.SoundEvent(new ResourceLocation("offmod", "global")));
		sounds.put(new ResourceLocation("offmod", "strike"), new net.minecraft.util.SoundEvent(new ResourceLocation("offmod", "strike")));
		sounds.put(new ResourceLocation("offmod", "cash_register"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("offmod", "cash_register")));
		sounds.put(new ResourceLocation("offmod", "robotstep"), new net.minecraft.util.SoundEvent(new ResourceLocation("offmod", "robotstep")));
		sounds.put(new ResourceLocation("offmod", "error"), new net.minecraft.util.SoundEvent(new ResourceLocation("offmod", "error")));
		sounds.put(new ResourceLocation("offmod", "cowextract"), new net.minecraft.util.SoundEvent(new ResourceLocation("offmod", "cowextract")));
		sounds.put(new ResourceLocation("offmod", "womp"), new net.minecraft.util.SoundEvent(new ResourceLocation("offmod", "womp")));
		sounds.put(new ResourceLocation("offmod", "hylicshit"), new net.minecraft.util.SoundEvent(new ResourceLocation("offmod", "hylicshit")));
		sounds.put(new ResourceLocation("offmod", "hylicsspeech"), new net.minecraft.util.SoundEvent(new ResourceLocation("offmod", "hylicsspeech")));
		sounds.put(new ResourceLocation("offmod", "hylicsvuln"), new net.minecraft.util.SoundEvent(new ResourceLocation("offmod", "hylicsvuln")));
		sounds.put(new ResourceLocation("offmod", "hylicsshaker"), new net.minecraft.util.SoundEvent(new ResourceLocation("offmod", "hylicsshaker")));
		sounds.put(new ResourceLocation("offmod", "hylicspoolwine"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("offmod", "hylicspoolwine")));
		sounds.put(new ResourceLocation("offmod", "hylicscharge"), new net.minecraft.util.SoundEvent(new ResourceLocation("offmod", "hylicscharge")));
		sounds.put(new ResourceLocation("offmod", "hylicsphone"), new net.minecraft.util.SoundEvent(new ResourceLocation("offmod", "hylicsphone")));
		sounds.put(new ResourceLocation("offmod", "hylicscream"), new net.minecraft.util.SoundEvent(new ResourceLocation("offmod", "hylicscream")));
		try {
			ModFileScanData modFileInfo = ModList.get().getModFileById("offmod").getFile().getScanResult();
			Set<ModFileScanData.AnnotationData> annotations = modFileInfo.getAnnotations();
			for (ModFileScanData.AnnotationData annotationData : annotations) {
				if (annotationData.getAnnotationType().getClassName().equals(ModElement.Tag.class.getName())) {
					Class<?> clazz = Class.forName(annotationData.getClassType().getClassName());
					if (clazz.getSuperclass() == OffmodModElements.ModElement.class)
						elements.add((OffmodModElements.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(OffmodModElements.ModElement::initElements);
	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		for (Map.Entry<ResourceLocation, net.minecraft.util.SoundEvent> sound : sounds.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}

	private int messageID = 0;

	public <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, PacketBuffer> encoder, Function<PacketBuffer, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		OffmodMod.PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	public List<ModElement> getElements() {
		return elements;
	}

	public List<Supplier<Block>> getBlocks() {
		return blocks;
	}

	public List<Supplier<Item>> getItems() {
		return items;
	}

	public List<Supplier<EntityType<?>>> getEntities() {
		return entities;
	}

	public List<Supplier<Enchantment>> getEnchantments() {
		return enchantments;
	}

	public static class ModElement implements Comparable<ModElement> {
		@Retention(RetentionPolicy.RUNTIME)
		public @interface Tag {
		}

		protected final OffmodModElements elements;
		protected final int sortid;

		public ModElement(OffmodModElements elements, int sortid) {
			this.elements = elements;
			this.sortid = sortid;
		}

		public void initElements() {
		}

		public void init(FMLCommonSetupEvent event) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		@OnlyIn(Dist.CLIENT)
		public void clientLoad(FMLClientSetupEvent event) {
		}

		@Override
		public int compareTo(ModElement other) {
			return this.sortid - other.sortid;
		}
	}
}
