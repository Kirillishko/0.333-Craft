package org.FarAwayCraft.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import org.FarAwayCraft.ModDamageTypes;
import org.FarAwayCraft.effects.EffectsLoader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {
    @Inject(method = "applyArmorToDamage", at = @At("HEAD"), cancellable = true)
    private void injected(DamageSource source, float amount, CallbackInfoReturnable<Float> cir) {
        var attacker = (LivingEntity)source.getAttacker();
        if(attacker != null && attacker.hasStatusEffect(EffectsLoader.Penetration)) cir.setReturnValue(amount);
    }
}

//package org.FarAwayCraft.mixin;
//
//        import net.minecraft.entity.damage.DamageSource;
//        import net.minecraft.entity.player.PlayerEntity;
//        import org.FarAwayCraft.ModDamageTypes;
//        import org.FarAwayCraft.effects.EffectsLoader;
//        import org.spongepowered.asm.mixin.Mixin;
//        import org.spongepowered.asm.mixin.injection.At;
//        import org.spongepowered.asm.mixin.injection.ModifyArg;
//
//@Mixin(PlayerEntity.class)
//public class A {
//    @ModifyArg(method = "attack", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;damage(Lnet/minecraft/entity/damage/DamageSource;F)Z"), index = 0)
//    private DamageSource injected(DamageSource damageSource) {
//        var player = (PlayerEntity) (Object) this;
//        if (player.hasStatusEffect(EffectsLoader.Penetration))
//            return ModDamageTypes.of(player.world, ModDamageTypes.PENETRATION_DAMAGE_TYPE);
//        else
//            return damageSource;
//    }
//}