package com.usefulstacks;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.Identifier;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UsefulStacks implements ModInitializer {
	public static final String MOD_ID = "useful-stacks";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Item[] stackTo64 = {
				Items.SUSPICIOUS_STEW,
				Items.MUSHROOM_STEW,
				Items.RABBIT_STEW,
				Items.BEETROOT_SOUP,
				//
				Items.OAK_SIGN,
				Items.OAK_HANGING_SIGN,
				Items.SPRUCE_SIGN,
				Items.SPRUCE_HANGING_SIGN,
				Items.BIRCH_SIGN,
				Items.BIRCH_HANGING_SIGN,
				Items.JUNGLE_SIGN,
				Items.JUNGLE_HANGING_SIGN,
				Items.ACACIA_SIGN,
				Items.ACACIA_HANGING_SIGN,
				Items.CHERRY_SIGN,
				Items.CHERRY_HANGING_SIGN,
				Items.DARK_OAK_SIGN,
				Items.DARK_OAK_HANGING_SIGN,
				Items.PALE_OAK_SIGN,
				Items.PALE_OAK_HANGING_SIGN,
				Items.MANGROVE_SIGN,
				Items.MANGROVE_HANGING_SIGN,
				Items.BAMBOO_SIGN,
				Items.BAMBOO_HANGING_SIGN,
				Items.CRIMSON_SIGN,
				Items.CRIMSON_HANGING_SIGN,
				Items.WARPED_SIGN,
				Items.WARPED_HANGING_SIGN,
				//
				Items.SNOWBALL,
				//
				Items.EGG,
				Items.BLUE_EGG,
				Items.BROWN_EGG,
				//
				Items.ENDER_PEARL,
				//
				Items.HONEY_BOTTLE,
		};
		Item[] stackTo16 = {
				Items.SADDLE,
				//
				Items.WHITE_HARNESS,
				Items.BLACK_HARNESS,
				Items.BLUE_HARNESS,
				Items.BROWN_HARNESS,
				Items.CYAN_HARNESS,
				Items.GRAY_HARNESS,
				Items.GREEN_HARNESS,
				Items.LIGHT_BLUE_HARNESS,
				Items.LIGHT_GRAY_HARNESS,
				Items.LIME_HARNESS,
				Items.MAGENTA_HARNESS,
				Items.ORANGE_HARNESS,
				Items.PINK_HARNESS,
				Items.PURPLE_HARNESS,
				Items.RED_HARNESS,
				Items.YELLOW_HARNESS,
				//
				Items.BIRCH_BOAT,
				Items.BIRCH_CHEST_BOAT,
				Items.ACACIA_BOAT,
				Items.ACACIA_CHEST_BOAT,
				Items.CHERRY_BOAT,
				Items.CHERRY_CHEST_BOAT,
				Items.DARK_OAK_BOAT,
				Items.DARK_OAK_CHEST_BOAT,
				Items.JUNGLE_BOAT,
				Items.JUNGLE_CHEST_BOAT,
				Items.MANGROVE_BOAT,
				Items.MANGROVE_CHEST_BOAT,
				Items.OAK_BOAT,
				Items.OAK_CHEST_BOAT,
				Items.PALE_OAK_BOAT,
				Items.PALE_OAK_CHEST_BOAT,
				Items.SPRUCE_BOAT,
				Items.SPRUCE_CHEST_BOAT,
				Items.MINECART,
				Items.CHEST_MINECART,
				Items.FURNACE_MINECART,
				Items.TNT_MINECART,
				Items.HOPPER_MINECART,
				Items.COMMAND_BLOCK_MINECART,
				Items.BAMBOO_RAFT,
				Items.BAMBOO_CHEST_RAFT,
				//
				Items.WATER_BUCKET,
				Items.LAVA_BUCKET,
				Items.POWDER_SNOW_BUCKET,
				Items.MILK_BUCKET,
				Items.PUFFERFISH_BUCKET,
				Items.SALMON_BUCKET,
				Items.COD_BUCKET,
				Items.TROPICAL_FISH_BUCKET,
				Items.AXOLOTL_BUCKET,
				Items.TADPOLE_BUCKET,
				//
				Items.SPYGLASS,
				Items.CAKE,
				Items.WHITE_BED,
				Items.BLACK_BED,
				Items.BROWN_BED,
				Items.BLUE_BED,
				Items.CYAN_BED,
				Items.GRAY_BED,
				Items.GREEN_BED,
				Items.LIGHT_BLUE_BED,
				Items.LIGHT_GRAY_BED,
				Items.LIME_BED,
				Items.MAGENTA_BED,
				Items.ORANGE_BED,
				Items.PINK_BED,
				Items.PURPLE_BED,
				Items.RED_BED,
				Items.YELLOW_BED,
				//
				Items.POTION,
				Items.SPLASH_POTION,
				Items.LINGERING_POTION,
				//
				Items.TOTEM_OF_UNDYING,
				//
				Items.ENCHANTED_BOOK,
				//
				Items.MUSIC_DISC_13,
				Items.MUSIC_DISC_CAT,
				Items.MUSIC_DISC_BLOCKS,
				Items.MUSIC_DISC_CHIRP,
				Items.MUSIC_DISC_CREATOR,
				Items.MUSIC_DISC_CREATOR_MUSIC_BOX,
				Items.MUSIC_DISC_FAR,
				Items.MUSIC_DISC_LAVA_CHICKEN,
				Items.MUSIC_DISC_MALL,
				Items.MUSIC_DISC_MELLOHI,
				Items.MUSIC_DISC_STAL,
				Items.MUSIC_DISC_STRAD,
				Items.MUSIC_DISC_WARD,
				Items.MUSIC_DISC_11,
				Items.MUSIC_DISC_WAIT,
				Items.MUSIC_DISC_OTHERSIDE,
				Items.MUSIC_DISC_RELIC,
				Items.MUSIC_DISC_5,
				Items.MUSIC_DISC_PIGSTEP,
				Items.MUSIC_DISC_PRECIPICE,
				Items.MUSIC_DISC_TEARS,
				//
				Items.FLOWER_BANNER_PATTERN,
				Items.CREEPER_BANNER_PATTERN,
				Items.SKULL_BANNER_PATTERN,
				Items.MOJANG_BANNER_PATTERN,
				Items.GLOBE_BANNER_PATTERN,
				Items.PIGLIN_BANNER_PATTERN,
				Items.FLOW_BANNER_PATTERN,
				Items.GUSTER_BANNER_PATTERN,
				Items.FIELD_MASONED_BANNER_PATTERN,
				Items.BORDURE_INDENTED_BANNER_PATTERN,
				//
				Items.GOAT_HORN,
				//
				Items.LEATHER_HORSE_ARMOR,
				Items.COPPER_HORSE_ARMOR,
				Items.IRON_HORSE_ARMOR,
				Items.GOLDEN_HORSE_ARMOR,
				Items.DIAMOND_HORSE_ARMOR,
				Items.NETHERITE_HORSE_ARMOR,
				//
				Items.COPPER_NAUTILUS_ARMOR,
				Items.IRON_NAUTILUS_ARMOR,
				Items.GOLDEN_NAUTILUS_ARMOR,
				Items.DIAMOND_NAUTILUS_ARMOR,
				Items.NETHERITE_NAUTILUS_ARMOR,
				//
				Items.WOLF_ARMOR,
		};

		DefaultItemComponentEvents.MODIFY.register(context -> {
			for (var item : stackTo16) {
				context.modify(item, builder -> {
					builder.set(DataComponents.MAX_STACK_SIZE, 16);
				});
			}
		});
		DefaultItemComponentEvents.MODIFY.register(context -> {
			for (var item : stackTo64) {
				context.modify(item, builder -> {
					builder.set(DataComponents.MAX_STACK_SIZE, 64);
				});
			}
		});

		//DefaultItemComponentEvents.MODIFY.register(context -> {
		//	context.modify(Items.SADDLE, builder -> {
		//		builder.set(DataComponents.MAX_STACK_SIZE, 16);
		//	});
		//});

		LOGGER.info("Initialized Useful Stacks Mod!");
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
