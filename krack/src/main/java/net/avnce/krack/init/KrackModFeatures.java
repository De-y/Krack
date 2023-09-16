
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.avnce.krack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.avnce.krack.world.features.HeathenvillaFeature;
import net.avnce.krack.KrackMod;

@Mod.EventBusSubscriber
public class KrackModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, KrackMod.MODID);
	public static final RegistryObject<Feature<?>> HEATHENVILLA = REGISTRY.register("heathenvilla", HeathenvillaFeature::new);
}
