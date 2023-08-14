package dev.chrismharris.creative_cooking.register;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.entity.shrimp.ShrimpEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityRegister {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, CreativeCookingMod.MOD_ID);

    public static final RegistryObject<EntityType<ShrimpEntity>> SHRIMP_ENTITY = ENTITY_TYPES.register(
            "shrimp_entity",
            () -> EntityType.Builder.of(
                    ShrimpEntity::new,
                    MobCategory.WATER_AMBIENT)
                    .sized(10f / 16f, 6f / 16f)
                    .build(
                            new ResourceLocation(CreativeCookingMod.MOD_ID, "shrimp_entity").toString()
                    )
    );

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
