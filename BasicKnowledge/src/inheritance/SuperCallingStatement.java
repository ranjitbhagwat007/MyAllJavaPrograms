package inheritance;
class College{
	College(){
		System.out.println("College");
	}
	
}
class School extends College{
	School(int a, String b, double c){
		System.out.println("School");
	}
}
public class SuperCallingStatement {

	public static void main(String[] args) {
		School s1=new School(10,"Ram",3.5557);
		
	}

}
