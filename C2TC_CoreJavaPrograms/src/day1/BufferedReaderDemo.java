package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedReaderDemo
{
	public static void main(String[] args) throws IOException
	{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your name:");
	String Name=reader.readLine();
	
	System.out.println("enter your age:");
	int age = Integer.parseInt(reader.readLine());
	
	 System.out.println("enter your salary");
	 double salary=Double.parseDouble(reader.readLine());
	 System.out.println("Name:"+Name);
	 System.out.println("Age:" +age);
	 System.out.println("Salary:"+salary);
	}

}
