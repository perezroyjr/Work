package Practice;
import java.util.Scanner;
public class HW2 {
	public static void main(String [] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		// Page 188-189 1-13
		// Question 1 Test for valid score ranging from 0-100
		
		/*
		int score = 0;
		
		System.out.println("Please enter a score");
		score = scnr.nextInt();
			if (score >= 0 && score <= 100) {
			System.out.println("Valid Score");
			}
			else {
				System.out.println("Invalid Score");
			}
				if (score % 2 == 0) {
					System.out.println(score + " Is even");
				}
				else {
					System.out.println(score + " Is odd");
				}
				*/
		
		
		// Question 2 test for odd or even
		
		/*
		int x = 0;
		 System.out.println("Please enter a value");
		 x = scnr.nextInt();
		 
		 	if (x % 2 == 0) {
		 		System.out.println("The value you entered was even" +(x / 2));
		 	}
		 	else {
		 		System.out.println("The value you entered was odd " +(x / 3 - 1));
		 	}
		 	*/
		
		
		//Question 3 user gives yes or no response
		
		/*
		String answer;
		System.out.println("Enter your response"); 
		answer = scnr.next(); 
		
		if(answer.equals("yes") || answer.equals("y") || answer.equals("no") || answer.equals("n")) {
			
			System.out.println("Valid entry");
		}
		else {
			System.out.println("Invalid entry");
		}
		*/
		
		
		//Question 4  what will the code print
		
		/*
		int x;
		
	
		System.out.println("please enter a value");
		x =scnr.nextInt();
		
		if (x > 5) {
			System.out.println("A");
		}
		else if (x < 10) {
			System.out.println("B");
		}
		else {
			System.out.println("C");
		
		
			}
		*/
		
		//Question 5 What does the code print
		
		/*
		int x;
		
	
		System.out.println("please enter a value");
		x =scnr.nextInt();
		
		if (x > 5) {
			System.out.println("A");
		}
		 if (x < 10) {
			System.out.println("B");
		}
		else {
			System.out.println("C");
		}
		 */
		 
		
		//Question 6 
		
		
		//Question 7 what is the value of the following boolean expressions
		
		/*
		int x = 5;
		int y = 10;
		int z = 15;
				
				System.out.println(( x > 5 && y > x)); //true
				System.out.println(( x < 5 || y > x)); //true
				System.out.println(( x > 3) || y < 10 && z == 15); //true
				System.out.println(!( x > 3) && x!= z || x + y == z); // true
				
				*/
		
		// Question 8 what will not compile? Both the if else statement and the statements next to the 
		/*
		if !x > x + y
		x = 2 * x;
		else
			x = x + 3;
		*/
		
		// Question9 Why is the following expression probably not what the programmer intended? ->Because values from 10-100 you will not print anything
		 
		/*
		System.out.println(( x > 10) || (x < 100));
		*/
		
		// Question 10 Why is this expression probably not what the programmer intended? -> x can be any number outside of 3 and 4
		
		/*
		System.out.println((2 > 10) && (x < 100));
		*/
		
		//Question 11 write a program that converts letter grades to number
		
		/*
		char grade;
		System.out.println("please enter a letter grade");
		String response = scnr.next();
		
		switch(grade) { 
		
		case 'A': 
		grade = 4.0; 
		break; 
		case 'B': 
		gradeValue = 3.0; 
		break; 
		case 'C': 
		gradeValue = 2.0; 
		break; 
		case 'D': 
		gradeValue = 1.0; 
		break; 
		case 'F': 
		gradeValue = 0.0; 
		break; 
		default: 
		gradeValue = 0.0; 
		System.out.println("Invalid Grade"); 
		}
		*/
		//Question 12 add + and - to the grading system.
		
		/*
		if(grade.equals("A+")) { 
			gradeValue = 4.25; 
			} 
		else if(grade.equals("A")) { 
			gradeValue = 4.0; 
			} 
		else if(grade.equals("A-")) { 
			gradeValue = 3.75 ;
			} 
		else if(grade.equals("B+")) { 
			gradeValue = 3.25 ;
			} 
		else if(grade.equals("B-")) { 
			gradeValue = 2.75 ;
			} 
		else if(grade.equals("C-")) { 
			gradeValue = 2.25 ;
			} 
		else if(grade.equals("C+")) { 
			gradeValue = 2.75 ;
			} 
		else if(grade.equals("D-")) { 
			gradeValue = 1.25 ;
			} 
		else if(grade.equals("D+")) { 
			gradeValue = 1.75 ;
			} 
		else if(grade.equals("F+")) 
		{ 
		gradeValue = 0.25; 
		} 
		else if(grade.equals("F") || grade.equals("F-")) 
		{ 
		gradeValue = 0.0; 
		} 
		else 
		{ 
		gradeValue = 0.0; 
		System.out.println("Invalid Grade"); 
		
		char gradeLetter = grade.charAt(0); 
char plusMinus = ' '; 
if(grade.length() == 2) 
{ 
plusMinus = grade.charAt(1); 
} 
switch(gradeLetter) 
{ 
case 'A': 
switch(plusMinus) 
{ 
case '+': 
gradeValue = 4.25; 
break; 
case '-': 
gradeValue = 3.75; 
break; 
default: 
gradeValue = 4.0; 
} 
//process B, C and D the same as A 
case 'F': 
switch(plusMinus) 
{ 
case '+': 
gradeValue = 0.25; 
break; 
case '-': 
default: 
gradeValue = 0.0; 
} 
default: 
gradeValue = 0.0; 
System.out.println("Invalid Grade"); 
}
		
		
		
		
		
		
		
		*/
		
		
		//Question 13 
		
		/*
		System.out.println("please enter a letter a - e");
		String response = scnr.next();
		char letter = 0;
		if (response.length() == 1) {
			letter = response.charAt(0);
		}
		switch(letter) {
		case 'a':
			System.out.println("you entered a");
			break;
		case 'b':
			System.out.println("you entered b");
			break;
		case 'c':
			System.out.println("you entered c");
			break;
		case 'd':
			System.out.println("you entered d");
			break;
		case 'e':
			System.out.println("you entered e");
			break;
			default:
				System.out.println("invalid character");
		}
		*/
		
		// write a java loop that will display the phrase One more time, four times
		/*
		String One;
		for (int i = 0; i < 4; i++)
		System.out.println("One");
		*/
		
		// page 248-249
		//Question 1 
		
		/*
		System.out.println("Enter a word"); 
		String word = scnr.next(); 
		while(!word.equals("done")) 
		{ 
		if(word.charAt(0) == word.charAt(word.length() - 1)) 
		{ 
		System.out.println("First and last character are equals for the word: " + word); 
		} 
		else 
		{ 
		System.out.println("First and last character are NOT equals for the word: " + word); 
		} 
		word = scnr.next(); 
		} 
		*/
		
	//part b
		/*
		System.out.println("Enter a word"); 
		String word = scnr.next(); 
		do 
		{ 
		if(word.charAt(0) == word.charAt(word.length() - 1)) 
		{ 
		System.out.println("First and last character are equals for the word: " + word); 
		} 
		else 
		{ 
		System.out.println("First and last character are NOT equals for the word: " + word); 
		} 
		word = scnr.next(); 
		}while(!word.equals("done"));
		}
		*/
		
		// Question 2 
		
		/*
		double balance = 0.0, 
				yearlyRate = 0.025; 
				 
				System.out.println("Enter d for deposit, w for withdrawal or x to exit"); 
				String transaction = scnr.next(); 
				while(!transaction.equals("x")) { 
				if(balance > 0.0) { 
				balance += (yearlyRate / 12) * balance; 
				} 
				System.out.println("Beginning of Month Balance: " + balance); 
				if(transaction.equals("d")) { 
				System.out.println("Enter deposit amount"); 
				balance += scnr.nextDouble(); 
				} 
				else if(transaction.equals("w")) { 
				System.out.println("Enter withdrawal amount"); 
				balance -= scnr.nextDouble(); 
				} 
				System.out.println("Balance after transaction: " + balance); 
				System.out.println("Enter d for deposit, w for withdrawal or x to exit"); 
				transaction = scnr.next(); 
				}
				*/
		
		//Question 3
		/*
		String code = "37823"; 
		int totalGuesses = 1; 
		
		System.out.println("Enter your 5-digit guess"); 
		String guess = scnr.next(); 
		while(totalGuesses < 10) { 
		int correct = 0, 
		sum = 0; 
		for(int i = 0; i < code.length(); i++) { 
		if(code.charAt(i) == guess.charAt(i)) { 
		correct++; 
		sum += Integer.parseInt(code.charAt(i) + ""); 
		} 
		} 
		System.out.println(correct + " and " + sum); 
		if(guess.equals(code)) { 
		System.out.println("You guessed right!"); 
		totalGuesses = 10; 
		} 
		else { 
		guess = scnr.next(); 
		totalGuesses++; 
		} 
		}
		*/
		//Question 4
		
		/*
		int n = 5, 
		number = 1, 
		sum = 0; 
			for(int i = 0; i < n; i++) { 
			sum += number; 
				number += 2; 
				} 
				System.out.println("Sum of 1st " + n + " positive odd ints is: " + sum);
				
				*/
		
		//Question 5 
		
		/*
		int s = 0; 
		int t = 1; 
		int i = 0; 
		while(i < 10) 
		{ 
		s = s + i; 
		int j = i; 
		while(j > 0) 
		{ 
		t = t * (j - i); 
		j--; 
		} 
		s = s * t; 
		System.out.println("T is " + t); 
		i++; 
		} 
		System.out.println("S is " + s);
		*/
		
		//Question 6
		
		/*
		int n = 20, 
		sum = 0; 
		for(int i = 1; i <= n; i++) { 
		sum += (i * i); 
		} 
		System.out.println("Total sum: " + sum);
		*/
		
		//Question 7
		/*
		
		int n = 20, 
		sum, 
		i; 
		for(i = 1, sum = 0; i < n; sum += i * i, i++); 
		System.out.println("Total sum: " + sum);
		*/
		
		//Question 8
		
		/*
		String word = "hello w o r l d"; 
		int blankSpaces = 0; 
		for(int i = 0; i < word.length(); i++) { 
		if(word.charAt(i) == ' ') { 
		blankSpaces++; 
		} 
		} 
		System.out.println(blankSpaces + " blank spaces in " + word);
		*/
		
		//Question 9
		/*
		
		String word = "0123456789", 
				reversed = ""; 
				for(int i = word.length() - 1; i > -1; i--) { 
				reversed += word.charAt(i); 
				} 
				System.out.println(word + " reversed is " + reversed);
				*/
		
		//Question 10
		
	 /*
		int heads = 0, 
		tails = 0; 
		System.out.println("For each coin toss enter either h for heads or t for tails."); 
		for(int i = 1; i <= 8; i++) { 
		String numEnding = "th"; 
		if(i == 1) { 
		numEnding = "st"; 
		} 
		else if(i == 2) { 
		numEnding = "nd"; 
		} 
		else if(i == 3) { 
		numEnding = "rd"; 
		} 
		System.out.println(i + numEnding + " toss:"); 
		String type = scnr.next(); 
		if(type.equals("h")) { 
		heads++; 
		} 
		else { 
		tails++; 
		} 
		} 
		System.out.println("Number of heads: " + heads + " (" + (((double)heads / 8.0) * 100) + "%)"); 
		System.out.println("Number of tails: " + tails + " (" + (((double)tails / 8.0) * 100) + "%)");
		*/
		
		//Question 11
		
		/*
		int numOfPeople = 5, 
		totalHandshakes = 0; 
		for(int i = 0; i < numOfPeople; i++) { 
		totalHandshakes += i; 
		} 
		System.out.println("Total handshakes for " + numOfPeople + " is " + totalHandshakes);
		*/
		
		//page 190 1-5
		// Question 1
		
		/*
		int x = 0;
		int y = 0;
		
		System.out.println("Please enter numbers");
		x = scnr.nextInt();
		y = scnr.nextInt();
		
		if (( x % y == 0 )) {
			System.out.println( x + "is divisible by" + y);
		}
		else {
			System.out.println(x + "is not divisble by " + y);
		}
		*/
		
		// Question 2
		
		/*
		int number1, number2, number3;

		System.out.println(" Please enter 3 numbers");
	    number1 = scnr.nextInt();
	    number2 = scnr.nextInt();
	    number3 = scnr.nextInt();

	    if (number1 < number2) {
	        if (number2 < number3) {
	            System.out.println( number1 + number2 + number3);
	        } 
	        else {
	            if (number1 < number3)
	                System.out.println( number1 + number3 + number2);
	            else
	                System.out.println(number3 + number1 + number2);
	        }
	    } 
	    else {
	        if (number3 < number2) {
	            System.out.println( number3 + number2 + number1);
	        } 
	        else {
	            if (number3 < number1)
	                System.out.println( number2 + number3 + number1);
	            else
	                System.out.println( number2 + number1 + number3);
	   
		}
	}
	    */
	    
		//Question 3
		/*
		 String s1, s2, s3, ex; //Declared Variables
	 
	        System.out.print("Enter 1st String: "); //Userinput 1st.
	 
	        s1 = scnr.next();
	 
	        System.out.print("Enter 2nd String: "); //Userinput 2nd.
	 
	        s2 = scnr.next();
	 
	        System.out.print("Enter 3rd String: "); //Userinput 3rd.
	 
	        s3 = scnr.next();
	 
	 
	        if (s1.compareTo(s2) < 0) {
	            System.out.println(s1 + "precedes" + s2 +" in lexicographic ordering");
	 
	        }
	             
	        else if (s2.compareTo(s3) > 0)
	            System.out.println(s2 + "follows" + s3 +
	                    " in lexicographic ordering");
	                    */
		
		// page 254 5-7
		//question 7 
		
		int smallest = Integer.MAX_VALUE;
		int largest = 0;
		int number;
		double totalAvg = 0;
		double totalSum = 0;
		int count = 0;

		System.out.println("Enter few integers (Enter negative numbers to end input) :");
		while (true) { //LOOP till user enter "-1"
		    number = scnr.nextInt();

		    //Condition for the loop to break
		    if (number <= -1) {
		        System.out.println("End Of Input");
		        break;
		    } else {
		        count = count + 1;
		    }

		    if (number < smallest) { //Problem 1 : If 1st input num is bigger than 2nd input num,
		        smallest = number;  // largest num will not be recorded..
		    }

		    if (number > largest){
		        largest = number;
		    }

		    totalSum = totalSum + number;
		    totalAvg = (totalSum / count);

		}

		System.out.println("The smallest number you have entered is : " + smallest);
		System.out.println("The largest number you have entered is : " + largest);
		System.out.println("The total sum is : " + totalSum);
		System.out.println("The total average is : " + totalAvg);
		System.out.println("Count : " + count);
		
		
	}
}
