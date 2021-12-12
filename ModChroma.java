package me.beef.mods.impl;

import me.beef.gui.hud.ScreenPosition;
import me.beef.mods.ModDraggable;
import java.awt.Color;
import net.minecraft.client.Minecraft;

public class ModChroma extends ModDraggable {
  public int getWidth() {
    return 0;
  }
  
  public int getHeight() {
    return 0;
  }
  
  public static void drawChromaString(String string, int x, int y, int j, boolean shadow) {
    Minecraft mc = Minecraft.getMinecraft();
    int xTmp = x;
    byte b;
    int i;
    char[] arrayOfChar;
    for (i = (arrayOfChar = string.toCharArray()).length, b = 0; b < i; ) {
      char textChar = arrayOfChar[b];
      long l = System.currentTimeMillis() - (xTmp * 10 - y * 10);
      int k = Color.HSBtoRGB((float)(l % 2000L) / 2000.0F, 0.8F, 0.8F);
      String tmp = String.valueOf(textChar);
      mc.fontRendererObj.drawString(tmp, xTmp, y, k, shadow);
      xTmp += mc.fontRendererObj.getCharWidth(textChar);
      b++;
    } 
  }
  
  public void render(ScreenPosition pos) {}
  
  public static void drawChromaStringArmor(String string, int x, int y, int j, boolean shadow) {
    Minecraft mc = Minecraft.getMinecraft();
    int xTmp = x;
    byte b;
    int i;
    char[] arrayOfChar;
    for (i = (arrayOfChar = string.toCharArray()).length, b = 0; b < i; ) {
      char textChar = arrayOfChar[b];
      long l = System.currentTimeMillis() - (xTmp * 10 - y * 10);
      int k = Color.HSBtoRGB((float)(l % 2000L) / 2000.0F, 0.8F, 0.8F);
      String tmp = String.valueOf(textChar);
      mc.fontRendererObj.drawString(tmp, xTmp, y, k, shadow);
      xTmp += mc.fontRendererObj.getCharWidth(textChar);
      b++;
    } 
  }
  
  public static void drawChromaString1(String string, int x, boolean shadow) {
    Minecraft mc = Minecraft.getMinecraft();
    int xTmp = x;
    byte b;
    int i;
    char[] arrayOfChar;
    for (i = (arrayOfChar = string.toCharArray()).length, b = 0; b < i; ) {
      char textChar = arrayOfChar[b];
      long l = System.currentTimeMillis() - (xTmp * 10 - textChar * 10);
      int j = Color.HSBtoRGB((float)(l % 2000L) / 2000.0F, 0.8F, 0.8F);
      String tmp = String.valueOf(textChar);
      mc.fontRendererObj.drawString(tmp, xTmp, textChar, j, shadow);
      xTmp += mc.fontRendererObj.getCharWidth(textChar);
      b++;
    } 
  }
  
  public static void drawChromaString13(String string, int x, boolean shadow) {
    Minecraft mc = Minecraft.getMinecraft();
    int xTmp = x;
    byte b;
    int i;
    char[] arrayOfChar;
    for (i = (arrayOfChar = string.toCharArray()).length, b = 0; b < i; ) {
      char textChar = arrayOfChar[b];
      long l = System.currentTimeMillis() - (xTmp * 10 - textChar * 10);
      int j = Color.HSBtoRGB((float)(l % 2000L) / 2000.0F, 0.8F, 0.8F);
      String tmp = String.valueOf(textChar);
      mc.fontRendererObj.drawString(tmp, xTmp, textChar, j, shadow);
      xTmp += mc.fontRendererObj.getCharWidth(textChar);
      b++;
    } 
  }
  
  public static String drawChromaStringPot(String name, int id, int id2, int id3, boolean b) {
    Minecraft mc = Minecraft.getMinecraft();
    int xTmp = id;
    String string = null;
    byte b1;
    int i;
    char[] arrayOfChar;
    for (i = (arrayOfChar = string.toCharArray()).length, b1 = 0; b1 < i; ) {
      char textChar = arrayOfChar[b1];
      long l = System.currentTimeMillis() - (xTmp * 10 - textChar * 10);
      int j = Color.HSBtoRGB((float)(l % 1000L) / 1000.0F, 0.8F, 0.8F);
      String tmp = String.valueOf(textChar);
      mc.fontRendererObj.drawString(tmp, xTmp, textChar, j);
      xTmp += mc.fontRendererObj.getCharWidth(textChar);
      b1++;
    } 
    return name;
  }
  
  static int rainbowEffect() {
    return Color.HSBtoRGB((float)(System.currentTimeMillis() % 1000L) / 1000.0F, 0.8F, 0.8F);
  }
  
  public static int rainbowEffect1(int i, float f) {
    return Color.HSBtoRGB((float)(System.currentTimeMillis() % 1000L) / 1000.0F, 0.8F, 0.8F);
  }
}
