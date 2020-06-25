package io.github.SebastianDanielFrenz.WEPexampleExtension;

import io.github.SebastianDanielFrenz.WorldEconomyPlugin.api.WorldEconomyExtension;

public class ExampleExtension extends WorldEconomyExtension {

	@Override
	public void init() {
		getLogger().info("Loading...");
	}

	@Override
	public void constructionEvent() {
		
	}

}
