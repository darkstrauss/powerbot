package org.powerbot.bot.rt6.client;

import org.powerbot.bot.ContextAccessor;
import org.powerbot.bot.ReflectionEngine;

public class Sequence extends ContextAccessor {
	public Sequence(final ReflectionEngine engine, final Object parent) {
		super(engine, parent);
	}

	public int getID() {
		return engine.accessInt(this);
	}
}
