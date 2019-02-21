package de.itter.enigma;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class EnigmaMachineTest {

	@Test
	void testCreateEnigmaMachine() {
		fail("Not yet implemented");

	}

	@Test
	void testGetRotors() {
		fail("Not yet implemented");
	}

	@Test
	void testGetReflector() {
		fail("Not yet implemented");
	}

	@Test
	void testGetEntryWheel() {
		fail("Not yet implemented");
	}

	@Test
	void testTypeChar() {
		fail("Not yet implemented");
	}

	@Test
	void testTypeString() {
		EnigmaMachine em = (new EnigmaMachineFactory()).getEnigmaMachine(Enigma.ENIGMA_D);

		RotorFactory rf = new RotorFactory();
		Rotor[] rotors = new Rotor[3];

		Rotor left = rf.getRotor(Enigma.D_ROTORS_III);
		Rotor middle = rf.getRotor(Enigma.D_ROTORS_I);
		Rotor right = rf.getRotor(Enigma.D_ROTORS_II);

		left.setPosition(17);
		middle.setPosition(26);
		right.setPosition(1);

		System.out.println(em.type("WETTERBERICHTYYZEBRAYYSTARKEYYBOEENYYAUSYYNNOYYYHEILYYHITLER"));
	}

}
