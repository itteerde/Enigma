package de.itter.enigma;

public class Enigma {

	private static final int ENIGMA_D = 0x1000;
	private static final int ENIGMA_I = 0x2000;
	private static final int ENIGMA_M3 = 0x3000;
	private static final int ENIGMA_M4 = 0x4000;

	private static final int ROTORS = 0x100;
	private static final int ETW = 12;
	private static final int ROTOR_I = 1;
	private static final int ROTOR_II = 2;
	private static final int ROTOR_III = 3;
	private static final int ROTOR_IV = 4;
	private static final int ROTOR_V = 5;
	private static final int ROTOR_VI = 6;
	private static final int ROTOR_VII = 7;
	private static final int ROTOR_VIII = 8;
	private static final int UKW_A = 14; // Umkehrwalze (UKW), reflector rotor
	private static final int UKW_B = 15;
	private static final int UKW_C = 16;
	private static final int BETA = 'b';
	private static final int GAMMA = 'c';

	public static final int D_ROTORS_ETW = ENIGMA_D | ROTORS | ETW;
	public static final int D_ROTORS_I = ENIGMA_D | ROTORS | ROTOR_I;
	public static final int D_ROTORS_II = ENIGMA_D | ROTORS | ROTOR_II;
	public static final int D_ROTORS_III = ENIGMA_D | ROTORS | ROTOR_III;
	public static final int D_ROTORS_UKW = ENIGMA_D | ROTORS | UKW_A;

	public static final int I_ROTORS_ETW = ENIGMA_I | ROTORS | ETW;
	public static final int I_ROTORS_I = ENIGMA_I | ROTORS | ROTOR_I;
	public static final int I_ROTORS_II = ENIGMA_I | ROTORS | ROTOR_II;
	public static final int I_ROTORS_III = ENIGMA_I | ROTORS | ROTOR_III;
	public static final int I_ROTORS_IV = ENIGMA_I | ROTORS | ROTOR_IV;
	public static final int I_ROTORS_V = ENIGMA_I | ROTORS | ROTOR_V;
	public static final int I_ROTORS_UKW_A = ENIGMA_I | ROTORS | UKW_A;
	public static final int I_ROTORS_UKW_B = ENIGMA_I | ROTORS | UKW_B;
	public static final int I_ROTORS_UKW_C = ENIGMA_I | ROTORS | UKW_C;

	public static final int M3_ROTORS_ETW = ENIGMA_M3 | ROTORS | ETW;
	public static final int M3_ROTORS_I = ENIGMA_M3 | ROTORS | ROTOR_I;
	public static final int M3_ROTORS_II = ENIGMA_M3 | ROTORS | ROTOR_II;
	public static final int M3_ROTORS_III = ENIGMA_M3 | ROTORS | ROTOR_III;
	public static final int M3_ROTORS_IV = ENIGMA_M3 | ROTORS | ROTOR_IV;
	public static final int M3_ROTORS_V = ENIGMA_M3 | ROTORS | ROTOR_V;
	public static final int M3_ROTORS_VI = ENIGMA_M3 | ROTORS | ROTOR_VI;
	public static final int M3_ROTORS_VII = ENIGMA_M3 | ROTORS | ROTOR_VII;
	public static final int M3_ROTORS_VIII = ENIGMA_M3 | ROTORS | ROTOR_VIII;
	public static final int M3_ROTORS_UKW_B = ENIGMA_M3 | ROTORS | UKW_B;
	public static final int M3_ROTORS_UKW_C = ENIGMA_M3 | ROTORS | UKW_C;

	public static final int M4_ROTORS_ETW = ENIGMA_M4 | ROTORS | ETW;
	public static final int M4_ROTORS_I = ENIGMA_M4 | ROTORS | ROTOR_I;
	public static final int M4_ROTORS_II = ENIGMA_M4 | ROTORS | ROTOR_II;
	public static final int M4_ROTORS_III = ENIGMA_M4 | ROTORS | ROTOR_III;
	public static final int M4_ROTORS_IV = ENIGMA_M4 | ROTORS | ROTOR_IV;
	public static final int M4_ROTORS_V = ENIGMA_M4 | ROTORS | ROTOR_V;
	public static final int M4_ROTORS_VI = ENIGMA_M4 | ROTORS | ROTOR_VI;
	public static final int M4_ROTORS_VII = ENIGMA_M4 | ROTORS | ROTOR_VII;
	public static final int M4_ROTORS_VIII = ENIGMA_M4 | ROTORS | ROTOR_VIII;
	public static final int M4_ROTORS_BETA = ENIGMA_M4 | ROTORS | BETA;
	public static final int M4_ROTORS_GAMMA = ENIGMA_M4 | ROTORS | GAMMA;
	public static final int M4_ROTORS_UKW_B = ENIGMA_M4 | ROTORS | UKW_B;
	public static final int M4_ROTORS_UKW_C = ENIGMA_M4 | ROTORS | UKW_C;

}
