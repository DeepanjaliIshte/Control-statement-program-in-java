//5. WAP to create calculator using Switch statement

package Selection_Statement;

import java.util.Scanner;

public class Cal_5 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the First number");
		int no1=sn.nextInt();
		System.out.println("Enter the Second number");
		int no2=sn.nextInt();
		System.out.println("Select Symbol +,-,*,/");
		String sym=sn.next();
		int result ;
		switch(sym)
		{
			case"+":result=no1 + no2;
				System.out.println("Addition is "+result);
			break;
			case"-":result=no1 - no2;
				System.out.println("Substraction is "+result);
			break;
			case"*":result=no1 * no2;
				System.out.println("Multiplication is "+result);
			break;
			case"/":result=no1 / no2;
				System.out.println("Division is "+result);
			break;
			default: System.out.println("Invalid Symbol");
			break;
		}
	}

}
