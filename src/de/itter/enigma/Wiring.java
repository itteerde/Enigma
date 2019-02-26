package de.itter.enigma;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Wiring {

	private static Logger LOGGER = Logger.getLogger(Wiring.class.getName());

	protected int position = 0;

	protected char[][] wiring = Tools.getWiring();

	/**
	 * Maps one character (stroke) to the character on the other side of the rotor.
	 * 
	 * @param c
	 * @return
	 */
	public char map(char c) {
		char cc = wiring[(c - 'A' + position) % 26][1];
		if (LOGGER.isLoggable(Level.FINEST)) {
			LOGGER.log(Level.FINEST, "mapping " + c + "->" + cc);
		}
		return cc;
	}
}
