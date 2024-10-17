package com.crt;

public class Bank1 {
	public int AccNo;
	public String name;
	public String accType;
	public long balance;
	
	public Bank1(int AccNo, String name, String accType, long balance) {
		this.AccNo = AccNo;
		this.name = name;
		this.accType = accType;
		this.balance = balance;
	}

	public int getAccNo() {
		return AccNo;
	}

	public void setAccNo(int AccNo) {
		this.AccNo = AccNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return accType;
	}

	public void setType(String accType) {
		this.accType = accType;
	}
	
	public long getbalance() {
		return balance;
	}
	 
	public void setbalance(long balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Bank Details:[Account Number:" + AccNo + "Name:" + name +"Account type:" + accType +"Balance]" +balance;
		
	}
}
