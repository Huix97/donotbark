package huix.donotbark;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.tutorial.TutorialSteps;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.ScreenEvent;

@Mod(DoNotBark.MODID)
public class DoNotBark {
    public static final String MODID = "donotbark";

    public DoNotBark(IEventBus modEventBus, ModContainer modContainer) {
    }

    @SubscribeEvent
    public void OnScreenPre(final ScreenEvent.Init.Pre event) {
        if (event.getScreen() instanceof TitleScreen) {
            Minecraft.getInstance().getTutorial().setStep(TutorialSteps.NONE);
        }
    }
}
