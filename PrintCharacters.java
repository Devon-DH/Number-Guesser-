//Class: CSE 1321L 
//Section: 6
// Term: Spring2020
//Instuctor: Devi
//Name: Devon Henry
//Lab: #9;
 import java.util.Scanner;
public class PrintCharacters {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	char letter1;
	char letter2;
	System.out.println("Enter first character:");
	letter1 = sc.next().charAt(0); 
	System.out.println("Enter second character:");
	letter2 = sc.next().charAt(0);
	while (letter2 < letter1) {
		System.out.println("Second Character invalid,Enter second character:");
		letter2 = sc.next().charAt(0);
		
	}
	
	printChars(letter1, letter2);
	
			
	}
public static void printChars(char ch1, char ch2)  {
	int sum = ch1;
	int counter = 0;
	while(ch1 <= ch2) {
		System.out.print(ch1 + " " );
		ch1++;
		counter++;
		if( counter == 5) {
			System.out.println("");	
			counter = 0;
		}
	}
	
  }
}
