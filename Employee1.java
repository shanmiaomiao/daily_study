
public class Employee1 {
	//这个成员变量对子类可见
	public String name;
	//私有变量，仅在该类可见
	private double salary;
	//在构造器中对name赋值
	public Employee1(String empName){
		name = empName;
	}
	//设定salary的值；
	public void setSalary(double empSal){
		salary = empSal;
	}
	//打印信息
	public void printEmp(){
		System.out.println("name :"+ name);
		System.out.println("salaey :"+ salary);
	}
	public static void main(String[] args){
		Employee1 empOne = new Employee1("Lily");
		empOne.setSalary(10000);
		empOne.printEmp();
	}
}
