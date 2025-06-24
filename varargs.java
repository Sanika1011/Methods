package methods;

public class varargs {

	
	
		 static void display(String... values){  
			  System.out.println("display method invoked ");
			  for (String value : values) {
		            System.out.print(value+" ");
		        }
			  
			 }  
		 
		 static void printnumber(int... numbers) {
			 for(int num:numbers) {
				 System.out.print(num + " ");
			 }
		 }
		 
		 public static void printDetails(Object... details) {
			 for(Object det:details) {
				 System.out.println(det);
			 }
		 }
			  
	public static void main(String args[]){  
			  
			 display();//zero argument   
			 display("my","name","is","varargs");//four arguments
			 System.out.println();
			 
			 printnumber();
			 printnumber(1,2,3,4,5);
			 System.out.println();
			 
			 printDetails("sanika",90,9.5);
	}

}
