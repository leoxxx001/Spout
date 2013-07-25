/*
 * This file is part of Spout.
 *
 * Copyright (c) 2011 Spout LLC <http://www.spout.org/>
 * Spout is licensed under the Spout License Version 1.
 *
 * Spout is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the Spout License Version 1.
 *
 * Spout is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for
 * more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the Spout License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://spout.in/licensev1> for the full license, including
 * the MIT license.
 */
package org.spout.api.event.audio;

import org.spout.api.audio.SoundSource;
import org.spout.api.audio.SoundState;
import org.spout.api.event.Cancellable;
import org.spout.api.event.HandlerList;

/**
 * Called when a {@link SoundSource}'s current {@link SoundState} is being changed.
 *
 * @see org.spout.api.audio.SoundSource#getState()
 */
public class SoundStateChangeEvent extends SoundEvent implements Cancellable {
	private static final HandlerList handlers = new HandlerList();
	private final SoundState state;

	public SoundStateChangeEvent(SoundSource source, SoundState state) {
		super(source);
		this.state = state;
	}

	/**
	 * Returns the state that the {@link SoundSource} will be in.
	 *
	 * @return new state
	 */
	public SoundState getState() {
		return state;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public void setCancelled(boolean cancelled) {
		super.setCancelled(cancelled);
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
}
