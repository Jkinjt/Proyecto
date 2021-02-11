package client;

public class Person {
	protected String dni;
	protected String name;
	protected int age;
	public Person(String dni, String name, int age) {
		super();
		this.dni = dni;
		this.name = name;
		this.age = age;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
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
	@Override
	public String toString() {
		return "Person [dni=" + dni + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
