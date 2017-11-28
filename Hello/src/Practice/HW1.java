package Practice;
import java.util.Scanner;
public class HW1 {
	

	public final static int THREE_POINTER = 3;
	public final static int TOUCHDOWWN = 6;
	public final static int GOAL = 1;
	public final static int STRIKE = 10;
	public static void main(String []args) {
	
	Scanner scnr = new Scanner(System.in);
	

	//Page 40
	// Question 6: User enters age and is displayed  
	
	/*int age = 0;
	
	System.out.println("Hello, Please enter your age: ");
	age = scnr.nextInt();

	System.out.println("You are " + age + " Years old");
*/
	
	
	//QUESTION 7: print 3 2 1
	
	/*
	System.out.println("3 \n2 \n1 \n");
	
	
	for (int i = 3; i > 4; i++) {
	System.out.println("you will print" + i);
	*/
	
	
	
	// Question 8 User enters age, system prints age
	
	
	/*int age = 0;
	System.out.println("Please enter your age:");
	age = scnr.nextInt();
	
	System.out.println("The age you entered is" + age);
	*/
	
	
	// QUESTION 9 Birthday Wizard User types birthyear, system prints age
	
	/*int birthYear = 0;
	int currentYear = 2017;
	
	
	System.out.println("Please enter the year you were born:");
	birthYear = scnr.nextInt();
	
	if (birthYear > currentYear) {
		System.out.println("Invalid Year");
	}
	
	System.out.println("You will be " + (currentYear - birthYear) + " Years old");
	 
	 */
	
	
	//QUESTION 10 User enters 2 numbers and prints both user numbers and numbers in between
	
	/*
	int num1 = 0;
	int num2 = 0;
	
	
	System.out.println("Please Enter two integers:");
	num1 = scnr.nextInt();
	num2 = scnr.nextInt();
	
	for (int i = num1; i < num2; i++) {
	System.out.println(i);
	}
	for(int i = num2; i < num1; i++) {
		System.out.println(i);
	}
	*/
	
	//Page 128-132
	
	// Question 3 Using Mod and Casting data types
	
	/*
	float x =0;
	double y = 0;
	int z = 0;
	
	System.out.println("Please enter a x value:");
	x = scnr.nextFloat();
	y = x % 2.0;
	
	System.out.println("Your x value is: " + x + ", Your y value is " + y);
	z = (int) (x % 2);	
	System.out.println("Your x value is: " + x + ", Your z value is " + z);
	
	*/
	
	//Question 4 Simple math
	
	/*
	int u = 2;
	int v = 3;
	int w = 5;
	int x = 7;
	int y = 11;
	
	System.out.println((u + v * w + x));
	System.out.println((u + y % v * w + x));
	System.out.println((u++ / v + u++ * w));
	
	*/

	
	//Question 5 add dollars and half dollars to the making change program.
	
	/*
	
	int amount, originalAmount, dollar, halfDollar, quarters, dimes, nickels, pennies;
	
	System.out.println("Please enter a whole number "); //*
	System.out.println("This program will find the combinations of coins for you");
	System.out.println("That equals that amount of change");
	
	amount = scnr.nextInt();
	
	originalAmount = amount;
	dollar = amount / 100;  //*
	amount = amount % 100; //*
	halfDollar = amount / 50; //*
	amount = amount % 50; //*
	quarters = amount / 25;
	amount = amount % 25;
	dimes = amount / 10;
	amount = amount % 10;
	nickels = amount / 5;
	amount = amount % 5;
	pennies = amount;
	
	System.out.println(originalAmount + "cents in coins can be given as:");
	System.out.println(dollar + "Dollars");
	System.out.println(halfDollar + "Half Dollars");
	System.out.println(quarters + "Quarters");
	System.out.println(dimes + "Dimes");
	System.out.println(nickels + "nickels");
	System.out.println(pennies + "Pennies");
	
	*/
	
	
	//Question 6 Simple math
	
	/*
	int x = 10;
	System.out.println("Test 1: " + (x * 3 * 2.0));
	System.out.println("Test 2: " + (x * 3 + 2.0));
	System.out.println("Test 3: " + (x * 3 - 2.0));
	
	*/
	
	
	// Question 7 String method and substrings, Question 8 add second word to print.
	
	/*
	String greeting = "Hello, my good friend!";


	String greet = greeting.substring(0, 5);
	System.out.println(greet);
	String greet2 = greeting.substring(7,9);
	System.out.print(greet2);
	*/
	
	
	//Question 9 What does the following java statement display? Escape code!
	
	/*
	System.out.println("\"\tTest\\\\\rIt\'");
	System.out.println("\"\twtf\rhi\\");
	*/
	
	
	//Question 10 Write a single java statement that ill display the words one, two and three each on its on line.
	
	/*
	String num[] = {"one ", "two ", "three "};
	
	for (int i = 0; i < num.length; i++) {
		System.out.println(( num )[ i ]);
		
	}
	*/
	
	// Question 11 What does this java code display when the keyboard input is 2 is the input
	
	/*
	System.out.println("Enter a String.");
	int n = scnr.nextInt();
	String s =scnr.next();
	System.out.println("n is " + n);
	System.out.println("s is " + s);
	
	*/
	
	//Question 12 What does the java code display when the keyboard input is By theprickingof m thumbs
	
	/*
	scnr.useDelimiter("y");
	System.out.println("Please enter a string");
	String a = scnr.next();
	String b = scnr.next();
	System.out.println("a is" + a);
	System.out.println("b is" + b);
	
	*/
	
	//Question 13 Repeat the previous exercise, but change next to nextLine in the statement that assigns a value to b
	
	/*
	scnr.useDelimiter("y");
	System.out.println("Please enter a string");
	String a = scnr.nextLine();
	String b = scnr.next();
	System.out.println("a is" + a);
	System.out.println("b is" + b);
	
	*/
	
	//Question 14 
	
	
	
 }
}
			