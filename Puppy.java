//测试类中的set get函数

public class Puppy {
	int puppyAge;
	public Puppy(String name){
		//这个构造器仅有一个参数：name
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
		
		/* 创建对象*/
		Puppy myPuppy = new Puppy("Tom");
		
		/*      */
		myPuppy.setAge(19);
		
		/* 调用另一种方法获取age */
		myPuppy.getAge();
		/* 你也可以像下面一样访问成员变量 */
		System.out.println("Variable Value :" + myPuppy.puppyAge);
		
		
		
		
	}

}
