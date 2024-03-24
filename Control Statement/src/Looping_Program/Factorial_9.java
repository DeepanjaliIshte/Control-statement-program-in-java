//9. WAP to find the Factorial of the number 

package Looping_Program;

import java.util.Scanner;

public class Factorial_9 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=sn.nextInt();
		int fact=1;
		for(int i =1; i<=no;i++)
		//for (int i=no;i>=1;i--)
			{
			fact=fact*i;
		}
			System.out.println("Factorial of "+no+" is "+fact);
		}

}
