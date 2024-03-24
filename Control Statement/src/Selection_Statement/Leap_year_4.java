//4. WAP to check for Leap year

 package Selection_Statement;
public class Leap_year_4 {

	public static void main(String[] args) {
	
			int year =2018;
			if(year%4==0) {
				if(year%100==0)
				{
					if(year%400==0) {
						System.out.println(" leap year");
					}
					else {
						System.out.println("not a leap year");
					}
				}
				else {
					System.out.println("leap year");
				}
			}
			else
			{
				System.out.println("not a leap year");
			}
	}

}

