
public class A11dot2 {

	public static void main(String[] args) {
		Person p = new Person("Bob", "123 North", "555-1234", "bob@bob.com");
		System.out.println(p);
		Student s = new Student("Ann", "234 South", "555-2345", "ann@ann.com", "Senoir");
		System.out.println(s);
		Employee e = new Employee("Joe", "345 East", "555-3456", "joe@joe.com","111 STC", 85000, "1 Jun 2000");
		System.out.println(e);
		Faculty f = new Faculty("Sue", "456 West", "555-4567", "sue@sue.com", "222 STC", 150000, "1 Sept 2015", "10-11", "Full Professor");
		System.out.println(f);
	}

}
class Person{
	String name;
	String address;
	String phone;
	String email;

	Person(){
	}

	Person(String name, String address, String phone, String email){
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	public String toString() {
		return "Person -" + name + " lives at " + address;
	}
}
class Student extends Person{
	String status;

	Student(){
	}

	Student(String name, String address, String phone, String email, String status){
		super(name, address, phone, email);
		this.status = status;
	}
	public String toString() {
		return "Employee -" + name + " lives at " + address;
	}
}
class Employee extends Person{
	String office;
	int salary;
	String dateHired;

	Employee(){
	}

	Employee(String name, String address, String phone, String email, String office, int salary, String dateHired){
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	public String toString() {
		return "Employee -" + name + " lives at " + address;
	}
}
	class Faculty extends Employee{
		String officeHours;
		String rank;

		Faculty(){
		}

		Faculty(String name, String address, String phone, String email,String office, int salary, String dateHired, String officeHours, String rank){
			super(name, address, phone, email, office, salary, dateHired);
			this.officeHours = officeHours;
			this.rank = rank;
		}
		public String toString() {
			return "Faculty -" + name + " lives at " + address;
		}
	}
