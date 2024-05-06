package BasicProgram;

public class Constructor {
     Constructor()   //non parameterised constructor
     {
    	 System.out.println("One");
     }
     Constructor(int a,int b,double c,float d,long e,String f, boolean g)  //parameterised constructor
     {
    	 System.out.println("two");
     }
	public static void main(String[] args) {
		Constructor c1=new Constructor();
		new Constructor();
		new Constructor(32000,33000,3.33,3.5f,34455,"rrr",true);//alternate method to create obj
		}

}
