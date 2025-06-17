package day1;

import java.util.Scanner;

public class ScannerDemo
{
public static void main(String[] args) 
	{
	Scanner in = new Scanner(System.in);	
	
	System.out.println("Enter your name :");
	String Name =in.next();
	
	System.out.println("Enter your Age:");
	int Age=in.nextInt();
	
	System.out.println("Enter your salary:");
	double salary=in.nextDouble();
	
	System.out.println("Name :" + Name);
	System.out.println("Age :" + Age);
	System.out.println("Salary :" + salary);
	 in.close();
	}

}
