//14. WAP to print all prime numbers between 1 to 100 

package Looping_Program;

public class Prime_number_14 
{
	public static void main(String[] args) 
	{
			for (int no=1;no<=100;no++) 
			{
				int temp=0;
				for(int i=2;i<=no-1;i++)
				{
					if (no%i==0)
					{
						temp=temp+1;
					}
				}
				if (temp==0)
				{
					System.out.println(no);
				}
			}
	}
}