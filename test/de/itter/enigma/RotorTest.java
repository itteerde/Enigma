package de.itter.enigma;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RotorTest {

	@Test
	void testRotor() {
		Rotor r = new Rotor("LPGSZMHAEOQKVXRFYBUTNICJDW");

	}

	@Test
	void testStep() {
		Rotor r = new Rotor("LPGSZMHAEOQKVXRFYBUTNICJDW");
		r.step();
		assertEquals(2, r.getPosition());
	}

	@Test
	void testMap() {
		Rotor r = new Rotor("LPGSZMHAEOQKVXRFYBUTNICJDW");
		assertEquals('L', r.map('A'));
		assertEquals('W', r.map('Z'));
	}

}
