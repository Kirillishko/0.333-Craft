package org.FarAwayCraft.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import org.FarAwayCraft.FarAwayCraft;
import org.FarAwayCraft.effects.EffectsLoader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Objects;

import static java.lang.Math.max;
import static java.lang.Math.min;

@Mixin(PlayerEntity.class)
//@Mixin(LivingEntity.class)
public class A {
    @Inject(at = @At("HEAD"), method = "attack")
    private void attackThroughArmor(Entity target, CallbackInfo info) {
        var player = (PlayerEntity) (Object) this;
        var isEnemy = target instanceof LivingEntity;
        FarAwayCraft.LOGGER.warn("DEBUG player: " + player.getName());
        FarAwayCraft.LOGGER.warn("DEBUG player.hasStatusEffect(penetration): " + player.hasStatusEffect(StatusEffects.SPEED));
        FarAwayCraft.LOGGER.warn("DEBUG isEnemy: " + isEnemy);

        if (player.hasStatusEffect(EffectsLoader.Penetration) && target instanceof LivingEntity enemy) {
            FarAwayCraft.LOGGER.warn("DEBUG target: " + target.getEntityName());
            var health = enemy.getHealth();
            var a = player.getInventory().getMainHandStack();
            FarAwayCraft.LOGGER.warn("DEBUG a: " + a.getItem().getName().toString());
            var b = a.getItem().getAttributeModifiers(EquipmentSlot.MAINHAND);
            FarAwayCraft.LOGGER.warn("DEBUG b: " + b.get(EntityAttributes.GENERIC_ATTACK_DAMAGE).toString());
            var damageInHand = 1;


            b.get(EntityAttributes.GENERIC_ATTACK_DAMAGE);

            for (var value: b.get(EntityAttributes.GENERIC_ATTACK_DAMAGE)) {
                if (Objects.equals(value.getName(), "Weapon modifier")) {
                    damageInHand += (int) value.getValue();
                    break;
                }
            }

            FarAwayCraft.LOGGER.warn("DEBUG health: " + health);
            FarAwayCraft.LOGGER.warn("DEBUG damageInHand: " + damageInHand);
            if (damageInHand > health) {
                enemy.setHealth(0);
            } else {
                enemy.setHealth(health - damageInHand);
            }
            target.damage(target.getDamageSources().magic(), 7);
//            FarAwayCraft.LOGGER.warn("DEBUG target: " + target.getEntityName());
//            var damageInHand = player.getAttributeValue(EntityAttributes.GENERIC_ATTACK_DAMAGE);
//            var defensePoints = enemy.getAttributeValue(EntityAttributes.GENERIC_ARMOR);
//            var toughness = enemy.getAttributeValue(EntityAttributes.GENERIC_ARMOR_TOUGHNESS);
//            var damage = (float) (damageInHand * ( 1 - (min(20, max((defensePoints / 5), defensePoints - ((4 * damageInHand)/ (toughness + 8)))) / 25)));
//            var resultDamage = (float) (damageInHand - damage);
//            FarAwayCraft.LOGGER.warn("DEBUG damageInHand: " + damageInHand);
//            FarAwayCraft.LOGGER.warn("DEBUG defensePoints: " + defensePoints);
//            FarAwayCraft.LOGGER.warn("DEBUG toughness: " + toughness);
//            FarAwayCraft.LOGGER.warn("DEBUG damage: " + damage);
//            FarAwayCraft.LOGGER.warn("DEBUG resultDamage: " + resultDamage);
//            target.damage(target.getDamageSources().playerAttack(player), (float) 7);
        }
    }
}