package HW5;
import java.util.Scanner;
public class FlowerCounter {
	public static void main(String args []) {
		
		/*Scanner scnr = new Scanner(System.in);
		
		String str;
		String[] flower = {"Petunia", "Panssy", "Rose", "Violet", "Carnation"};
		double price [] = {.50, .75, 1.50, .50, .80};
		
		System.out.println("what kind of flower would you like? We have \"Petunia\", \"Panssy\", \"Rose\", \"Violet\", \"Carnation\"");
		str = scnr.next();
		for (int i = 0; i < flower.length; i++);
		
		*/
		
		int[][] testArray = new int[3][4];
		for (int row = 0; row < testArray.length; row++)
		 for (int col = 0;
		 col < testArray[row].length; col++)
		 testArray[row][col] = col;
		for (int row = 0; row < testArray.length; row++)
		{
		 for (int col = 0;
		 col < testArray[row].length; col++)
		 System.out.print(testArray[row][col] + " ");
		 System.out.println();
		}
		 
	}


}