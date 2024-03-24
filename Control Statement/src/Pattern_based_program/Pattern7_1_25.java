package Pattern_based_program;

public class Pattern7_1_25 {

	public static void main(String[] args) {
	
		for(int k=1;k<=4;k++)
		{
				for(int i=1;i<=k;i++) 
			{
				if(k>=2 && i<=k-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}	
			System.out.println();
		}
	}

}
