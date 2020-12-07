//Class: CSE 1321L 
//Section: 6
// Term: Spring2020
//Instuctor: Devi
//Name: Devon Henry
//Lab: #9;
import java.util.Scanner;
public class SumDigits {
	public static void main(String [] args) {
		 Scanner sc = new Scanner(System.in);
		 int num;
		
		System.out.println("Enter you numbers:");
		num = sc.nextInt();
		
		System.out.println("You entered:    " + num);
		System.out.println ("Sum of digits:   " + sumDigits(num));
		
		
		
	}
	


 public static int sumDigits( int number) {
	 int sum = 0;
	 int lastdigit = 0;
	while (number > 0) {
		lastdigit = number%10;
		sum += lastdigit;
		number = number/10;
		
	   }
	return sum;
 	}
}