package BasicProgram;
//SIB...main...IIB...Constructor this is the order that will get executed everytime

public class IIB {
		static 
		{
			System.out.println("SIB");
		}
		
		{
			System.out.println("IIB");
		}
		
	public static void main(String[] args) {   System.out.println("main");
		IIB i1=new IIB();
		
	}
		IIB()
		{
			System.out.println("Constuctor");
		}

}
