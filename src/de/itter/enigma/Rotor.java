package de.itter.enigma;

public class Rotor extends Wiring {

	private int[] notches; // the notches move the adjacent rotor, regularly to the left (the slower ones),
							// but notice the "Engima anomaly"
	private int[] turnovers;
	private int ring; // "Ringstellung" ring position. On the rotor there is a red mark that can be
						// set turning a ring that is part of the rotor and offsets the rotor.
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
	 * Sets the rotor position as printed on the rotors, that is 1 to 26 or a to z.
	 * 
	 * @param position the position as printed on the rotors, that is 1 to 26 or a
	 *                 to z. For convinience you may also use 'a' to 'z' or 'A' to
	 *                 'Z'.
	 */
	public void setPosition(int position) {
		if (position >= 'A' && position <= 'Z') {
			position = position - 'A' - 1;
			return;
		}
		if (position >= 'a' && position <= 'z') {
			position = position - 'a' - 1;
			return;
		}
		if (position >= 1 && position <= 26) {
			this.position = position - 1;
			return;

		}
		throw new IllegalArgumentException("position must be 1-26 (may be specified as 1-26, 'a'-'z' or 'A'-'Z')");
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
