package org.FarAwayCraft.effects;

import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.effect.DamageModifierStatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import org.FarAwayCraft.FarAwayCraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import org.jetbrains.annotations.Nullable;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class PenetrationStatusEffect extends StatusEffect {

//    protected PenetrationStatusEffect() {
//        super(StatusEffectCategory.BENEFICIAL, 16762624, 0);
//    }
//
//    @Override
//    public double adjustModifierAmount(int amplifier, EntityAttributeModifier modifier) {
//        modifier.
//        return super.adjustModifierAmount(amplifier, modifier);
//    }


    public PenetrationStatusEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0x56789A);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // In our case, we just make it return true so that it applies the status effect every tick.
        return true;
    }

//    @Override
//    public void applyInstantEffect(@Nullable Entity source, @Nullable Entity attacker, LivingEntity target, int amplifier, double proximity) {
//        if (source != null) {
//            FarAwayCraft.LOGGER.debug(source.getEntityName());
//        }
//        if (attacker != null) {
//            FarAwayCraft.LOGGER.debug(attacker.getEntityName());
//        }
//        FarAwayCraft.LOGGER.debug(target.getEntityName());
//
//        if (source != null && attacker instanceof PlayerEntity) {
//            target.damage(target.getDamageSources().playerAttack(((PlayerEntity) attacker)), 2);
//        }
//    }


    private int attackTimer = 0;

//    @Override
//    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
//
//        DamageTypes.
//
//        if (attackTimer != 0) {
//            attackTimer--;
//            entity.setAttacking(null);
//            return;
//        }
//
//        var target = entity.getAttacking();
//
//        if (target != null) {
//            FarAwayCraft.LOGGER.warn("DEBUG target: " + target.getEntityName());
//            var damageInHand = entity.getAttributeValue(EntityAttributes.GENERIC_ATTACK_DAMAGE);
//            var defensePoints = target.getAttributeValue(EntityAttributes.GENERIC_ARMOR);
//            var toughness = target.getAttributeValue(EntityAttributes.GENERIC_ARMOR_TOUGHNESS);
//            var damage = (float) (damageInHand * ( 1 - (min(20, max((defensePoints / 5), defensePoints - ((4 * damageInHand)/ (toughness + 8)))) / 25)));
//            var resultDamage = (float) (damageInHand - damage);
////            FarAwayCraft.LOGGER.warn("DEBUG damageInHand: " + damageInHand);
////            FarAwayCraft.LOGGER.warn("DEBUG defensePoints: " + defensePoints);
////            FarAwayCraft.LOGGER.warn("DEBUG toughness: " + toughness);
////            FarAwayCraft.LOGGER.warn("DEBUG damage: " + damage);
////            FarAwayCraft.LOGGER.warn("DEBUG resultDamage: " + resultDamage);
//            target.damage(target.getDamageSources().magic(), resultDamage);
//            entity.setAttacking(null);
//            attackTimer = 10;
//        } else {
//            FarAwayCraft.LOGGER.warn("DEBUG: null");
//        }
//    }

//    @Override
//    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
////        super.onApplied(entity, attributes, amplifier);
//        var a = (PlayerEntity) entity;
//        a.getDamageTracker().
//    }

    @Override
    public String toString() {
        return "penetration";
    }
}
