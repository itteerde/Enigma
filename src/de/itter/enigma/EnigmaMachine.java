package de.itter.enigma;

public class EnigmaMachine {

	private Rotor[] rotors = new Rotor[3];
	private Rotor reflector = null;
	private Rotor entryWheel = null;
	private int type = 0;

	public EnigmaMachine(int type) {
		this.type = type;
	}

	/**
	 * Creates an instance of the machine using one line of the
	 * <i>Luftwaffen-Maschinen-Schlüssel</i>. That is the airforce variant, an
	 * <i>Enigma M3</i>, same as army (<i>Heer</i>).
	 * 
	 * Note also that if no wiring at the switch board is done and the reflector and
	 * entry wheel are not reconfigured this is the weak civilian version in
	 * essence.
	 * 
	 * @param walzenlage   which rotors need to be placed into the machine in what
	 *                     order
	 * @param ringstellung to what positions are the rotors to be set
	 * @param umkehrwalze  reflector
	 * @param steckerbrett switch board (aka plug board)
	 * @param kenngruppen  message identifier groups
	 */
	private EnigmaMachine createEnigmaMachine(int[] walzenlage, int[] ringstellung, char[][] umkehrwalze,
			char[][] steckerbrett, char[][] kenngruppen) {

		return null;
	}

	public void setRotors(Rotor[] rotors) {
		this.rotors = rotors;
	}

	public void setReflector(Rotor reflector) {
		this.reflector = reflector;
	}

	public void setEntryWheel(Rotor entryWheel) {
		this.entryWheel = entryWheel;
	}

	public Rotor[] getRotors() {
		return rotors;
	}

	public Rotor getReflector() {
		return reflector;
	}

	public Rotor getEntryWheel() {
		return entryWheel;
	}

	public char type(char plainChar) {
		char c = plainChar;
		for (int i = 0; i < rotors.length; i++) {
			c = rotors[i].map(c);
			rotors[i].step();// or before and what about fixed rotors?
		}
		c = reflector.map(c);
		for (int i = rotors.length - 1; i >= 0; i--) {
			c = rotors[i].map(c);
			rotors[i].step();// or before and what about fixed rotors?
		}
		return c;
	}

	public String type(String plainText) {
		StringBuffer s = new StringBuffer();
		char[] pt = plainText.toCharArray();
		for (int i = 0; i < pt.length; i++) {
			s.append(type(pt[i]));
		}
		return null;
	}
}
