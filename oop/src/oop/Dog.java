package oop;

public class Dog extends Hero implements Communicator{
	
	private String breed;
	private boolean hasCollar;
	private int height;
	private double weight;
	
	//defualt constructor
	public Dog() {
		breed = " DOG ";
		hasCollar =  false;
		height =  0;
		weight =  0.0;
	}
	
	// overloaded constructor
	public Dog(String pitBull) {
		this();
		breed = pitBull;
	}
	
	// overloaded constructor
	
	public Dog(String breed, boolean hasCollar, double weight) {
		this.breed = breed;
		this.hasCollar = hasCollar;
		this.weight = weight;
	}
	
	
	// getters and setters
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public boolean getHasCollar() {
		return hasCollar;
	}
	public void setHasCollar(boolean hasCollar) {
		this.hasCollar = hasCollar;
	}
	public int getHeight() {
		return height;	
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//toString method
	@Override
	public String toString() {
		String s = " \n\tDog Breed:" + this.breed + "\n\tHas a Collar: " + this.hasCollar + "\n\tHeight is: " + this.height + " \n\tWeights: " + this.weight;
		return s;
	}
	// equal method
	@Override
	public boolean equals(Object o){
		if (o instanceof Dog){
			Dog otherDog = (Dog)o;
			if ((this.hasCollar == otherDog.hasCollar) &&
				 this.breed.equalsIgnoreCase(otherDog.breed) &&
				 this.height == otherDog.height &&
				 this.weight == otherDog.weight) {
					 return true;
					 
				 }
		}
		return false;
	}
	// speak method
	@Override
	public void speak() {
		System.out.println("woof -- I am a " + this.breed);
	}
	public void speak(String s ) {
		System.out.println(s);
	}
}
