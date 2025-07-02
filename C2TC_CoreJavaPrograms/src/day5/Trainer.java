//this program to demonstrate the Trainer sub class or deriverd class
package day5;

public class Trainer extends Person{
	private String designation;
	private String location;
	
	public Trainer()//default constructor
	{
		super();//calling base class constructor
		this.designation="program trainer";
		this.location=" chennai";
	}
	public Trainer(int id, String name,String city, String designation, String location)
	{
		super(id,name,city);
		this.designation=designation;
		this.location=location;
				
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Trainer [id=" +getId()+", Name=" +getName()+"" + ", city=" +getCity() +",  designation=" 
	+ designation + ", Location=" + location + "]";
	}

}
