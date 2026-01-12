package net.mcreator.takiniteasy.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class WoodClubItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 8, 2f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("takiniteasy:wood_club_repair_items")));

	public WoodClubItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 2f, -2f));
	}
}