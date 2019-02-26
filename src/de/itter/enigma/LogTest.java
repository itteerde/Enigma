/**
 * 
 */
package de.itter.enigma;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Erik Itter
 *
 */
public class LogTest {

	private static Logger LOGGER = Logger.getLogger(LogTest.class.getName());

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LOGGER.log(Level.SEVERE, "hello log");
	}

}
