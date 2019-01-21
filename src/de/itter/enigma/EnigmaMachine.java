package de.itter.enigma;

public class EnigmaMachine {

	private Rotor[] rotors = new Rotor[3];
	private Reflector reflector = null;

	private void setRotors(Rotor[] rotors) {
		this.rotors = rotors;
	}

	private void setReflector(Reflector reflector) {
		this.reflector = reflector;
	}
}
