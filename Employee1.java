
public class Employee1 {
	//�����Ա����������ɼ�
	public String name;
	//˽�б��������ڸ���ɼ�
	private double salary;
	//�ڹ������ж�name��ֵ
	public Employee1(String empName){
		name = empName;
	}
	//�趨salary��ֵ��
	public void setSalary(double empSal){
		salary = empSal;
	}
	//��ӡ��Ϣ
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
