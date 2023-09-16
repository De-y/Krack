
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.avnce.krack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.avnce.krack.potion.HighMobEffect;
import net.avnce.krack.potion.HighAlertMobEffect;
import net.avnce.krack.KrackMod;

public class KrackModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, KrackMod.MODID);
	public static final RegistryObject<MobEffect> HIGH = REGISTRY.register("high", () -> new HighMobEffect());
	public static final RegistryObject<MobEffect> HIGH_ALERT = REGISTRY.register("high_alert", () -> new HighAlertMobEffect());
}
