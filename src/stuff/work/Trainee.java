package stuff.work;

import java.util.Date;



public class Trainee {

		private int age;
		private String name;
		private Date DoB;

		//seters and getters below
//		public int getAge() {
//			return this.age;
//		}
//		public void setAge(int age) {
//			if(age > 0 && age < 130) {
//				this.age = age;
//			}
//		}
		
		
		
		public Trainee (int age, String name) {
			
			this.age = age;
			this.name = name;
			
		}
		
		public void breathe() {
			System.out.println("#sigh#");
		}
		public void details() {
			System.out.println("Age: " + age);
			System.out.println("Name: " + name);
		}
	public static void main(String[] args) {
		
	}
}
