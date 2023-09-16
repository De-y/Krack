
package net.avnce.krack.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.avnce.krack.procedures.HighAlertEffectStartedappliedProcedure;
import net.avnce.krack.procedures.HighAlertEffectExpiresProcedure;

public class HighAlertMobEffect extends MobEffect {
	public HighAlertMobEffect() {
		super(MobEffectCategory.HARMFUL, -26070);
	}

	@Override
	public String getDescriptionId() {
		return "effect.krack.high_alert";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		HighAlertEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		HighAlertEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
