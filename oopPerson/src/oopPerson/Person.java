package oopPerson;

public class Person{
	
	
	// Calling Variables
	private String firstName;
	private String lastName;
	private int age;
	private char gender;
	private String hobby;
	
	
	// default constructor
	Person(){
		firstName = "Unknown";
		lastName = "Unknown";
		age = 0;
		gender = 'U';
		hobby = "Drinking";
	}
	//Overloaded constructor
	Person(String firstName, String lastName, int age, char gender, String hobby){
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.hobby = hobby;		
	}
	Person(String firstName, String lastName, char gender){
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	
	// Getters and Setters
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getHobby() {
		return hobby;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public void setFirstName(String firstName) {
		this.firstName= firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	//toString
	@Override
	public String toString() {
		String s = "First Name: "+ firstName + " Last Name: "+ lastName + " Age: "+ age + " Hobby; " + hobby;
		if (gender == 'M') {
			System.out.println("Male");
		}
		else if (gender == 'F') {
			System.out.println("Female");
		}
		else
			System.out.println("Unknown");
		return s;
	}
	
	// equals method
	@Override
	public boolean equals(Object o) {
		if (o instanceof Person) {
			Person otherP = (Person)o;
			if (this.firstName.equalsIgnoreCase(otherP.firstName)) {
				if (this.lastName.equalsIgnoreCase(otherP.lastName)) {
					if (this.age == otherP.age) {
						if (this.hobby.equalsIgnoreCase(otherP.hobby)) {
							if (this.gender == 'M') {
							return true;
						}
					}
				}
			}
		}
	}
return false;
}
	
	//Speak method
	public void speak() {
		System.out.println("Hello World");
		
	}
	
}
