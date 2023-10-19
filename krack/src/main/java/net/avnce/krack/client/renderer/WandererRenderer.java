
package net.avnce.krack.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import net.avnce.krack.entity.WandererEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class WandererRenderer extends MobRenderer<WandererEntity, VillagerModel<WandererEntity>> {
	public WandererRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
	}

	@Override
	protected void scale(WandererEntity villager, PoseStack poseStack, float f) {
		poseStack.scale(0.9375f, 0.9375f, 0.9375f);
	}

	@Override
	public ResourceLocation getTextureLocation(WandererEntity entity) {
		return new ResourceLocation("krack:textures/entities/dealer.png");
	}
}
