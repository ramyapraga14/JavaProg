package AdvanceJavaPack1;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		method2(20,40);
		String x= method3();
		System.out.println(x);
		String y = method4(2,8, "Hello World");
		System.out.println(y);

	}
	static void method1() {
		System.out.println("This is a method without arguments and without return type");
		int a=5;
		int b=10;
		int sum=a+b;
		System.out.println(sum);
	}
	static void method2(int a, int b) {
		System.out.println("This is a method with arguments and without return type");
		int sum=a+b;
		System.out.println(sum);
	}
	static String method3() {
		System.out.println("This is a method without arg and with return type");
		return "method3";
	}
	static String method4(int a, int b, String k) {
		return k.substring(a, b);
		
	}

}
