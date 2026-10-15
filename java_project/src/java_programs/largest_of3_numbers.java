package java_programs;

import java.util.Scanner;

public class largest_of3_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enetr 3 number");
{
	int n=sc.nextInt();
	int i=sc.nextInt();
	int j=sc.nextInt();
	if(n>i&&n>j) {
		System.out.println("the greater number is "+n);
	}
	else if(i>j)
	{
		System.out.println("the greater number is"+i);
		
	}
	else {
		System.out.println("ther greater number is"+j);
	}
}
	}

}
