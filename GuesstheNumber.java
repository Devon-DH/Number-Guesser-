//Class: CSE 1321L 
//Section: 6
// Term: Spring2020
//Instuctor: Devi
//Name: Devon Henry
//Lab: #9;
import java.util.Random;
import java.util.Scanner;
public class GuesstheNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char answer;
		int cpu;
		int user;
		do {
			cpu=random();
			do {
				user= guess();
				System.out.println( checking(user,cpu));
			}while( cpu != user);
		System.out.println("Do you want to play again: Y or N");
		answer = sc.next().charAt(0);
		}while (answer == 'Y' );
	}
	
	
	
	public static int random() { 
	Random rand = new Random();
	int number = rand.nextInt(20);
	return number;
	}
	public static int guess() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess the number: ");
		int guess = sc.nextInt();
		return guess;
		
			
	}
	public static String checking(int guess, int number) {
		String result="";
		if (number == guess) {
			
			result = "Correct";
		}
		if (number < guess) {
			result = "Guess too high";
		}
		if (number > guess) {
			result = "Guess too low";
		}
		return result;
		
	}
	
}
