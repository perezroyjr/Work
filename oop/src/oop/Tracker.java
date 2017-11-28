package oop;

public class Tracker {
	public static void main(String args []) {
		
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		
		System.out.println("This Dog:" +  d1);
		System.out.println("This Dog:" +  d2);
		System.out.println("This Dog:" +  d3);
		
		System.out.println("All info for Dog 1" + d1.toString());
		System.out.println("All info for Dog 2" + d2.toString());
		System.out.println("ALl info for Dog 3" + d3.toString());
		
		
		// dog 3 variables
		d3.setBreed("doberman");
		d3.setHasCollar(true);
		d3.setHeight(35);
		d3.setWeight(67.3);
		System.out.println("Your updated Dog 3 is" + d3);
		
		//compare to
		if (d1.equals(d2)) {
			System.out.println("Dog 1 and Dog 2 Match");
		}
		else {
			System.out.println("Dog 1 and Dog 2 No Match");
		}
		if (d2.equals(d3)) {
			System.out.println("Dog 2 and Dog 3 mathch");
		}
		else {
			System.out.println("Dog 2 and Dog 3 NO MAtch");
		}
		 
	}
	

}