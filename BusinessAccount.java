package com.bank.bll;

public class BusinessAccount implements BankAccount {
	private double balance;
	
	public BusinessAccount() {
		
	}
	
	public BusinessAccount(double balance) {
		this.balance = balance;
	}
	
	@Override
	public double getBalance() {
		return balance;
	}
	
	@Override
	public void deposit(double amount) {
		if(amount >= 2500000) {
			balance = balance + amount + (0.01)* amount;
		}
		else
			balance = balance + amount;
	}
	
	@Override
	public boolean withdraw(double amount) {
		if((balance + 25000) > amount) {
			balance -= amount;
			return true;
		}
		
		return false;
	}
}
