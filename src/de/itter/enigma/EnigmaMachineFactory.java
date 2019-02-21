package de.itter.enigma;

public class EnigmaMachineFactory {

	public EnigmaMachine getEnigmaMachine(int type) {
		switch (type) {
		case Enigma.ENIGMA_D:

			return enigmaD();

		default:
			throw new IllegalArgumentException("no such machine, use constants from Enigma class");
		}
	}

	public EnigmaMachine getEnigmaMachine() {
		return getEnigmaMachine(Enigma.ENIGMA_D);
	}

	private EnigmaMachine enigmaD() {
		EnigmaMachine em = new EnigmaMachine(Enigma.ENIGMA_D);
		return null;
	}
}
