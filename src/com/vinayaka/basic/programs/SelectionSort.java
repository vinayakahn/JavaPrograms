package com.vinayaka.basic.programs;

import java.util.Scanner;

public class SelectionSort {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size,i,j,temp;
		int arr[]=new int[50];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		size = sc.nextInt();
		
		System.out.println("Enter the array elements: ");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Sorting array using selection sort: ");
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Now THe Array after sorting: ");
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]+" ");
		}

	}

}
