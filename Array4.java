package AssignmentsBatch48;

import java.util.Arrays;

public class Array4 {
	
	public static void main(String[] args) {
		
		int [] a= new int[3];
		a[0]=3;
		a[1]=1;
		a[2]=2;
		
		System.out.println("using for loop");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("using for each loop");
		
		for(int s:a)
		{
			System.out.println(s);
		}
		
		System.out.println(Arrays.toString(a));
		
		int [] a1= new int[3];
		a1[0]=3;
		a1[1]=1;
		a1[2]=2;
		
		boolean b= Arrays.equals(a, a1);
		
		if(b==true)
		{
			System.out.println("Arrays are equal");
		}
		
		
	}

}
