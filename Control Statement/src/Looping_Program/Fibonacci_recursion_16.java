// 16. WAP to print Fibonacci series  using recursion

package Looping_Program;

public class Fibonacci_recursion_16 {
	static int a=0,b=1,c;
	
	public static void main(String[] args) 
		
		{
			System.out.println(a+""+b);
			Fibonacci_recursion_16 fbr = new Fibonacci_recursion_16();
				fbr.printFib(10);
		}
		void printFib(int i)
		{
			if (i>=1) {
				c=a+b;
				System.out.println(""+c);
				a=b;
				b=c;
				printFib(i-1);
						
		}
	}

}

