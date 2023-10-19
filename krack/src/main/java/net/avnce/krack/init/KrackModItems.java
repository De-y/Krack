
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.avnce.krack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.avnce.krack.item.TearsofdeathItem;
import net.avnce.krack.item.TaxreturnsItem;
import net.avnce.krack.item.NecromancerItem;
import net.avnce.krack.item.MusicDisc15Item;
import net.avnce.krack.item.MusicDisc14Item;
import net.avnce.krack.item.MorrocanaxeItem;
import net.avnce.krack.item.MoneyItem;
import net.avnce.krack.item.LockInItem;
import net.avnce.krack.item.LavaArmorItem;
import net.avnce.krack.item.HeathenItem;
import net.avnce.krack.item.CokeItem;
import net.avnce.krack.item.CocacolaItem;
import net.avnce.krack.item.BowOfGodItem;
import net.avnce.krack.KrackMod;

public class KrackModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KrackMod.MODID);
	public static final RegistryObject<Item> DAGGEROFDEATH = REGISTRY.register("daggerofdeath", () -> new NecromancerItem());
	public static final RegistryObject<Item> VIALOFDEATH = REGISTRY.register("vialofdeath", () -> new TearsofdeathItem());
	public static final RegistryObject<Item> MUSIC_DISC_14 = REGISTRY.register("music_disc_14", () -> new MusicDisc14Item());
	public static final RegistryObject<Item> MORROCONITE = REGISTRY.register("morroconite", () -> new LockInItem());
	public static final RegistryObject<Item> MORROCANAXE = REGISTRY.register("morrocanaxe", () -> new MorrocanaxeItem());
	public static final RegistryObject<Item> COCACOLA = REGISTRY.register("cocacola", () -> new CocacolaItem());
	public static final RegistryObject<Item> MUSIC_DISC_15 = REGISTRY.register("music_disc_15", () -> new MusicDisc15Item());
	public static final RegistryObject<Item> SECRETFOODITEM = REGISTRY.register("secretfooditem", () -> new CokeItem());
	public static final RegistryObject<Item> BOW_OF_GOD = REGISTRY.register("bow_of_god", () -> new BowOfGodItem());
	public static final RegistryObject<Item> CHEMISTRY_BLOCK = block(KrackModBlocks.CHEMISTRY_BLOCK);
	public static final RegistryObject<Item> HEATHEN = REGISTRY.register("heathen", () -> new HeathenItem());
	public static final RegistryObject<Item> WANDERER_SPAWN_EGG = REGISTRY.register("wanderer_spawn_egg", () -> new ForgeSpawnEggItem(KrackModEntities.WANDERER, -6723841, -10027162, new Item.Properties()));
	public static final RegistryObject<Item> MONEY = REGISTRY.register("money", () -> new MoneyItem());
	public static final RegistryObject<Item> TAXRETURNS = REGISTRY.register("taxreturns", () -> new TaxreturnsItem());
	public static final RegistryObject<Item> LAVA_ARMOR_HELMET = REGISTRY.register("lava_armor_helmet", () -> new LavaArmorItem.Helmet());
	public static final RegistryObject<Item> LAVA_ARMOR_LEGGINGS = REGISTRY.register("lava_armor_leggings", () -> new LavaArmorItem.Leggings());
	public static final RegistryObject<Item> LAVA_ARMOR_BOOTS = REGISTRY.register("lava_armor_boots", () -> new LavaArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
