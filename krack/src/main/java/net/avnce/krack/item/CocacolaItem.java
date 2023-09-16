
package net.avnce.krack.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CocacolaItem extends Item {
	public CocacolaItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(-2).saturationMod(0f).alwaysEat().build()));
	}
}
