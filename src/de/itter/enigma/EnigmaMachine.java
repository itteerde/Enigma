package de.itter.enigma;

public class EnigmaMachine {

	private Rotor[] rotors = new Rotor[3];
	private Reflector reflector = null;
	private EntryWheel entryWheel = null;

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
	public EnigmaMachine createEnigmaMachine(int[] walzenlage, int[] ringstellung, char[][] umkehrwalze,
			char[][] steckerbrett, char[][] kenngruppen) {

		return null;
	}

	public void setRotors(Rotor[] rotors) {
		this.rotors = rotors;
	}

	public void setReflector(Reflector reflector) {
		this.reflector = reflector;
	}

	public void setEntryWheel(EntryWheel entryWheel) {
		this.entryWheel = entryWheel;
	}

	public Rotor[] getRotors() {
		return rotors;
	}

	public Reflector getReflector() {
		return reflector;
	}

	public EntryWheel getEntryWheel() {
		return entryWheel;
	}

	public char type(char plainChar) {
		char c = plainChar;
		for (int i = 0; i < rotors.length; i++) {
			c = rotors[i].map(c);
			rotors[i].step();// or before and what about fixed rotors?
		}
		return 'A';
	}

	public String type(String plainText) {
		return "JJJJHHGG";
	}
}
