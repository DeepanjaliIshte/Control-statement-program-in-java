// 5. WAP to create calculator using Switch statement
package Selection_Statement;

import java.util.Scanner;

public class Cal_2_5 {

	public static void main(String[] args) {
		
		String yn;
		do {
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
		System.out.println("Do you want to continue(press Y for yes and n for no)");
		yn=sn.next();
		System.out.println();
		}
		while(yn.equals("y")||yn.equals("Y"));
	}
}
