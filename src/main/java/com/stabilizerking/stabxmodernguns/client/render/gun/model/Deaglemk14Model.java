 package com.stabilizerking.stabxmodernguns.client.render.gun.model;
 
 import com.mojang.blaze3d.vertex.PoseStack;
 import com.mrcrayfish.guns.client.render.gun.IOverrideModel;
 import com.mrcrayfish.guns.client.util.RenderUtil;
 import com.mrcrayfish.guns.common.Gun;
 import com.stabilizerking.stabxmodernguns.client.SpecialModels;
 import net.minecraft.client.Minecraft;
 import net.minecraft.client.renderer.MultiBufferSource;
 import net.minecraft.client.renderer.block.model.ItemTransforms;
 import net.minecraft.world.entity.LivingEntity;
 import net.minecraft.world.item.ItemCooldowns;
 import net.minecraft.world.item.ItemStack;
 
 
 
 
 
 public class Deaglemk14Model
   implements IOverrideModel
 {
   public void render(float partialTicks, ItemTransforms.TransformType transformType, ItemStack stack, ItemStack parent, LivingEntity entity, PoseStack matrix, MultiBufferSource renderingbuffer, int light, int overlay) {
     RenderUtil.renderModel(SpecialModels.DESERT_EAGLE_MARK_14.getModel(), stack, matrix, renderingbuffer, light, overlay);
 
 
 
 
 
     
     if (entity.equals((Minecraft.getInstance()).player)) {
       matrix.pushPose();
       
       ItemCooldowns tracker = (Minecraft.getInstance()).player.getCooldowns();
       float cooldown = tracker.getCooldownPercent(stack.getItem(), Minecraft.getInstance().getFrameTime());
       if (Gun.hasAmmo(stack)) {
         matrix.translate(0.0D, 0.0D, 0.10000000149011612D * (-4.5D * Math.pow(cooldown - 0.5D, 2.0D) + 1.125D));
       } else if (!Gun.hasAmmo(stack)) {
         if (cooldown > 0.5D) {
           matrix.translate(0.0D, 0.0D, 0.1850000023841858D * (-4.5D * Math.pow(cooldown - 0.5D, 2.0D) + 0.5D));
         } else {
           matrix.translate(0.0D, 0.0D, 0.1850000023841858D * (-4.5D * Math.pow(0.0D, 2.0D) + 0.5D));
         } 
       } 
 
       
       RenderUtil.renderModel(SpecialModels.DESERT_EAGLE_MARK_14_SLIDER.getModel(), stack, matrix, renderingbuffer, light, overlay);
       matrix.popPose();
     } 
   }
 }


