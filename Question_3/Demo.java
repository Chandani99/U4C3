package Question_3;

import java.util.Scanner;



public class Demo {
	public void showDetails(Month m) {
		try {
			switch(m.toString()) {
			case "JAN":
				System.out.println("This is the 1st month of the year January");
				break;
			case "FEB":
				System.out.println("This is the 1st month of the year February");
				break;
			case "MARCH":
				System.out.println("This is the 1st month of the year March");
				break;
			case "APRIL":
				System.out.println("This is the 1st month of the year April");
				break;
			case "MAY":
				System.out.println("This is the 1st month of the year May");
				break;
			case "JUNE":
				System.out.println("This is the 1st month of the year June");
				break;
			case "JULY":
				System.out.println("This is the 1st month of the year July");
				break;
			case "AUG":
				System.out.println("This is the 1st month of the year August");
				break;
			case "SEP":
				System.out.println("This is the 1st month of the year September");
				break;
			case "OCT":
				System.out.println("This is the 1st month of the year October");
				break;
			case "NOV":
				System.out.println("This is the 1st month of the year November");
				break;
			case "DEC":
				System.out.println("This is the 1st month of the year December");
				break;
			default:
				System.out.println("Enter valid input");
			}
		}
		catch(IllegalArgumentException iae) {
			System.out.println("Enter valid input");
		}
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of month");
		String month=sc.next();
		Month mon=Month.valueOf(month);
		
		d.showDetails(mon);
		// TODO Auto-generated method stub

	}

}
