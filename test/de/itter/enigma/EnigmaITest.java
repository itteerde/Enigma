package de.itter.enigma;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class EnigmaITest {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	void testSiemensAtom1() {
		EnigmaMachine em = new EnigmaMachineFactory().getEnigmaMachine(Enigma.ENIGMA_D);
		Rotor[] rotors = new Rotor[3];
		RotorFactory rf = new RotorFactory();
		Rotor left = rf.getRotor(Enigma.D_ROTORS_III);
		Rotor middle = rf.getRotor(Enigma.D_ROTORS_II);
		Rotor right = rf.getRotor(Enigma.D_ROTORS_I);
		left.setPosition('A');
	}

	@Test
	void testTypeChar() {
		EnigmaMachine em = EnigmaMachineFactory.getEnigmaMachine(Enigma.ENIGMA_D);

		assertEquals('H', em.type('A'));

	}

}
