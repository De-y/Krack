
package net.avnce.krack.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.avnce.krack.procedures.HighEffectStartedappliedProcedure;

public class HighMobEffect extends MobEffect {
	public HighMobEffect() {
		super(MobEffectCategory.HARMFUL, -37618);
	}

	@Override
	public String getDescriptionId() {
		return "effect.krack.high";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		HighEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
