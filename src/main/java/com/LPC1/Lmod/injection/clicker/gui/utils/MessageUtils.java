package com.LPC1.Lmod.injection.clicker.gui.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;

public class MessageUtils {
    public static void sendMessage(String message, boolean Tag) {
        Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("[LMOD]: " + message));
    }
}
