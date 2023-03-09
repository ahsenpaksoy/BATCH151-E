package myjava.day014;

import java.util.Scanner;

/*
 * 
        //Kullanici username ve password'u girsin.
        //3 kereden fazla yanlis girerse "Your account was blocked" mesaji alsin
        //3 kereye kadar yanlis girerse "Invalid username or password, try again" mesaji alsin
        //Dogru girerse "Welcome to your account" mesaji alsin

 */

public class UserNameAndPassword {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		

		int counter = 0;
		while (true) {
			counter++;
			System.out.println(counter + " denemeniz...");
			System.out.print("user name? ");
			String userName = scan.next();
			System.out.print("password? ");
			String userPass = scan.next();
			
			if (userName.equalsIgnoreCase("mete") && userPass.equalsIgnoreCase("password") ) {
				System.out.println("Welcome...");
				break;
			}else {
				System.out.println("Username veya Password yanlis girildi..");
			}
			if (counter>=3) {
				System.out.println("3 defa yanlis girildi.The account is locked...");
				break;
				
			}
			
		}
		
		}
		
	}


