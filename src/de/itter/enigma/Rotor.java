package de.itter.enigma;

public class Rotor {

	private int position = 0;
	private char[][] wiring = Tools.getWiring();

	public Rotor(int number) {

		switch (number) {
		case 1:
			wiring = Tools.getWiring("EKMFLGDQVZNTOWYHXUSPAIBRCJ");
			break;
		case 2:
			wiring = Tools.getWiring("AJDKSIRUXBLHWTMCQGZNPYFVOE");
			break;
		case 3:
			wiring = Tools.getWiring("BDFHJLCPRTXVZNYEIWGAKMUSQO");
			break;
		case 4:
			wiring = Tools.getWiring("ESOVPZJAYQUIRHXLNFTGKDCMWB");
			break;
		case 5:
			wiring = Tools.getWiring("VZBRGITYUPSDNHLXAWMJQOFECK");
			break;
		case 6:
			wiring = Tools.getWiring("JPGVOUMFYQBENHZRDKASXLICTW");
			break;
		case 7:
			wiring = Tools.getWiring("NZJHGRCXMYSWBOUFAIVLPEKQDT");
			break;
		case 8:
			wiring = Tools.getWiring("FKQHTLXOCBJSPDZRAMEWNIUYGV");
			break;
		}
	}

}
