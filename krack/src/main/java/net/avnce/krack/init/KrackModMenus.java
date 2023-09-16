
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.avnce.krack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.avnce.krack.world.inventory.HelloGuiMenu;
import net.avnce.krack.KrackMod;

public class KrackModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, KrackMod.MODID);
	public static final RegistryObject<MenuType<HelloGuiMenu>> HELLO_GUI = REGISTRY.register("hello_gui", () -> IForgeMenuType.create(HelloGuiMenu::new));
}
