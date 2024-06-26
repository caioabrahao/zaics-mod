package com.zaicoba;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class zaicsMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("zaicsmod");

	public static final Item TEA_BAG =
			Registry.register(Registries.ITEM, new Identifier("zaicsmod", "tea_bag"),
					new Item(new Item.Settings().maxCount(48)));

	public class TeaBag extends Item{
		public TeaBag(Settings settings) {
			super(settings);
		}

	}

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		FuelRegistry.INSTANCE.add(TEA_BAG, 900);
	}


}