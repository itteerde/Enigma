package de.itter.enigma;

public class RotorFactory extends WiringFactory {

	public static Rotor getRotor(int type) {
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

	private static Rotor enigmaDUkw() {
		return new Rotor("IMETCGFRAYSQBZXWLHKDVUPOJN");
	}

	private static Rotor enigmaDRotorIII() {
		return new Rotor("CJGDPSHKTURAWZXFMYNQOBVLIE");
	}

	private static Rotor enigmaDRotorII() {
		return new Rotor("SLVGBTFXJQOHEWIRZYAMKPCNDU");
	}

	private static Rotor enigmaDRotorI() {
		return new Rotor("LPGSZMHAEOQKVXRFYBUTNICJDW");
	}

	private static Rotor enigmaDEtw() {
		return new Rotor("JWULCMNOHPQZYXIRADKEGVBTSF");// other source: QWERTZUIOASDFGHJKPYXCVBNML
	}
}
