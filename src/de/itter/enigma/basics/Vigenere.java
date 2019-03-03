/**
 * 
 */
package de.itter.enigma.basics;

/**
 * @author Erik Itter
 *
 */
public class Vigenere {

	public static void main(String[] args) {
		String plainText = "Das ist ein Test des Vignere Verfahrens.";
		String key = "VIGENERE";
		String chiffre = encrypt(plainText, key);
		System.out.println(chiffre);
		System.out.println(decrypt(chiffre, key));
	}

	public static String encrypt(String plaintext, String key) {
		StringBuffer chiffre = new StringBuffer();
		String plain = plaintext.toUpperCase();
		for (int i = 0, j = 0; i < plain.length(); i++) {
			char c = plain.charAt(i);
			if (c < 'A' || c > 'Z') {
				continue;
			}

			chiffre.append((char) ((c + key.charAt(j) - 2 * 'A') % 26 + 'A'));
			j = ++j % key.length();
		}

		return chiffre.toString();
	}

	public static String decrypt(String chiffre, String key) {
		StringBuffer plainText = new StringBuffer();
		String text = chiffre.toUpperCase();
		for (int i = 0, j = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (c < 'A' || c > 'Z') {
				continue;
			}

			plainText.append((char) ((c - key.charAt(j) + 26) % 26 + 'A'));
			j = ++j % key.length();
		}

		return plainText.toString();
	}

}
