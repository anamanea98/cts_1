package eu.ase.ro;

public class Human implements Runner{
	private int age;
	
	public Human() {
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		if(age > 50) {
			return 7;
		}
		else
			return 10;
	}
}
