package org.FarAwayCraft.mixin;

import net.minecraft.entity.player.PlayerEntity;
import org.FarAwayCraft.effects.EffectsLoader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {
    @Inject(method="getMovementSpeed", at=@At("HEAD"), cancellable = true)
    public void getMovementSpeed0(CallbackInfoReturnable<Float> cir) {
        var player = (PlayerEntity) (Object) this;

        if(player.hasStatusEffect(EffectsLoader.Immobilization))
            cir.setReturnValue(0f);
    }

    @Inject(method="jump", at=@At("HEAD"), cancellable = true)
    public void prohibitJump(CallbackInfo ci) {
        var player = (PlayerEntity) (Object) this;

        if(player.hasStatusEffect(EffectsLoader.Immobilization))
            ci.cancel();
    }
}
