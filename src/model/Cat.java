package model;

public class Cat {
	private String name;
	private int age;
	private boolean isLoved;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean getIsLoved() {
		return isLoved;
	}

	public void setIsLoved(boolean isLoved) {
		this.isLoved = isLoved;
	}
	
	public Cat() {
		setName("null");
		setAge(0);
		setIsLoved(false);
	}
	
	public Cat(String name, int age, boolean isloved) {
		setName(name);
		setAge(age);
		setIsLoved(isloved);
	}
	public String speak(){
		return "meow!!!! meow!!! :3 :P";
	}
}
