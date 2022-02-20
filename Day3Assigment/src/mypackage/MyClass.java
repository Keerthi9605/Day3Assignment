package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		
		int[] data= new int[5];
		Scanner obj = new Scanner(System.in);
		
		for(int i=0; i<5; i++)
		{
			System.out.println("Enter any Number");
			data[i]= obj.nextInt();
		}
		
		for(int i=0; i<5; i++)
		
			System.out.println(data[i]);
		
		

	}

}
