
public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	private String mpDesig;
	//Employee  类的构造器
	public Employee(String name){
		this.name = name;
	}
	//
	public void empAge(int empAge){
		age = empAge;
	}
	//
	public void empDesignation(String empDesig){
		designation = mpDesig;
	}	
	public void empsalary(double empSalary){
		salary = empSalary;
	}
	/* */
	public void printEmployee(){
		System.out.println("Name:"+ name);
		System.out.println("Age:"+ age);
		System.out.println("Designation:"+ designation);
		System.out.println("Salary:"+ salary);
	}
	public static void main(String[] args){
		Employee employeeOne = new Employee("JACK");
		Employee employeeTwo = new Employee("BOB");
		
		employeeOne.empAge(21);
		employeeOne.empDesignation("Software Engineer");
		employeeOne.empsalary(10000);
		employeeOne.printEmployee();
		
		employeeTwo.empAge(19);
		employeeTwo.empDesignation("Senior Software Engineer");
		employeeTwo.empsalary(9000);
		employeeTwo.printEmployee();
	}
}

