/**
 * 
 */
package de.itter.enigma;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author Erik Itter
 *
 */
public class Faust {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		encrypt();
		decrypt();

	}

	private static void monoalphabeticalSubstitution(Path plaintext, Path chiffre, String substitution)
			throws IOException {
		Stream<String> in = Files.lines(plaintext);
		BufferedWriter out = Files.newBufferedWriter(chiffre);

		Wiring w = new Wiring(Tools.getWiring(substitution));

		in.forEach(i -> {
			try {
				out.write(w.map(i));
				out.newLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		});

		in.close();
		out.close();

	}

	private static void encrypt() throws IOException {

		monoalphabeticalSubstitution(Paths.get("res/faust.txt"), Paths.get("res/chiffre.txt"),
				"JKLABCDEFGHIMNOPQRSTUVWXYZ");
		// ABCDEFGHIJKLMNOPQRSTUVWXYZ
		// JKLABCDEFGHIMNOPQRSTUVWXYZ
	}

	private static void decrypt() throws IOException {
		monoalphabeticalSubstitution(Paths.get("res/chiffre.txt"), Paths.get("res/secret.txt"),
				"DEFGHIJKLABCMNOPQRSTUVWXYZ");

	}

}
