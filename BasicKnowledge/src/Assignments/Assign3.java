package Assignments;
import Assignments.Assign3;
public class Assign3 {
	void add() {
		int a=100;
		int b=200;
		System.out.println(a+b);
	}	
	void sub() {
		int a=100;
		int b=200;
		System.out.println(b-a);
	}
	void mul() {
		int a=100;
		int b=200;
		System.out.println(b*a);
	}
	void div() {
		int a=100;
		int b=200;
		System.out.println(b/a);
	}
	void mod() {
		int a=100;
		int b=200;
		System.out.println(b%a);
	}
	public static void main(String[] args) {
		Assign3 n1=new Assign3();
      n1.add();
      n1.sub();
      n1.mul();
      n1.div();
      n1.mod();
      }
}