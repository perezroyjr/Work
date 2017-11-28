package oopPerson;

public class Student extends Person{
	
	private String sID;
	private String major;
	private int numOfCredits;
	private double gpa;
	private String courses [];
	
	
	//Default Overload
	Student(){
		super();
		sID = "s00000";
		major = "Undeclared";
		numOfCredits = 0;
		gpa = 0.0;
		courses = new String [5];
	

	
}
}
