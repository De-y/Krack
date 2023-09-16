
package net.avnce.krack.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDisc15Item extends RecordItem {
	public MusicDisc15Item() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 100);
	}
}
