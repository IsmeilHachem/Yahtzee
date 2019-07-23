
public class RollDice {
	
	
	public static int yahtzee(int[] dice, String category) {
		int sum = 0;

		if(category.equalsIgnoreCase("one")) {
			for(int die : dice) {
				if (die == 1) {
					sum += die;
				}
			} return sum;
		}
		
		if(category.equalsIgnoreCase("two")) {
			for(int die : dice) {
				if (die == 2) {
					sum += die;
				}
			} return sum;
		}
		
		if(category.equalsIgnoreCase("three")) {
			for(int die : dice) {
				if (die == 3) {
					sum += die;
				}
			} return sum;
		}
		
		if(category.equalsIgnoreCase("four")) {
			for(int die : dice) {
				if (die == 4) {
					sum += die;
				}
			} return sum;
		}
		
		if(category.equalsIgnoreCase("five")) {
			for(int die : dice) {
				if (die == 5) {
					sum += die;
				}
			} return sum;
		}
		
		if(category.equalsIgnoreCase("six")) {
			for(int die : dice) {
				if (die == 6) {
					sum += die;
				}
			} return sum;
		}
		
		if(category.equalsIgnoreCase("yahtzee")) {
			for(int i = 0; i < dice.length; i++) {
				if(dice[0] == dice[1] && dice[1] == dice[2] && dice[2] == dice[3] && dice[3] == dice[4]) {
					return 50;
				} else {
					return 0;
				}
			}
		}
		

		
		return 0;
		
	}
	

}
