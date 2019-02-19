package de.itter.enigma;

public class Rotor extends Wiring {

	private int[] notches; // the notches move the adjacent rotor, regularly to the left (the slower ones),
							// but notice the "Engima anomaly"
	private int[] turnovers;
	private boolean isFixed = false;

	/**
	 * 
	 * @param number
	 */
	public Rotor(String wiring) {
		this.wiring = Tools.getWiring(wiring);

	}

	public void setFixed(boolean isFixed) {
		this.isFixed = isFixed;
	}

	/**
	 * 
	 * @return the position as printed on the rotors, that is 1 to 26 for non navy
	 *         and A to Z for navy
	 */
	public int getPosition() {
		return position + 1;
	}

	/**
	 * the position as printed on the rotors, that is 1 to 26
	 * 
	 * @param position
	 */
	public void setPosition(int position) {
		this.position = position - 1;
	}

	/**
	 * Turns the rotor by one step.
	 * 
	 * @return the rotor's new position.
	 */
	public int step() {
		if (isFixed) {
			return position;
		}
		position = ++position % 26;
		return position;
	}

}
