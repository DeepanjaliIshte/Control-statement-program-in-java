//10. WAP to find the factorial of the number using recursion

package Looping_Program;

import java.util.Scanner;

public class Fact_by_Recursion_10 {
	static int fact=1;
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int no=sn.nextInt();
		Fact_by_Recursion_10 fr=new Fact_by_Recursion_10();
		fr.calFact(no);
		System.out.println("factorial of "+no+" is " +fact);
		
	}
	void calFact(int no) {
		if(no>=1) {
			fact=fact*no;
			calFact(no-1);
		}
	}

}
