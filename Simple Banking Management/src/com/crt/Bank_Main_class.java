package com.crt;
import java.util.Scanner ;
import com.crt.Bank1;
import com.crt.ArrayListBank;
public class Bank_Main_class {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayListBank b1 = new ArrayListBank();
		
		while (true) {
			System.out.println("1. Add Account");
			System.out.println("2. View Account");
			System.out.println("3. Delete Account");
			System.out.println("4. Update Account");
			System.out.println("5. Exit");

			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				b1.addAccount();
				break;
			}
			case 2: {
				b1.listAccount();
				break;
			}
			
			case 3: {
				b1.deleteAccount();
				break;
			}
			
			case 4: {
				b1.updateAccount();
				break;
			}
			case 5:
				System.out.println("Exiting...");
				sc.close();
				return;
				
			default:
				System.out.println("Invalid Choice Please Try Again...");
			}
		}

	}
}
