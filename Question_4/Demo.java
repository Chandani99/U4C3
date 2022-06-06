package Question_4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
	public boolean validate(String username,String password,String mobileNumber,String email) {
		int flag=0;
		if(Pattern.matches("[a-zA-z]{3,8}", username)) {
			flag++;
		}
		if(Pattern.matches("[a-zA-z0-9]{3,8}", password)) {
			flag++;
		}
		if(Pattern.matches("[6789]{1}[0-9]{9}", mobileNumber)) {
			flag++;
		}
		if(Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email)) {
			flag++;
		}
		
		if(flag==4) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter user name");
		String name=sc.next();
		
		System.out.println("Enter password");
		String pass=sc.next();
		
		System.out.println("Enter mobile number");
		String mobNo=sc.next();
		
		System.out.println("Enter email Id");
		String email=sc.next();
		
		Demo d1=new Demo();
		boolean check=d1.validate(name,pass,mobNo,email);
		if(check) {
			Customer cus=new Customer();
			cus.setUsername(name);;
			cus.setEmail(email);
			cus.setMobileNumber(mobNo);
			cus.setPassword(pass);
			
			System.out.println("User name" + cus.getUsername());
			System.out.println("Email Id" +cus.getEmail());
			System.out.println("Mobile Number" + cus.getMobileNumber());
			System.out.println("Password" +cus.getPassword());
		}
		else {
			System.out.println("Please Enter a valid input" );
		}

	}

}
