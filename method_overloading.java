package methods;

public class method_overloading {
	static void foo() {
		System.out.println("good morning sanika");
	}
	
	static void foo(int a) {
		System.out.println("good morning "+ a + " sanika");
	}
	
	static void foo(int a, int b) {
		System.out.println("good morning " + a +  " sanika");
		System.out.println("good morning " + b +  " sanika");
	}
	
	
	
	static void tellJoke() {
		System.out.println("i invented a joke");
	}
	
	static void change(int a) {
		a = 10;
	}
	
	static void change2(int arr[]) {
		arr[0] = 60;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tellJoke();
		int x = 19;
		change(x);
		System.out.println(x);
		
		int marks[] = {10, 20, 30, 40, 50};
		change2(marks);
		System.out.println(marks[0]);
		
		
		foo();
		foo(30);
		foo(30,40);
		
	}

}
