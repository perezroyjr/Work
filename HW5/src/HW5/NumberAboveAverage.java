package HW5;

public class NumberAboveAverage {
	public static void main(String args[]) {
		
		int total = 0, i = 0;
		while( total < 90 ) {
		   switch( i ) {
		     	case 0:
		         	total += 30;
		          	i = 1;
		          	break;
		     	case 1:
		          	i = 2;
		          	total -= 15;
		     	case 2:
		         	i = 0;
		          	total += 15;
		          	break;
		   }
		   System.out.println(total);
		}

		}

		}
	
	
	


