package de.itter.enigma;

public class Rotor {

	private int position = 0;
	private char[] wiring = null;

	public Rotor(int number) {
		String wiring = null;

		switch (number) {
		case 1:
			wiring = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
			break;
		case 2:
			wiring = "AJDKSIRUXBLHWTMCQGZNPYFVOE";
			break;
		case 3:
			wiring = "BDFHJLCPRTXVZNYEIWGAKMUSQO";
			break;
		case 4:
			wiring = "ESOVPZJAYQUIRHXLNFTGKDCMWB";
			break;
		case 5:
			wiring = "VZBRGITYUPSDNHLXAWMJQOFECK";
			break;
		case 6:
			wiring = "JPGVOUMFYQBENHZRDKASXLICTW";
			break;
		case 7:
			wiring = "NZJHGRCXMYSWBOUFAIVLPEKQDT";
			break;
		case 8:
			wiring = "FKQHTLXOCBJSPDZRAMEWNIUYGV";
			break;
		}
	}

}
