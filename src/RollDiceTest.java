import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RollDiceTest {

	@Test
	void testAddOne() {
		int[] array = {1, 2, 3, 4, 5};
		assertEquals(1, RollDice.yahtzee(array, "one"));
		System.out.println(RollDice.yahtzee(array, "one"));
	}
	
	@Test
	void testAddTwo() {
		int[] array = {1, 2, 3, 4, 5};
		assertEquals(2, RollDice.yahtzee(array, "two"));
		System.out.println(RollDice.yahtzee(array, "two"));
	}
	
	@Test
	void testAddThree() {
		int[] array = {1, 2, 3, 4, 5};
		assertEquals(3, RollDice.yahtzee(array, "three"));
		System.out.println(RollDice.yahtzee(array, "three"));
	}
	
	@Test
	void testAddFour() {
		int[] array = {1, 2, 3, 4, 5};
		assertEquals(4, RollDice.yahtzee(array, "four"));
		System.out.println(RollDice.yahtzee(array, "four"));
	}
	
	@Test
	void testAddFive() {
		int[] array = {1, 2, 3, 4, 5};
		assertEquals(5, RollDice.yahtzee(array, "five"));
		System.out.println(RollDice.yahtzee(array, "five"));
	}
	
	@Test
	void testAddSix() {
		int[] array = {1, 2, 3, 4, 5};
		assertEquals(0, RollDice.yahtzee(array, "six"));
		System.out.println(RollDice.yahtzee(array, "six"));
	}
	
	@Test
	void testYahtzee() {
		int[] array = {1,1,1,1,1};
		assertEquals(50, RollDice.yahtzee(array, "yahtzee"));
		System.out.println(RollDice.yahtzee(array, "yahtzee"));
	}
	
	
	
}
