package methods;

public class methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 5;
//        int b = 7;
//        int c;
//        methods obj = new methods();
        //c = obj.logic(a, b);
        //System.out.println(c);

//        c = logic(a, b);
//        System.out.println(a + " "+ b);
//	}
//	
//	static int logic(int x, int y) {
//		int z;
//		if(x>y) {
//			z = x + y;
//		}
//		else {
//			z = x * y;
//		}
//		x=555;
//		return z;
//	}

		
		//fibonacci series
//		int n1=0,n2=1,n3,i,count=10;
//		System.out.print(n1+" "+n2);
//		for(i=2;i<count;++i) {
//			n3=n1+n2;
//			System.out.print(" "+n3);
//			n1=n2;
//			n2=n3;
//		}
		
//		multiply(2);
		
		
//		* 
//		* * 
//		* * * 
//		* * * *
		
//		int size = 4;
//		for(int i=1;i<=size;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
//		int result = sum(4);
//		System.out.print("the sum of n numbers : " + result);
		
		
		
//		* * * * 
//		* * * 
//		* * 
//		* 

		
		
//		int size = 5;
//		for(int i=1;i<=size;i++) {
//			for(int j=i;j<=size;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
//		int n1=0,n2=1,n3,i,count=10;
//		System.out.print(n1+" "+n2);
//		for(i=2;i<count;++i) {
//			n3=n1+n2;
//			System.out.print(" "+n3);
//			n1=n2;
//			n2=n3;
//		}
		
		
		int result = fibonacci(5);
		System.out.print("the nth value of fibonnaci is : "+result);
		
	}
		
	
	
//	print value of nth term of fibonacci series
	static int fibonacci(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		else {
			return (n-1)+(n-2);
		}
	}
	
	
	
	
	//method to print sum of n natural numbers
//	static int sum(int n) {
//		if(n==1) {
//			return 1;
//		}
//		return n + sum(n-1);
//
//	}	
	
	
	
	
	
	
	
//	function to print table of any number
//	static void multiply(int n) {
//		for(int i=1;i<=10;i++) {
//		    System.out.print(n*i+"\t");
//	    }
//	}	
}








































