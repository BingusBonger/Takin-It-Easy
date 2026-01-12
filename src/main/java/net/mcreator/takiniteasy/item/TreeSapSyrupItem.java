package net.mcreator.takiniteasy.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class TreeSapSyrupItem extends Item {
	public TreeSapSyrupItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(3).saturationModifier(0.3f).build()));
	}
}