package inheritance;
interface Interface2{
	void login();
	void logout();
}
interface Interface1 extends Interface2{
	void search();
	void payment();
}
public class ClassWithInterface implements Interface1 {
	void order_page() {	}
	static void address_page(){	}
public static void main(String[] args) {
	ClassWithInterface cwi=new ClassWithInterface();
	cwi.login();
	cwi.logout();
	cwi.search();
	cwi.payment();
	cwi.order_page();
	address_page();}
public void search() {	
}
public void payment() {	
}
public void login() {	
}
public void logout() {	
}}
