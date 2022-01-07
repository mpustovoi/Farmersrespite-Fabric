package com.chefsdelights.farmersrespite.utils;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.ApiStatus;

/**
 * References to tags under the C namespace.
 * These tags are generic concepts, meant to be shared with other mods for compatibility.
 */
@Deprecated
@ApiStatus.ScheduledForRemoval
public class CTags {
    public static final Tag.Identified<Item> BREAD = forgeItemTag("bread");
    public static final Tag.Identified<Item> BREAD_WHEAT = forgeItemTag("bread/wheat");

    public static final Tag.Identified<Item> COOKED_BACON = forgeItemTag("cooked_bacon");
    public static final Tag.Identified<Item> COOKED_BEEF = forgeItemTag("cooked_beef");
    public static final Tag.Identified<Item> COOKED_CHICKEN = forgeItemTag("cooked_chicken");
    public static final Tag.Identified<Item> COOKED_PORK = forgeItemTag("cooked_pork");
    public static final Tag.Identified<Item> COOKED_MUTTON = forgeItemTag("cooked_mutton");
    public static final Tag.Identified<Item> COOKED_EGGS = forgeItemTag("cooked_eggs");
    public static final Tag.Identified<Item> COOKED_FISHES = forgeItemTag("cooked_fishes");
    public static final Tag.Identified<Item> COOKED_FISHES_COD = forgeItemTag("cooked_fishes/cod");
    public static final Tag.Identified<Item> COOKED_FISHES_SALMON = forgeItemTag("cooked_fishes/salmon");

    public static final Tag.Identified<Item> CROPS = forgeItemTag("crops");
    public static final Tag.Identified<Item> CROPS_CABBAGE = forgeItemTag("crops/cabbage");
    public static final Tag.Identified<Item> CROPS_ONION = forgeItemTag("crops/onion");
    public static final Tag.Identified<Item> CROPS_RICE = forgeItemTag("crops/rice");
    public static final Tag.Identified<Item> CROPS_TOMATO = forgeItemTag("crops/tomato");

    public static final Tag.Identified<Item> EGGS = forgeItemTag("eggs");

    public static final Tag.Identified<Item> GRAIN = forgeItemTag("grain");
    public static final Tag.Identified<Item> GRAIN_WHEAT = forgeItemTag("grain/wheat");
    public static final Tag.Identified<Item> GRAIN_RICE = forgeItemTag("grain/rice");

    public static final Tag.Identified<Item> MILK = forgeItemTag("milk");
    public static final Tag.Identified<Item> MILK_BUCKET = forgeItemTag("milk/milk");
    public static final Tag.Identified<Item> MILK_BOTTLE = forgeItemTag("milk/milk_bottle");

    public static final Tag.Identified<Item> PASTA = forgeItemTag("pasta");
    public static final Tag.Identified<Item> PASTA_RAW_PASTA = forgeItemTag("pasta/raw_pasta");

    public static final Tag.Identified<Item> RAW_BACON = forgeItemTag("raw_bacon");
    public static final Tag.Identified<Item> RAW_BEEF = forgeItemTag("raw_beef");
    public static final Tag.Identified<Item> RAW_CHICKEN = forgeItemTag("raw_chicken");
    public static final Tag.Identified<Item> RAW_PORK = forgeItemTag("raw_pork");
    public static final Tag.Identified<Item> RAW_MUTTON = forgeItemTag("raw_mutton");
    public static final Tag.Identified<Item> RAW_FISHES = forgeItemTag("raw_fishes");
    public static final Tag.Identified<Item> RAW_FISHES_COD = forgeItemTag("raw_fishes/cod");
    public static final Tag.Identified<Item> RAW_FISHES_SALMON = forgeItemTag("raw_fishes/salmon");
    public static final Tag.Identified<Item> RAW_FISHES_TROPICAL = forgeItemTag("raw_fishes/tropical_fish");

    public static final Tag.Identified<Item> SALAD_INGREDIENTS = forgeItemTag("salad_ingredients");
    public static final Tag.Identified<Item> SALAD_INGREDIENTS_CABBAGE = forgeItemTag("salad_ingredients/cabbage");

    public static final Tag.Identified<Item> SEEDS = forgeItemTag("seeds");
    public static final Tag.Identified<Item> SEEDS_CABBAGE = forgeItemTag("seeds/cabbage");
    public static final Tag.Identified<Item> SEEDS_RICE = forgeItemTag("seeds/rice");
    public static final Tag.Identified<Item> SEEDS_TOMATO = forgeItemTag("seeds/tomato");

    public static final Tag.Identified<Item> VEGETABLES = forgeItemTag("vegetables");
    public static final Tag.Identified<Item> VEGETABLES_BEETROOT = forgeItemTag("vegetables/beetroot");
    public static final Tag.Identified<Item> VEGETABLES_CARROT = forgeItemTag("vegetables/carrot");
    public static final Tag.Identified<Item> VEGETABLES_ONION = forgeItemTag("vegetables/onion");
    public static final Tag.Identified<Item> VEGETABLES_POTATO = forgeItemTag("vegetables/potato");
    public static final Tag.Identified<Item> VEGETABLES_TOMATO = forgeItemTag("vegetables/tomato");

    public static final Tag.Identified<Item> TOOLS = forgeItemTag("tools");
    public static final Tag.Identified<Item> TOOLS_AXES = forgeItemTag("tools/axes");
    public static final Tag.Identified<Item> TOOLS_KNIVES = forgeItemTag("tools/knives");
    public static final Tag.Identified<Item> TOOLS_PICKAXES = forgeItemTag("tools/pickaxes");
    public static final Tag.Identified<Item> TOOLS_SHOVELS = forgeItemTag("tools/shovels");

    private static Tag.Identified<Item> forgeItemTag(String path) {
        return TagFactory.ITEM.create(new Identifier("c", path));
    }
}