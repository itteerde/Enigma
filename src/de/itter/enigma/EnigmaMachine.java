package de.itter.enigma;

public class EnigmaMachine {

	private Rotor[] rotors = new Rotor[3];
	private Reflector reflector = null;
	private EntryWheel entryWheel = null;

	/**
	 * Creates an instance of the machine using one line of the
	 * <code>Luftwaffen-Maschinen-Schlüssel</code>. That is the airforce variant an
	 * Enigma M3, same as army.
	 * 
	 * Note also that if no wiring at the switch board is done and the reflector and
	 * entry wheel are not reconfigured this is the weak civil version in essence.
	 * 
	 * @param walzenlage
	 * @param ringstellung
	 * @param umkehrwalze
	 * @param steckerbrett
	 * @param kenngruppen
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
		return 'A';
	}

	public String type(String plainText) {
		return null;
	}
}
