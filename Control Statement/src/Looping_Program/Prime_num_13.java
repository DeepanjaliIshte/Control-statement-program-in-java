//13 . WAP to check for prime number 

package Looping_Program;

import java.util.Scanner;

public class Prime_num_13 {

	public static void main(String[] args) {
	Scanner sn= new Scanner(System.in);
	System.out.print("Enter the number : ");
	int no=sn.nextInt();
	int temp=0;
	
	for (int i=2;i<=no-1;i++) {
			if(no%i==0) {
				temp= temp+1;
			}
		}
	if (temp==0) {
		System.out.println(no+" is prime number");
	}
	else {
		System.out.println(no+" is not  prime number");
	}
	}

}
