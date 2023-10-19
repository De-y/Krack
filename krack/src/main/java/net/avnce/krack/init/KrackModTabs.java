
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.avnce.krack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.avnce.krack.KrackMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KrackModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KrackMod.MODID);
	public static final RegistryObject<CreativeModeTab> CRACK = REGISTRY.register("crack",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.krack.crack")).icon(() -> new ItemStack(Items.LAVA_BUCKET)).displayItems((parameters, tabData) -> {
				tabData.accept(KrackModItems.MORROCANAXE.get());
				tabData.accept(KrackModItems.COCACOLA.get());
				tabData.accept(KrackModItems.SECRETFOODITEM.get());
				tabData.accept(KrackModItems.BOW_OF_GOD.get());
				tabData.accept(KrackModBlocks.CHEMISTRY_BLOCK.get().asItem());
				tabData.accept(KrackModItems.MONEY.get());
				tabData.accept(KrackModItems.LAVA_ARMOR_HELMET.get());
				tabData.accept(KrackModItems.LAVA_ARMOR_LEGGINGS.get());
				tabData.accept(KrackModItems.LAVA_ARMOR_BOOTS.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(KrackModItems.MUSIC_DISC_14.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(KrackModItems.DAGGEROFDEATH.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(KrackModItems.WANDERER_SPAWN_EGG.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(KrackModItems.VIALOFDEATH.get());
			tabData.accept(KrackModItems.MORROCONITE.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(KrackModItems.HEATHEN.get());
		}
	}
}
