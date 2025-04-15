package entities;

public class Employee {
	private String name;
	private double Salary, id;
	
	public Employee(String name, double salary, double id) {
		super();
		this.name = name;
		Salary = salary;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public double getSalary() {
		return Salary;
	}

	public void IncreaseSalary(double percentage) {
		this.Salary += (percentage/100) * this.Salary;
	}
	
	public String toString() {
		return "Employee: " + name + ", $ " + Salary;
	}
	
	
}
