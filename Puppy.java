//�������е�set get����

public class Puppy {
	int puppyAge;
	public Puppy(String name){
		//�������������һ��������name
		System.out.println("Passed  Name is:"+ name);
	}
	public void setAge(int age){
		puppyAge = age;
	}
	public int getAge(){
		System.out.println("Puppy's age is :"+ puppyAge);
		return puppyAge;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* ��������*/
		Puppy myPuppy = new Puppy("Tom");
		
		/*      */
		myPuppy.setAge(19);
		
		/* ������һ�ַ�����ȡage */
		myPuppy.getAge();
		/* ��Ҳ����������һ�����ʳ�Ա���� */
		System.out.println("Variable Value :" + myPuppy.puppyAge);
		
		
		
		
	}

}
