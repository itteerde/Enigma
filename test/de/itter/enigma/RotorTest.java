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

	@Test
	void testMap() {
		Rotor r = new Rotor(1);
		assertEquals('E', r.map('A'));
		assertEquals('J', r.map('Z'));
	}

}
