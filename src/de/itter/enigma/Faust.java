/**
 * 
 */
package de.itter.enigma;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
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
		Stream<String> in = Files.lines(Paths.get("res/faust.txt"));
		StringBuffer s = new StringBuffer();
		in.forEach(s::append);
		in.close();
		String plainText = s.toString().toUpperCase();
		System.out.println(Arrays.toString(LetterFrequency.letterFrequency(plainText)));
		char[] plainChars = plainText.toCharArray();
		Rotor r = new Rotor("LMPEFGQRSTUVWXYZABCDHIJNOK");
		StringBuffer chiffre = new StringBuffer();
		for (int i = 0; i < plainChars.length; i++) {
			if (plainChars[i] >= 'A' && plainChars[i] <= 'Z') {
				chiffre.append(r.map(plainChars[i]));
				System.out.print(r.map(plainChars[i]));

			}
		}

		System.out.println(chiffre.length());

		BufferedWriter out = new BufferedWriter(new FileWriter(new File("res/chiffre.txt")));
		for (int i = 0; i < chiffre.length(); i++) {
			out.write(chiffre.charAt(i));
			System.out.println(chiffre.charAt(i));
		}
		out.close();
	}

}
