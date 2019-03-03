package de.itter.enigma;

import java.util.logging.Logger;

public class Wiring {

	private static Logger LOGGER = Logger.getLogger(Wiring.class.getName());

	protected int position = 0;

	protected char[][] wiring = Tools.getWiring();

	public Wiring(char[][] wiring) {
		this.wiring = wiring;
	}

	public Wiring() {

	}

	/**
	 * Maps one character (stroke) to the character on the other side of the rotor.
	 * 
	 * @param c
	 * @return
	 */
	public char map(char c) {
		char cc = wiring[(c - 'A' + position) % 26][1];
		// LOGGER.log(Level.SEVERE, "mapping " + c + "->" + cc);
		return cc;
	}

	public String map(String text) {
		StringBuffer s = new StringBuffer(text.length());

		for (int i = 0; i < text.length(); i++) {
			if (Character.toUpperCase(text.charAt(i)) >= 'A' && Character.toUpperCase(text.charAt(i)) <= 'Z') {
				s.append(map(Character.toUpperCase(text.charAt(i))));

			}
		}

		return s.toString();
	}
}
