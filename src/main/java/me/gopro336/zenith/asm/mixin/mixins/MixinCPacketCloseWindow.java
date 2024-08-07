package me.gopro336.zenith.asm.mixin.mixins;

import me.gopro336.zenith.asm.mixin.imixin.ICPacketCloseWindow;
import net.minecraft.network.play.client.CPacketCloseWindow;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/**
 * @author Robeart
 */
@Mixin(CPacketCloseWindow.class)
public abstract class MixinCPacketCloseWindow implements ICPacketCloseWindow {
	
	@Accessor(value = "windowId")
	public abstract int getWindowId();
	
}
