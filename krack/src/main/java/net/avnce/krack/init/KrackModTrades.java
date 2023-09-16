
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.avnce.krack.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class KrackModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == KrackModVillagerProfessions.BANKER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 48),

					new ItemStack(Items.DIAMOND, 4), 7, 8, 0.09f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(KrackModItems.MORROCONITE.get(), 4),

					new ItemStack(Items.EMERALD), 10, 5, 0.05f));
		}
		if (event.getType() == KrackModVillagerProfessions.BANKER.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.DIAMOND, 48), new ItemStack(Items.NETHERITE_INGOT), 10, 5, 0.05f));
		}
		if (event.getType() == KrackModVillagerProfessions.DEALER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(KrackModItems.SECRETFOODITEM.get(), 8), 10, 5, 0.05f));
		}
	}
}
