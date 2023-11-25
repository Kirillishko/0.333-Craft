package org.FarAwayCraft.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import org.FarAwayCraft.FarAwayCraft;
import org.spongepowered.asm.launch.GlobalProperties;
import org.spongepowered.asm.util.Locals;
import oshi.util.GlobalConfig;

public class ImmobilizationEffect extends StatusEffect {

    protected ImmobilizationEffect() {
        super(StatusEffectCategory.HARMFUL, 0x345678);
    }

//    @Override
//    public boolean canApplyUpdateEffect(int duration, int amplifier) {
//        return true;
//    }
//
//    @Override
//    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
//        GlobalConfig.
//        FarAwayCraft.LOGGER.warn("DEBUG Started");
//        FarAwayCraft.LOGGER.warn("DEBUG isClient: " + entity.world.isClient);
//        FarAwayCraft.LOGGER.warn("DEBUG upwardSpeed: " + entity.upwardSpeed);
//
//        if (!entity.world.isClient) {
//            FarAwayCraft.LOGGER.warn("DEBUG Entered");
//            var pos = entity.getPos();
//            entity.teleport(pos.x, pos.y + entity.upwardSpeed, pos.z);
//            entity.setVelocity(0, entity.upwardSpeed, 0);
//        }
//
//        super.applyUpdateEffect(entity, amplifier);
//
////        FarAwayCraft.LOGGER.warn("DEBUG prevSpeed: " + prevSpeed);
////        FarAwayCraft.LOGGER.warn("DEBUG getMovementSpeed: " + entity.getMovementSpeed());
//    }

//    float prevSpeed;
//
//    @Override
//    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
//        FarAwayCraft.LOGGER.warn("DEBUG onApplied");
//        prevSpeed = entity.getMovementSpeed();
//        entity.speed = 0;
//        super.onApplied(entity, attributes, amplifier);
//    }
//
//    @Override
//    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
//        FarAwayCraft.LOGGER.warn("DEBUG onRemoved");
//        entity.setMovementSpeed(prevSpeed);
//        super.onRemoved(entity, attributes, amplifier);
//    }

    @Override
    public String toString() {
        return "immobilization";
    }
}
