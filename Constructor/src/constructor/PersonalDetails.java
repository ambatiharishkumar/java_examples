package constructor;

public class PersonalDetails 
{
	int age;
	String name;
	PersonalDetails()
	{
		this.age=22;
		this.name="Ambati Harish kumar";
		System.out.println(this.name + " is "+ this.age);
	}
	PersonalDetails(String n, int a)
	{
		this.name=n;
		this.age=a;
		System.out.println(this.name + " is "+ this.age);
	}
	public static void main(String[] args) 
	{
	
		PersonalDetails s =  new PersonalDetails();
		PersonalDetails d =  new PersonalDetails("Hari",23);
	
	
	}
}
