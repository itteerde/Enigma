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

	private EnigmaMachine enigmaD() {
		// TODO Auto-generated method stub
		return null;
	}
}
