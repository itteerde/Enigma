package de.itter.enigma;

public abstract class Wiring {

	protected int position = 0;

	protected char[][] wiring = Tools.getWiring();

	/**
	 * Maps one character (stroke) to the character on the other side of the rotor.
	 * 
	 * @param c
	 * @return
	 */
	public char map(char c) {
		return wiring[(c - 'A' + position) % 26][1];
	}
}
