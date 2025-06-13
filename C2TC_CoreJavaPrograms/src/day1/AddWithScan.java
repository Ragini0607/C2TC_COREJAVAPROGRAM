package day1;

import java.util.Scanner;

public class AddWithScan
{
public static void main(String[] args) 
	{
	int a,b,c;
	Scanner in= new Scanner(System.in);
	System.out.println("Enter a:");
	a=in.nextInt();
	System.out.println("Enter b:");
	b=in.nextInt();
	c=a+b;
	System.out.println("Addition of" +a+ " and " +b+" = " +c);
	}

}
