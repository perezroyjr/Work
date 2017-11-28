package oop;

public class Hero {
	
	private String power;
	private int strengthLevel; // 0 - 10
	
	public Hero(){
		power = "fly";
		strengthLevel = 10;
	}

	public void setPower(String p){
		power = p;
	}
	public void setStrengthLevel(int l){
		strengthLevel = l;
	}
	public String getPower(){
		return power;
	}
	public int getStrengthLevel(){
		return strengthLevel;
	}
	public String toString(){
		String s = "Hero: \n\tPower" +power +"\n\tStrength Level= "+strengthLevel+ "\t";
		return s;
	}
}


