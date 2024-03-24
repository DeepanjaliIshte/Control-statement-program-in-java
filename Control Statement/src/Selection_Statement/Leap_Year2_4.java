//4.WAP to check for Leap year
 package Selection_Statement;
public class Leap_Year2_4{
	
	public static void main(String[] args) {
		
			int year=2020;
			if((year%400==0)||(year%4==0 && year%100!=0)) {
				System.out.println("Leap Year");
			}
			else {
				System.out.println("Not a Leap Year");
			}
	}	

}
