package com.crt;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBank {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Bank1> arrayList = new ArrayList<>();

	public void addAccount() {
		System.out.println("Enter Account Number:");
		int AccNo = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter Name: ");
		String name = scanner.nextLine();
		

		System.out.println("Enter Account Type:");
		String accType = scanner.nextLine();
		
		
		System.out.println("Enter Balance:");
		int balance = scanner.nextInt();

		Bank1 b1 = new Bank1(AccNo, name, accType, balance);
		arrayList.add(b1);
		System.out.println("Account Add Successfully..");

	}

	public void listAccount() {
		if (arrayList.isEmpty()) {
			System.out.println("Record Not Found..");
		} else {
			for (Bank1 b1 : arrayList) {
				System.out.println(b1);
			}
		}

	}
	
	public void deleteAccount() {
		System.out.println("Enter Account Number: ");
		int id = scanner.nextInt();
		
		Bank1 b1 = findByAccountNo(id);
		if(arrayList.remove(b1)) {
			System.out.println("Account Delete Success");
		}else {
			System.out.println("Account Not  Delete ");
		}
		
	}
	
	
	private Bank1 findByAccountNo(int AccNo) {
		
		for (Bank1 b1 : arrayList) {
			if(b1.getAccNo()==AccNo) {
				return b1;
			}
		}
		return null;
		
		
	}
	
public void updateAccount() {
		
		System.out.println("Enter Account number : ");
		int AccNo = scanner.nextInt();
		scanner.nextLine();
		
		Bank1 b1 = findByAccountNo(AccNo);
		if(b1!= null) {
			
			
			System.out.println("Enter Account Number: ");
			int accNo = scanner.nextInt();
			
			System.out.println("Enter Name");
			String name = scanner.nextLine();
			scanner.nextLine();
			
			b1.setAccNo(accNo);
			b1.setName(name);
			
			System.out.println("Account Updated Successfully");
			
		}else {
			System.out.println("Account Not Updated");
		}
		
		
		
		
		
	}

	


}
