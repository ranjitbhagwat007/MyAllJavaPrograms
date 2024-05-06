package teacher;

import java.util.Arrays;

public class CopyOfArray {

	public static void main(String[] args) {
		String name[]=new String[4];
		name[0]="Ram";
		name[1]="Sita";
		name[2]="Laxman";
		name[3]="Deepika";
		String nameCopy[]=new String[name.length];
		for(int i=0;i<name.length;i++)
		{
			nameCopy[i]=name[i];
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(nameCopy));

	}

}
