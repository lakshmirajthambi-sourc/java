package java_programs;

import java.util.Scanner;

public class print_even_and_oddnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array limit");
		int a=sc.nextInt();
		System.out.println("enter the array");
		int[]arr=new int[a];
		for(int i=0;i<=arr.length-1;i++)
		{arr[i]=sc.nextInt();
		}
	System.out.println("the even number are");
	for(int i=0;i<=arr.length-1;i++) 
	{
		if(arr[i]%2==0)
		{
			System.out.println(arr[i]);
		}}

	System.out.println("the odd number are");	
	for(int i=0;i<=arr.length-1;i++) 
	{
		if(arr[i]%2==1)	{
		System.out.println(arr[i]);
	}
}}}

