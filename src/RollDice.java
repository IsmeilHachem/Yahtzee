
public class RollDice {

	public static int yahtzee(int[] dice, String category) {
		int sum = 0;

		if (category.equalsIgnoreCase("one")) {
			for (int die : dice) {
				if (die == 1) {
					sum += die;
				}
			}
			return sum;
		}

		if (category.equalsIgnoreCase("two")) {
			for (int die : dice) {
				if (die == 2) {
					sum += die;
				}
			}
			return sum;
		}

		if (category.equalsIgnoreCase("three")) {
			for (int die : dice) {
				if (die == 3) {
					sum += die;
				}
			}
			return sum;
		}

		if (category.equalsIgnoreCase("four")) {
			for (int die : dice) {
				if (die == 4) {
					sum += die;
				}
			}
			return sum;
		}

		if (category.equalsIgnoreCase("five")) {
			for (int die : dice) {
				if (die == 5) {
					sum += die;
				}
			}
			return sum;
		}

		if (category.equalsIgnoreCase("six")) {
			for (int die : dice) {
				if (die == 6) {
					sum += die;
				}
			}
			return sum;
		}

		if (category.equalsIgnoreCase("yahtzee")) {
			for (int i = 0; i < dice.length; i++) {
				if (dice[0] == dice[1] && dice[1] == dice[2] && dice[2] == dice[3] && dice[3] == dice[4]) {
					return 50;
				} else {
					return 0;
				}
			}
		}

		if (category.equalsIgnoreCase("pair")) {
			int x = 0;
			for (int i = 1; i <= 6; i++) {
				if (diceCount(dice, i) >= 2) {
					x = i;
				}
			}
			return 2 * x;
		}

		if (category.equalsIgnoreCase("two pair")) {
			int x = 0;
			int y = 0;
			for (int i = 1; i <= 6; i++) {
				for (int j = 1; j <= 6; j++) {
					if (diceCount(dice, i) >= 2 && diceCount(dice, j) >= 2 && i != j) {
						x = i;
						y = j;
					}
				}
			}
			return 2 * (x + y);
		}

		if (category.equalsIgnoreCase("three of a kind")) {
			int x = 0;
			for (int i = 1; i <= 6; i++) {
				if (diceCount(dice, i) >= 3) {
					x = i;
				}
			}
			return 3 * x;
		}
		
		if (category.equalsIgnoreCase("four of a kind")) {
			int x = 0;
			for (int i = 1; i <= 6; i++) {
				if (diceCount(dice, i) >= 4) {
					x = i;
				}
			}
			return 4 * x;
		}
		
		if (category.equalsIgnoreCase("small straight")) {
			int x = 0;
			for (int i = 1; i <= 5; i++) {
				if (diceCount(dice, i) == 1) {
					x++;
				}
			}
			if(x == 5) {
				return 15;
			} else {
				return 0;
			}
		}
		
		if (category.equalsIgnoreCase("large straight")) {
			int x = 0;
			for (int i = 2; i <= 6; i++) {
				if (diceCount(dice, i) == 1) {
					x++;
				}
			}
			if(x == 5) {
				return 20;
			} else {
				return 0;
			}
		}
		
		if (category.equalsIgnoreCase("full house")) {
			int x = 0;
			int y = 0;
			for (int i = 1; i <= 6; i++) {
				for (int j = 1; j <= 6; j++) {
					if (diceCount(dice, i) >= 2 && diceCount(dice, j) >= 3 && i != j) {
						x = i;
						y = j;
					}
				}
			}
			return (2 * x) + (3 * y);
		}
		
		if (category.equalsIgnoreCase("chance")) {
			int x = 0;
			for (int i = 0; i < 5; i++) {
				x += dice[i];
			} 
			return x;
		}

		
		
		
		return 0;
	}

	public static int diceCount(int[] dice, int num) {
		int sum = 0;
		for (int i = 0; i < dice.length; i++) {
			if (dice[i] == num) {
				sum++;
			}
		}
		return sum;
	}

}
