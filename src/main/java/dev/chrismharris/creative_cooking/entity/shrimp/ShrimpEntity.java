package dev.chrismharris.creative_cooking.entity.shrimp;

import dev.chrismharris.creative_cooking.register.ItemRegister;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.animal.AbstractSchoolingFish;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class ShrimpEntity extends AbstractSchoolingFish {

    public ShrimpEntity(EntityType<ShrimpEntity> entityType, Level level) {
        super(entityType, level);
    }

    public int getMaxSchoolSize() {
        return 10;
    }

    public @NotNull ItemStack getBucketItemStack() {
        return new ItemStack(ItemRegister.SHRIMP_SPAWN_EGG.get());
    }

    public static AttributeSupplier setAttributes() {
        return AbstractSchoolingFish.createMobAttributes().build();
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.SALMON_AMBIENT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.SALMON_DEATH;
    }

    protected SoundEvent getHurtSound(@NotNull DamageSource damageSource) {
        return SoundEvents.SALMON_HURT;
    }

    protected @NotNull SoundEvent getFlopSound() {
        return SoundEvents.SALMON_FLOP;
    }
}
