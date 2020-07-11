package io.github.SebastianDanielFrenz.WEPexampleExtension;

import io.github.SebastianDanielFrenz.WorldEconomyPlugin.api.WorldEconomyExtension;

public class ExampleExtension extends WorldEconomyExtension {

	@Override
	public void onEnable() {
		getLogger().info("Bukkit is enabling the plugin...");
	}

	@Override
	public void constructionEvent() {
		getLogger().info("Modifying WorldEcomomy...");

		// register items, blocks and other WEP stuff here
	}

}
