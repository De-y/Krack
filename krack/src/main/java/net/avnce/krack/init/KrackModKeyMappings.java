
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.avnce.krack.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.avnce.krack.network.DeathMessage;
import net.avnce.krack.network.ClearMessage;
import net.avnce.krack.KrackMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class KrackModKeyMappings {
	public static final KeyMapping DEATH = new KeyMapping("key.krack.death", GLFW.GLFW_KEY_P, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				KrackMod.PACKET_HANDLER.sendToServer(new DeathMessage(0, 0));
				DeathMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping CLEAR = new KeyMapping("key.krack.clear", GLFW.GLFW_KEY_O, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				KrackMod.PACKET_HANDLER.sendToServer(new ClearMessage(0, 0));
				ClearMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(DEATH);
		event.register(CLEAR);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				DEATH.consumeClick();
				CLEAR.consumeClick();
			}
		}
	}
}
