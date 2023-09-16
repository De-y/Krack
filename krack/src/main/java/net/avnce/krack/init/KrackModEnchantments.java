
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.avnce.krack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.avnce.krack.enchantment.CrackedEnchantment;
import net.avnce.krack.KrackMod;

public class KrackModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, KrackMod.MODID);
	public static final RegistryObject<Enchantment> CRACKED = REGISTRY.register("cracked", () -> new CrackedEnchantment());
}
