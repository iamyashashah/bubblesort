package bubblesort;

import java.util.Scanner;


public class bubblesort {

	public static void main(String[] args) {
		int n;
		String temp = new String();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number of names you want to enter: ");
		
		n = sc.nextInt();
		
		String names [] = new String[n];
		
		System.out.println("enter all the names: ");
		for (int i = 0; i < n; i++)
		{
			System.out.print("enter next name: ");
			names[i] = sc.next();
		}
		
		for (int i = 0; i < n-1; i++)
		{
			for (int j = 0; j < n-1; j++)
			{
				if (names[j].compareTo(names[j+1])>0)
				{
					temp = names[j];
					names[j] = names[j+1];
					names[j+1] = temp;
					
				}
			}
		}
		System.out.print("Names in Sorted Order:");
		
		for (int i = 0; i < n ; i++) 
		{
            System.out.print(names[i] + ",");
            
            
            
		}
		System.out.print(names[n - 1]);
	}

}
