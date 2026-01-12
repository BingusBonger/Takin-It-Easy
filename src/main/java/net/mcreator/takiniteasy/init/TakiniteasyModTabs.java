/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.takiniteasy.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.takiniteasy.TakiniteasyMod;

@EventBusSubscriber
public class TakiniteasyModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TakiniteasyMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(TakiniteasyModItems.OAK_BARK.get());
			tabData.accept(TakiniteasyModItems.BIRCH_BARK.get());
			tabData.accept(TakiniteasyModItems.CHERRY_BARK.get());
			tabData.accept(TakiniteasyModItems.MANGROVE_BARK.get());
			tabData.accept(TakiniteasyModItems.JUNGLE_BARK.get());
			tabData.accept(TakiniteasyModItems.DARK_OAK_BARK.get());
			tabData.accept(TakiniteasyModItems.SPRUCE_BARK.get());
			tabData.accept(TakiniteasyModItems.ACACIA_BARK.get());
			tabData.accept(TakiniteasyModItems.ROCK.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(TakiniteasyModItems.TREE_SAP.get());
			tabData.accept(TakiniteasyModItems.TREE_SAP_SYRUP.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(TakiniteasyModItems.WOOD_CLUB.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(TakiniteasyModItems.HARDEND_SAP_PICK.get());
		}
	}
}