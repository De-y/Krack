
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.avnce.krack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.avnce.krack.KrackMod;

public class KrackModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, KrackMod.MODID);
	public static final RegistryObject<PaintingVariant> WHAT = REGISTRY.register("what", () -> new PaintingVariant(80, 54));
	public static final RegistryObject<PaintingVariant> YOSHITAXFRAUD = REGISTRY.register("yoshitaxfraud", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> PAYDAY_3 = REGISTRY.register("payday_3", () -> new PaintingVariant(32, 16));
}
