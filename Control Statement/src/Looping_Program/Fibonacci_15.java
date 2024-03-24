// 15. WAP to print Fibonacci series

package Looping_Program;

public class Fibonacci_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c;
		System.out.println("");
		
		for(int i=1;i<=10;i++) {
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
	}

}
