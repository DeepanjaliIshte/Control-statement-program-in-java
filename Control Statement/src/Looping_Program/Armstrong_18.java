//WAP to check for armstrong number

package Looping_Program;

public class Armstrong_18 {

	public static void main(String[] args) {
		int no=153;
		int t1=no;
		int Length=0;
		while(t1 != 0)
		{
				Length=Length+1;
				t1=t1/10;
			}
			int t2= no ;
			int arm=0;
			int rem;
			while(t2 != 0)
			{
				int mul =1;
				rem = t2%10;
				for (int i=1;i<=Length;i++)
				{
					mul=mul*rem;
				}
				arm=arm+mul;
				t2=t2/10;
			}
			if(arm==no) 
			{
				System.out.println(no+ " is armstrong");
			}
			else
			{
				System.out.println(no+ " is not armstrong");
			}
		}
	}


