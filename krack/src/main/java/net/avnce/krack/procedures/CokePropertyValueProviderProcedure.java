package net.avnce.krack.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class CokePropertyValueProviderProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(15);
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(1);
	}
}
