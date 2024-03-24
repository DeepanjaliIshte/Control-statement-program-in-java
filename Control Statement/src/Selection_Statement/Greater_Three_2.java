//2. Write a program to find the larger of three number

 package Selection_Statement;
public class Greater_Three_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=30;
		
		if(a>b) {
			if(a>c) {
				System.out.println("a is greater than c");
			}
			else {
				System.out.println("c is greater than a");
			}
		}
		else if(b>c) {
			System.out.println("b is greater than c");
		}
		else
		{
			System.out.println("c is greate than b");
		}
	}
	
}
