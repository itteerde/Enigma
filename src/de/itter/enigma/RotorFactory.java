package de.itter.enigma;

public class RotorFactory extends WiringFactory {

	public Rotor getRotor(int type) {
		switch (type) {
		case Enigma.D_ROTORS_ETW:
			return enigmaDEtw();

		case Enigma.D_ROTORS_I:
			return enigmaDRotorI();
		case Enigma.D_ROTORS_II:
			return enigmaDRotorII();
		case Enigma.D_ROTORS_III:
			return enigmaDRotorIII();
		case Enigma.D_ROTORS_UKW:
			return enigmaDUkw();
		default:
			throw new IllegalArgumentException("No such rotor, use constants from Enigma class.");
		}
	}

	private Rotor enigmaDUkw() {
		return new Rotor("IMETCGFRAYSQBZXWLHKDVUPOJN");
	}

	private Rotor enigmaDRotorIII() {
		return new Rotor("CJGDPSHKTURAWZXFMYNQOBVLIE");
	}

	private Rotor enigmaDRotorII() {
		return new Rotor("SLVGBTFXJQOHEWIRZYAMKPCNDU");
	}

	private Rotor enigmaDRotorI() {
		return new Rotor("LPGSZMHAEOQKVXRFYBUTNICJDW");
	}

	private Rotor enigmaDEtw() {
		return new Rotor("JWULCMNOHPQZYXIRADKEGVBTSF");// other source: QWERTZUIOASDFGHJKPYXCVBNML
	}
}
