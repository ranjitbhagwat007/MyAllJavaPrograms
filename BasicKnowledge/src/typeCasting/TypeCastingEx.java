package typeCasting;

public class TypeCastingEx {

	public static void main(String[] args) {
		
		double a= 90;// implicitly
		System.out.println(a);
		
		int a1=90;
		double age= a1;// implicitly
		System.out.println(age);
		
		double a2=(double) a1;// explicitly
		System.out.println(a2);
		//-------------------------//
		double pi=3.14;
		int a3= (int)pi;
		System.out.println(a3);
	}

}
