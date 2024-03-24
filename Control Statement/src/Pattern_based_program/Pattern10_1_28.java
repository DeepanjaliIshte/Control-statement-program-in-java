package Pattern_based_program;

public class Pattern10_1_28 {

	public static void main(String[] args) {
		for(int i=5;i>=1;i--)	//Row
		{
			for(int j=5;j>i;j--) //Spaces
				{
					System.out.print(" ");
				}
			for(int k=1;k<(i*2);k++)
				{
				if(k>1 && k<(i*2)-1) 
				{
					System.out.print(" ");//spaces
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
