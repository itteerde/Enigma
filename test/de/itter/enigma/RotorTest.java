package de.itter.enigma;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RotorTest {

	@Test
	void testRotor() {
		Rotor r = new Rotor(1);

	}

	@Test
	void testStep() {
		Rotor r = new Rotor(1);
		r.step();
		assertEquals(2, r.getPosition());
	}

}
