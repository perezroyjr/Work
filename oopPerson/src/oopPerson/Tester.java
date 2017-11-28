package oopPerson;
import java.util.Scanner;
public class Tester {
	public static void main(String args []) {
		
		Person p1 = new Person();
		Person p2 = new Person("Ahri", "akali", 'F');
		Person p3 = new Person("jojo", "Bizarro", 50, 'M', "jumping");
		
		System.out.println("Welcome! " + p1);
		System.out.println("Welcome! " + p2);
		System.out.println("Welcome! " + p3);
		
		String a = "aadvark";
		String e = "elephant";

		System.out.println(
		     a.substring(0,4) +                   
		       e.substring(3,8));

	}

}
