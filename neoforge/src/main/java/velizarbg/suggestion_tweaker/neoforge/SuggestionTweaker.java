package velizarbg.suggestion_tweaker.neoforge;

import me.shedaniel.autoconfig.AutoConfig;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import velizarbg.suggestion_tweaker.Constants;
import velizarbg.suggestion_tweaker.ModConfig;

@Mod(SuggestionTweaker.MODID)
public class SuggestionTweaker {
	public static final String MODID = "suggestion_tweaker";

	public SuggestionTweaker() {
		Constants.config = ModConfig.init();

		// register config screen
		ModLoadingContext.get().registerExtensionPoint(IConfigScreenFactory.class, () -> (client, parent) ->
			AutoConfig.getConfigScreen(ModConfig.class, parent).get()
		);
	}
}
