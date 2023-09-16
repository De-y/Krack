
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.avnce.krack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.avnce.krack.block.HeathenPortalBlock;
import net.avnce.krack.block.ChemistryBlockBlock;
import net.avnce.krack.KrackMod;

public class KrackModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, KrackMod.MODID);
	public static final RegistryObject<Block> CHEMISTRY_BLOCK = REGISTRY.register("chemistry_block", () -> new ChemistryBlockBlock());
	public static final RegistryObject<Block> HEATHEN_PORTAL = REGISTRY.register("heathen_portal", () -> new HeathenPortalBlock());
}
