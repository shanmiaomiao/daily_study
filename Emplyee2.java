//测试final修饰的 变量和普通变量之间的区别
//final修饰的 变量 一定要有初始化值，且在使用时不可改变变

public class Emplyee2 {
	//salary 是静态的私有变量
	private static double salary;
	//DEPARMENT是一个常量
	public static final String DEPERMENT = "开发部门";
	public static void main(String[] args){
		salary = 10000;
		System.out.println(DEPERMENT+"平均工资："+salary);
	}

}
