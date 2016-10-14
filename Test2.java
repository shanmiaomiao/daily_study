//

public class Test2 {
	public static void main(String[] args){
	  String  m = "";
		m = print(10,20);
		System.out.println(m);
	}
	 
public static String print(int a,int b ){
	int number = a + b;
	String c = "";
	System.out.println(" a++ =" + (a++));
	System.out.println("a+a="+(a+a));
	System.out.println(" a + b =" + (a + b));
	System.out.println(" a - b =" + (a - b));
	System.out.println(" a * b =" + (a * b));
	System.out.println(" a / b =" + (a / b));
	System.out.println("a%b="+(a%b));
	//System.outprintln("a % b =" + (a % b));i
	System.out.println(" a++ =" + (a++));
	System.out.println(" a-- =" + (a--));
	System.out.println(" --a =" + (--a));
	System.out.println(" ++a =" + (++a));
	//return String.valueOf(number);
	//return Integer.toString(number);
	 return number+"";

	// 查看 d++ 与 ++d  的不同
	
	//System.out.println(" b++ =" + ( b++ ));
	//System.out.println(" ++b =" + ( ++b ));
	
	}

}
