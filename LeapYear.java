import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a year: ");
		int year = in.nextInt();
		
		boolean decision = isLeapYear(year);
		System.out.println(decision);	
	}
	
	public static boolean isLeapYear(int year)
	{
		boolean answer=true;
		int yearDetermine = year%100;
	
		
		if (yearDetermine==0)
			{
			int yearActual = year%400;
		
			if (yearActual == 0)
			{
				answer = true;
			}
			else if(yearActual != 0)
			{
				answer = false;
			}
			}
		else if (yearDetermine!=0)
			{
			int yearActual2 =year%4;
			if (yearActual2==0)
			{
				answer = true;
			}
			else if (yearActual2!=0)
			{
				answer = false;
			}
		
		
			}
		return answer;
	}	
}

