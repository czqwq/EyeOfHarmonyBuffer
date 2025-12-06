package com.EyeOfHarmonyBuffer.Mixins.Accessor.GodOfForgeModule;

import gregtech.api.util.GTRecipe;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import tectech.thing.metaTileEntity.multi.godforge.MTEExoticModule;

@Mixin(value = MTEExoticModule.class, remap = false)
public interface MTEExoticModuleAccessor {

    @Invoker("generateMagmatterRecipe")
    GTRecipe invokeGenerateMagmatterRecipe();

    @Invoker("generateQuarkGluonRecipe")
    GTRecipe invokeGenerateQuarkGluonRecipe();
}
