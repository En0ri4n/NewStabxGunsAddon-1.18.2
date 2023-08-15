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
 
 
 
 
 
 public class M4A1Model
   implements IOverrideModel
 {
   public void render(float partialTicks, ItemTransforms.TransformType transformType, ItemStack stack, ItemStack parent, LivingEntity entity, PoseStack matrix, MultiBufferSource renderingbuffer, int light, int overlay) {
     RenderUtil.renderModel(SpecialModels.M4A1.getModel(), stack, matrix, renderingbuffer, light, overlay);
 
     
     if (Gun.getScope(stack) == null) {
       RenderUtil.renderModel(SpecialModels.M4A1_IRONSIGHTS.getModel(), stack, matrix, renderingbuffer, light, overlay);
     } else {
       RenderUtil.renderModel(SpecialModels.M4A1_IRONSIGHTS_MOUNT.getModel(), stack, matrix, renderingbuffer, light, overlay);
     } 
 
     
     if (entity.equals((Minecraft.getInstance()).player)) {
       matrix.pushPose();
       ItemCooldowns tracker = (Minecraft.getInstance()).player.getCooldowns();
       float cooldown = tracker.getCooldownPercent(stack.getItem(), Minecraft.getInstance().getFrameTime());
       cooldown = (float)ease(cooldown);
       matrix.popPose();
     } 
   }
   private double ease(double x) {
     return 1.0D - Math.pow(1.0D - 2.0D * x, 4.0D);
   }
 }


