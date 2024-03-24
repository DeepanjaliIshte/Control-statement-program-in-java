package Pattern_based_program;

public class pattern7_25
{
	public static void main(String[] args)
	{
		for(int k=1;k<=4;k++)
		{
				for(int i=4;i>=k;i--) 
			{
				if(i>k)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(" *");
				}
			}	
			System.out.println();
		}
	}
}

