
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.avnce.krack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.avnce.krack.KrackMod;

public class KrackModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, KrackMod.MODID);
	public static final RegistryObject<SoundEvent> MUSIC_14 = REGISTRY.register("music_14", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("krack", "music_14")));
	public static final RegistryObject<SoundEvent> COCACOLAESPUMASOUND = REGISTRY.register("cocacolaespumasound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("krack", "cocacolaespumasound")));
}
