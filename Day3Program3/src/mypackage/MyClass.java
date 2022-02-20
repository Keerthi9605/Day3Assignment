package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		int[] data = new int[5];
		
		Scanner obj = new Scanner(System.in);
		int temp = 0;
		
		for(int i=0; i<data.length; i++)
		{
			System.out.println("Enter any Number");
			data[i]=obj.nextInt();
		}
		for(int d:data)
		{
			if(d>temp)
				temp=d;
		}
		System.out.println("Biggest Number" +temp);
		

	}

}
