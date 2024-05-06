package Assignments;

import Assignments.Assign5;

public class Assign5 {

	Assign5()   //non parameterised constructor
	     {
	    	 System.out.println("One");
	     }
	Assign5(int a,int b,double c,float d,long e,String f, boolean g)  //parameterised constructor
	     {
	    	 System.out.println("two");
	     }
		public static void main(String[] args) {
			Assign5 c1=new Assign5();
			new Assign5();
			new Assign5(32000,33000,3.33,3.5f,34455,"rrr",true);//alternate method to create obj
			}

	}