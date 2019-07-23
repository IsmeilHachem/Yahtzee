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
	
	@Test
	void testPair1() {
		int[] array = {1,1,1,1,1};
		assertEquals(2, RollDice.yahtzee(array, "pair"));
		System.out.println(RollDice.yahtzee(array, "pair"));
	}
	
	@Test
	void testPair2() {
		int[] array = {1,1,2,2,2};
		assertEquals(4, RollDice.yahtzee(array, "pair"));
		System.out.println(RollDice.yahtzee(array, "pair"));
	}
	
	@Test
	void testThreeOfAKind1() {
		int[] array = {1,1,2,2,2};
		assertEquals(6, RollDice.yahtzee(array, "three of a kind"));
		System.out.println(RollDice.yahtzee(array, "three of a kind"));
	}
	
	@Test
	void testThreeOfAKind2() {
		int[] array = {1,1,2,2,3};
		assertEquals(0, RollDice.yahtzee(array, "three of a kind"));
		System.out.println(RollDice.yahtzee(array, "three of a kind"));
	}
	
	@Test
	void testTwoPair1() {
		int[] array = {1,1,2,2,3};
		assertEquals(6, RollDice.yahtzee(array, "two pair"));
		System.out.println(RollDice.yahtzee(array, "two pair"));
	}
	
	@Test
	void testTwoPair2() {
		int[] array = {1,1,2,2,2};
		assertEquals(6, RollDice.yahtzee(array, "two pair"));
		System.out.println(RollDice.yahtzee(array, "two pair"));
	}
	
	@Test
	void testFourOfAKind1() {
		int[] array = {4,4,4,4,5};
		assertEquals(16, RollDice.yahtzee(array, "four of a kind"));
		System.out.println(RollDice.yahtzee(array, "four of a kind"));
	}
	
	@Test
	void testFourOfAKind2() {
		int[] array = {4,4,4,6,5};
		assertEquals(0, RollDice.yahtzee(array, "four of a kind"));
		System.out.println(RollDice.yahtzee(array, "four of a kind"));
	}
	
	@Test
	void testSmallStraight1() {
		int[] array = {4,4,4,6,5};
		assertEquals(0, RollDice.yahtzee(array, "small straight"));
		System.out.println(RollDice.yahtzee(array, "small straight"));
	}
	
	@Test
	void testSmallStraight2() {
		int[] array = {5,3,2,4,1};
		assertEquals(15, RollDice.yahtzee(array, "small straight"));
		System.out.println(RollDice.yahtzee(array, "small straight"));
	}
	
	@Test
	void testLargeStraight1() {
		int[] array = {2,3,4,5,6};
		assertEquals(20, RollDice.yahtzee(array, "large straight"));
		System.out.println(RollDice.yahtzee(array, "large straight"));
	}
	
	@Test
	void testLargeStraight2() {
		int[] array = {2,3,4,5,3};
		assertEquals(0, RollDice.yahtzee(array, "large straight"));
		System.out.println(RollDice.yahtzee(array, "large straight"));
	}
	
	@Test
	void testFullHouse1() {
		int[] array = {2,2,4,4,4};
		assertEquals(16, RollDice.yahtzee(array, "full house"));
		System.out.println(RollDice.yahtzee(array, "full house"));
	}
	
	@Test
	void testFullHouse2() {
		int[] array = {2,2,4,4,3};
		assertEquals(0, RollDice.yahtzee(array, "full house"));
		System.out.println(RollDice.yahtzee(array, "full house"));
	}
	
	@Test
	void testChance1() {
		int[] array = {1,2,3,4,4};
		assertEquals(14, RollDice.yahtzee(array, "chance"));
		System.out.println(RollDice.yahtzee(array, "chance"));
	}
	
	@Test
	void testChance2() {
		int[] array = {5,3,1,4,4};
		assertEquals(17, RollDice.yahtzee(array, "chance"));
		System.out.println(RollDice.yahtzee(array, "chance"));
	}
}
