package org.powerbot.game.api.wrappers.graphics.model;

import org.powerbot.game.api.wrappers.graphics.CapturedModel;
import org.powerbot.game.api.wrappers.location.Location;
import org.powerbot.game.client.Model;
import org.powerbot.game.client.RSInteractableManager;
import org.powerbot.game.client.RSInteractableRSInteractableManager;

public class LocationModel extends CapturedModel {
	private final Location location;
	private final Object instance;

	public LocationModel(final Model model, final Location location) {
		super(model, location);
		this.location = location;
		this.instance = location.getInstance();
	}

	@Override
	protected int getLocalX() {
		return (int) ((RSInteractableManager) ((RSInteractableRSInteractableManager) instance).getRSInteractableRSInteractableManager()).getData().getLocation().getX();
	}

	@Override
	protected int getLocalY() {
		return (int) ((RSInteractableManager) ((RSInteractableRSInteractableManager) instance).getRSInteractableRSInteractableManager()).getData().getLocation().getY();
	}

	@Override
	protected int getPlane() {
		return location.getPlane();
	}

	@Override
	protected void update() {
	}
}
