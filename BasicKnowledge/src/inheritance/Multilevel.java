package inheritance;
class Grandparent{
	static void add() {
		System.out.println("ok");
	}
	 void sub() {
		System.out.println("1");
	}
}
class Great extends Grandparent{
	void sub() {
		System.out.println("1");
	}
}
public class Multilevel extends Great{

	public static void main(String[] args) {
		add();
		Multilevel mul=new Multilevel();
		mul.sub();
	}

}
