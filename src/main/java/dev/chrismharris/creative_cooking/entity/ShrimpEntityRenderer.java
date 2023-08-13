package dev.chrismharris.creative_cooking.entity;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class ShrimpEntityRenderer<T extends ShrimpEntity> extends MobRenderer<T, ShrimpEntityModel<T>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(
            CreativeCookingMod.MOD_ID,
            "textures/entity/shrimp_entity.png"
    );

    public ShrimpEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new ShrimpEntityModel<>(context.bakeLayer(ShrimpEntityModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull T entity) {
        return TEXTURE;
    }
}
