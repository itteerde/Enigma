package de.itter.enigma;

public class Rotor extends Wiring {

	private int position = 0;

	/**
	 * Benutze diesen constructor um einen Rotor (Walze) zu wählen. Die zu
	 * übergebende Nummer ist die Nummer der technischen Dokumentation des deutschen
	 * Militärs des Dritten Reichs.
	 * 
	 * @param number
	 */
	public Rotor(int number) {

		switch (number) {
		case 1:
			wiring = Tools.getWiring("EKMFLGDQVZNTOWYHXUSPAIBRCJ");
			break;
		case 2:
			wiring = Tools.getWiring("AJDKSIRUXBLHWTMCQGZNPYFVOE");
			break;
		case 3:
			wiring = Tools.getWiring("BDFHJLCPRTXVZNYEIWGAKMUSQO");
			break;
		case 4:
			wiring = Tools.getWiring("ESOVPZJAYQUIRHXLNFTGKDCMWB");
			break;
		case 5:
			wiring = Tools.getWiring("VZBRGITYUPSDNHLXAWMJQOFECK");
			break;
		case 6:
			wiring = Tools.getWiring("JPGVOUMFYQBENHZRDKASXLICTW");
			break;
		case 7:
			wiring = Tools.getWiring("NZJHGRCXMYSWBOUFAIVLPEKQDT");
			break;
		case 8:
			wiring = Tools.getWiring("FKQHTLXOCBJSPDZRAMEWNIUYGV");
			break;
		}
	}

	/**
	 * 
	 * @return the position as printed on the rotors, that is 1 to 26
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
		position = ++position % 26;
		return position;
	}

}
