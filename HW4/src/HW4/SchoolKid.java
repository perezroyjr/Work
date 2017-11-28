package HW4;

public class SchoolKid {
	
	private String childName;
	private String teacherName;
	private String greeting;
	private int age;
	
	
	//Constructors
		public SchoolKid() {
			childName = "Name";
			teacherName = "Teacher";
			greeting = "Hello";
			age = 0;
			
		}
		public SchoolKid(String childName, String teacherName, String greeting, int age) {
			this.childName = childName;
			this.teacherName = teacherName;
			this.greeting = greeting;
			this.age = 0;
		}
			
		//getters and setters
			public String getChildName() {
				return childName;
			}
			public String getTeacherName() {
				return teacherName;
			}
			public String getGreeting() {
				return greeting;
			}
			public int getAge() {
				return age;
			}
			public void setChildName(String childName) {
				this.childName = childName;
			}
			public void setTeacherName(String teacherName) {
				this.teacherName = teacherName;
			}
			public void setGreeting(String greeting) {
				this.greeting = greeting;
			}
			
			//toString
				public String toString() {
					String s = "\n\tChild Name: " + this.childName + "\n\tChild teacher Name: " + this.teacherName + 
							"\n\tGreeting: " + this.greeting + "\n\tChild Age: " + this.age;
					return s;
				}

}
