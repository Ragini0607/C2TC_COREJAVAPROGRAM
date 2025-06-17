package Entity;

public class Student
{           private int Id;
			private String Name;
			private int Age;
			public int getId() {
				return Id;
			}
			public void setId(int id) {
				Id = id;
			}
			public String getName() {
				return Name;
			}
			public void setName(String name) {
				Name = name;
			}
			public int getAge() {
				return Age;
			}
			public void setAge(int age) {
				Age = age;
			}
			@Override
			public String toString() {
				return "Student [Id=" + Id + ", Name=" + Name + ", Age=" + Age + "]";
			}
			
}
		
