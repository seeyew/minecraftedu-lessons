package com.minecraftedu.students;

import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockBreakMessage {

	@SubscribeEvent
	public void sendMessage(BreakEvent event) {
		event.getPlayer()
				.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + getCustomMessage()));
	}
	
	public String getCustomMessage() {
		  String message = "My first minecraft mod";
		  return message;
	}

}
