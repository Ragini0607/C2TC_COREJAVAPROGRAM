package day3.student;

public class student {
	private int id;
	private String sname;
	private String course;
	student()
	{
		System.out.println("I am Default constructor");
		
	}
	student (int id)
	{
		System.out.println("Id: "+id);
	}
	
	student(String course,String sname)
	{
		System.out.println("course:"+course+" name: "+sname);
	}
	
}