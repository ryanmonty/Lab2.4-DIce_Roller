import java.util.Scanner;
import java.util.Random;

public class Dice_Roller {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Grand Circus Casino!");
		System.out.print("How many sides should each die have? ");
		Scanner scnr = new Scanner(System.in);
		int sides = scnr.nextInt();
		int count = 0;
		generateRandomDieRoll(sides, count);
		scnr.close();
		
		}
	
	
	public static int generateRandomDieRoll(int sides, int count) {
		
		count++;
		System.out.println("Roll " + count + ":");
		
		int dice1 = (int) (Math.random()*sides+1);
		System.out.println(dice1);
		
		
		Random random = new Random();
		int dice2 = (random.nextInt(sides)+1);
		System.out.println(dice2);
		
		if (dice1 == 6 && dice2 == 6) {
			System.out.println("BOXCARS!");
		}
		else if ((dice1+dice2) == 3 || (dice1+dice2) == 12 ) {
			System.out.println("CRAPS!");
		}
		
		else if ((dice1 == 1 && dice2 == 1)) {
			System.out.println("SNAKE EYES!");
		}
		
		repeat(sides, count);
		
		return dice1;
	}
	
	public static void repeat(int sides, int count) {
		Scanner confirm = new Scanner(System.in);
		System.out.print("Roll Again? (y/n) ");
		String Answer = confirm.nextLine();
		
		if (Answer.equals("n")) {
			System.out.println();
			System.out.println("OK, please play again soon!");
		}
		else if (Answer.equals("y")) {
			generateRandomDieRoll(sides, count);
		}
		else {
			System.out.println("please only enter 'y' or 'n'");
			repeat(sides, count);
		}
		
		confirm.close();
	}
}


