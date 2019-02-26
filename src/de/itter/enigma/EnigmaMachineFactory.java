package de.itter.enigma;

public class EnigmaMachineFactory {

	public static EnigmaMachine getEnigmaMachine(int type) {
		switch (type) {
		case Enigma.ENIGMA_D:

			return enigmaD();

		default:
			throw new IllegalArgumentException("no such machine, use constants from Enigma class");
		}
	}

	public static EnigmaMachine getEnigmaMachine() {
		return getEnigmaMachine(Enigma.ENIGMA_D);
	}

	private static EnigmaMachine enigmaD() {
		EnigmaMachine em = new EnigmaMachine(Enigma.ENIGMA_D);
		Rotor[] rotors = new Rotor[3];
		Rotor left = RotorFactory.getRotor(Enigma.D_ROTORS_I);
		Rotor middle = RotorFactory.getRotor(Enigma.D_ROTORS_II);
		Rotor right = RotorFactory.getRotor(Enigma.D_ROTORS_III);
		rotors[0] = left;
		rotors[1] = middle;
		rotors[2] = right;
		em.setRotors(rotors);
		em.setEntryWheel(RotorFactory.getRotor(Enigma.D_ROTORS_ETW));
		em.setReflector(RotorFactory.getRotor(Enigma.D_ROTORS_UKW));

		return em;
	}
}
