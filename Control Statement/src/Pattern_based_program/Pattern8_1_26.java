package Pattern_based_program;

public class Pattern8_1_26 {
	public static void main(String[] args)
	{
		for(int k=1;k<=7;k++)
		{
			for(int i=7;i>=1;i--)
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
