 package com.stabilizerking.stabxmodernguns.client.render.gun.model;
 
 import com.mojang.blaze3d.vertex.PoseStack;
 import com.mrcrayfish.guns.client.render.gun.IOverrideModel;
 import com.mrcrayfish.guns.client.util.RenderUtil;
 import com.stabilizerking.stabxmodernguns.client.SpecialModels;
 import net.minecraft.client.Minecraft;
 import net.minecraft.client.renderer.MultiBufferSource;
 import net.minecraft.client.renderer.block.model.ItemTransforms;
 import net.minecraft.world.entity.LivingEntity;
 import net.minecraft.world.item.ItemCooldowns;
 import net.minecraft.world.item.ItemStack;
 
 
 
 
 
 
 
 public class AWMRifleModel
   implements IOverrideModel
 {
   public void render(float partialTicks, ItemTransforms.TransformType transformType, ItemStack stack, ItemStack parent, LivingEntity entity, PoseStack matrixStack, MultiBufferSource buffer, int light, int overlay) {
     RenderUtil.renderModel(SpecialModels.ARTIC_WARFARE_MAGNUM.getModel(), stack, matrixStack, buffer, light, overlay);
 
     
     matrixStack.pushPose();
     
     matrixStack.translate(0.0D, -0.3625D, 0.0D);
     
     ItemCooldowns tracker = (Minecraft.getInstance()).player.getCooldowns();
     float cooldown = tracker.getCooldownPercent(stack.getItem(), Minecraft.getInstance().getFrameTime());
     cooldown = (float)ease(cooldown);
 
 
 
 
 
 
     
     matrixStack.translate(0.0D, 0.0D, (cooldown / 10.0F));
     matrixStack.translate(0.0D, 0.3625D, 0.0D);
 
     
     RenderUtil.renderModel(SpecialModels.ARTIC_WARFARE_MAGNUM_BOLT_CHAMBER.getModel(), stack, matrixStack, buffer, light, overlay);
     RenderUtil.renderModel(SpecialModels.ARTIC_WARFARE_MAGNUM_BOLT.getModel(), stack, matrixStack, buffer, light, overlay);
 
     
     matrixStack.popPose();
   }
 
   
   private double ease(double x) {
     return 1.0D - Math.pow(1.0D - 2.0D * x, 4.0D);
   }
 }


