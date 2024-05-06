package typeCasting;

import typeCasting.ClassTypecasting_29042024;
import typeCasting.ParentClass;

class ParentClass{
	
}
public class ClassTypecasting_29042024 extends ParentClass  {

	public static void main(String[] args) {

		ParentClass p1=		new ClassTypecasting_29042024();
		//upcasting->implicit way
		ParentClass p2=	(ParentClass)	new ClassTypecasting_29042024();
		//upcasting->Explicit way
	}

}
