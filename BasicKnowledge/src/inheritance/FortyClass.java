package inheritance;

public class FortyClass {
	int age;
	String name;
	double salary;
	void student(int age, String name, double salary) {
		this.age=age;  // it assigns local value of age to global value of age...i.e-from 0 to 90
		this.name=name;
		this.salary=salary;
		//System.out.println("Name of student is " +name+ " Age of student is " +age+ " Salary of student is "+salary);
	}
	public static void main(String[] args) {
		FortyClass f1=new FortyClass();
		f1.student(90, "ram", 98.333);
		System.out.println(f1.name);
		System.out.println(f1.age);
		System.out.println(f1.salary);
	}

}
