package de.itter.enigma;

public class Enigma {

	private static final int ENIGMA_D = 0x1000;
	private static final int ENIGMA_I = 0x2000;

	private static final int ROTORS = 0x100;
	private static final int WHEEL = 13;
	private static final int ETW = 12;
	private static final int ROTOR_I = 1;
	private static final int ROTOR_II = 2;
	private static final int ROTOR_III = 3;
	private static final int ROTOR_IV = 4;
	private static final int ROTOR_V = 5;
	private static final int ROTOR_VI = 6;
	private static final int ROTOR_VII = 7;
	private static final int ROTOR_VIII = 8;
	private static final int REFLECTOR = 14; // Umkehrwalze (UKW)

	public static final int D_ROTORS_WHEEL = ENIGMA_D | ROTORS | WHEEL;
	public static final int D_ROTORS_ETW = ENIGMA_D | ROTORS | ETW;
	public static final int D_ROTORS_I = ENIGMA_D | ROTORS | ROTOR_I;
	public static final int D_ROTORS_II = ENIGMA_D | ROTORS | ROTOR_II;
	public static final int D_ROTORS_III = ENIGMA_D | ROTORS | ROTOR_III;
	public static final int D_ROTORS_UKW = ENIGMA_D | ROTORS | REFLECTOR;

	public static final int I_ROTORS_WHEEL = ENIGMA_I | ROTORS | WHEEL;
}
