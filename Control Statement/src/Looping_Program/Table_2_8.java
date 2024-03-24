//8. WAP program to print the table of any number

package Looping_Program;

import java.util.Scanner;

public class Table_2_8 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no=sn.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(no+"*"+i+"="+no*i);
		}
	}
}
