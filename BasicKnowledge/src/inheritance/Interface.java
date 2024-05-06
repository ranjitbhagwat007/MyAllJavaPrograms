package inheritance;
interface Keyboard{
	void login();  //abstract method
}
public class Interface implements Keyboard{

	public static void main(String[] args) {
		Interface i=new Interface();
		i.login();
	}

	@Override
	public void login() {   // method overriding happens
		System.out.println("ok"); 
	}

}
