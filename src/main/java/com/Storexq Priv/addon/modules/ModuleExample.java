package com.example.addon.modules;
import net.minecraft.client.Minecraft;
import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;


public class ModuleExample extends Module {
    public ModuleExample() {
        super(Addon.CATEGORY, "GuiKeys", "GuiKeys.");
    }
}

@Override
protected void actionPerformed(GuiButton button) {
    if (button.id == 1) {
        // Button with id 1 is clicked
        // You can perform your action here
        System.out.println("Button clicked!");
    }
}

@Override
public void drawScreen(int mouseX, int mouseY, float partialTicks) {
    drawDefaultBackground();
    super.drawScreen(mouseX, mouseY, partialTicks);
}


