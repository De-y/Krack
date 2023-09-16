
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.avnce.krack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.avnce.krack.KrackMod;

public class KrackModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, KrackMod.MODID);
	public static final RegistryObject<Potion> TRANSFER_NETHER_POTION = REGISTRY.register("transfer_nether_potion", () -> new Potion(new MobEffectInstance(KrackModMobEffects.HIGH.get(), 3600, 3, false, true)));
	public static final RegistryObject<Potion> HIGH_ALERT_POTION = REGISTRY.register("high_alert_potion", () -> new Potion(new MobEffectInstance(KrackModMobEffects.HIGH_ALERT.get(), 3601, 3, false, true)));
}
