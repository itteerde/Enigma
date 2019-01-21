package de.itter.enigma;

public class Tools {

	private static char[][] wiring = { { 'A', 'A' }, { 'B', 'B' }, { 'C', 'C' }, { 'D', 'D' }, { 'E', 'E' },
			{ 'F', 'F' }, { 'G', 'G' }, { 'H', 'H' }, { 'I', 'I' }, { 'J', 'J' }, { 'K', 'K' }, { 'L', 'L' },
			{ 'M', 'M' }, { 'N', 'N' }, { 'O', 'O' }, { 'P', 'P' }, { 'Q', 'Q' }, { 'R', 'R' }, { 'S', 'S' },
			{ 'T', 'T' }, { 'U', 'U' }, { 'V', 'V' }, { 'W', 'W' }, { 'X', 'X' }, { 'Y', 'Y' }, { 'Z', 'Z' } };

	private static char[][] kenngruppen = { { 'A', 'A', 'A' }, { 'B', 'B', 'B' }, { 'C', 'C', 'C' },
			{ 'D', 'D', 'D' } };

	public static synchronized char[][] getWiring() {
		return wiring.clone();
	}

	public static char[][] getWiring(String mapping) {
		char[][] wiring = getWiring();

		for (int i = 0; i < wiring.length; i++) {
			wiring[i][1] = mapping.charAt(i);
		}

		return wiring;
	}

	public synchronized char[][] getKenngruppen() {
		return kenngruppen.clone();
	}
}
