package myjava.day014;

import java.util.Scanner;

public class UsernamePas {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		for (int i = 0; i < 3; i++) {
			

			
			System.out.println(i+1 + " denemeniz...");
			System.out.print("user name? ");
			String userName = scan.next();
			System.out.print("password? ");
			String userPass = scan.next();
			
			if (userName.equalsIgnoreCase("mete") && userPass.equalsIgnoreCase("password") ) {
				System.out.println("Welcome...");
				break;
			}else {
				System.out.println("Username veya Password yanlis girildi..");
				if (i==2) {
					
					System.out.println("The account is locked");
					break;
					
				}
			}
			

			
		}
		
	}
	

	

}
