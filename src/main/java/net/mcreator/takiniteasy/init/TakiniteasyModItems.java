/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.takiniteasy.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.takiniteasy.item.*;
import net.mcreator.takiniteasy.TakiniteasyMod;

import java.util.function.Function;

public class TakiniteasyModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(TakiniteasyMod.MODID);
	public static final DeferredItem<Item> OAK_BARK;
	public static final DeferredItem<Item> BIRCH_BARK;
	public static final DeferredItem<Item> CHERRY_BARK;
	public static final DeferredItem<Item> MANGROVE_BARK;
	public static final DeferredItem<Item> JUNGLE_BARK;
	public static final DeferredItem<Item> DARK_OAK_BARK;
	public static final DeferredItem<Item> SPRUCE_BARK;
	public static final DeferredItem<Item> ACACIA_BARK;
	public static final DeferredItem<Item> TREE_SAP;
	public static final DeferredItem<Item> TREE_SAP_SYRUP;
	public static final DeferredItem<Item> WOOD_CLUB;
	public static final DeferredItem<Item> ROCK;
	static {
		OAK_BARK = register("oak_bark", OakBarkItem::new);
		BIRCH_BARK = register("birch_bark", BirchBarkItem::new);
		CHERRY_BARK = register("cherry_bark", CherryBarkItem::new);
		MANGROVE_BARK = register("mangrove_bark", MangroveBarkItem::new);
		JUNGLE_BARK = register("jungle_bark", JungleBarkItem::new);
		DARK_OAK_BARK = register("dark_oak_bark", DarkOakBarkItem::new);
		SPRUCE_BARK = register("spruce_bark", SpruceBarkItem::new);
		ACACIA_BARK = register("acacia_bark", AcaciaBarkItem::new);
		TREE_SAP = register("tree_sap", TreeSapItem::new);
		TREE_SAP_SYRUP = register("tree_sap_syrup", TreeSapSyrupItem::new);
		WOOD_CLUB = register("wood_club", WoodClubItem::new);
		ROCK = register("rock", RockItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}