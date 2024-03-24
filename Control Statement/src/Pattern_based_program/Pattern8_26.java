package Pattern_based_program;

public class Pattern8_26 {

	public static void main(String[] args) {
		for(int k=1;k<=4;k++)
		{
			for(int i=4;i>=k;i--) 
			{
			System.out.print(" ");
			}
			for (int j=1;j<=k;j++)
			{
				System.out.print(" *");	
			}
		System.out.println();
		}
	}

}

