package teacher;

public class StudentNames {

	public static void main(String[] args) {
		String name[]=new String[3];
		name[0]="karan";
		name[1]="arjun";
		name[2]="komal";
		for(int i=0;i<3;i++)
		{
			//System.out.println(name[i]);
		}
		int rollno[]=new int[3];
		rollno[0]=10;
		rollno[1]=20;
		rollno[2]=30;
		//rollno[2]=40;
		System.out.println("StudentName"+" "+"RollNo"+" "+"Gender");
		for(int i=0;i<3;i++)
		{
			//System.out.println(name[i]+"        "+rollno[i]);
		}
		char gender[]=new char[3];
		gender[0]='M';
		gender[1]='M';
		gender[2]='F';
		for(int i=0;i<3;i++)
		{
			System.out.println(name[i]+"        "+rollno[i]+"       "+gender[i]);
		}
		
	}

}
