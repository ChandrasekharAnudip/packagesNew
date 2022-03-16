package com.bank.bll;

public class SavingAccount implements BankAccount {
	private double balance;
	
	public SavingAccount() {
		
	}
	
	public SavingAccount(double balance) {
		this.balance = balance;
	}
	
	
	@Override
	public double getBalance() {
		return balance;
	}
	
	@Override
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	@Override
	public boolean withdraw(double amount) {
		if((balance - 5000) > amount) {
			balance = balance - amount;
			return true;
		}
		
		return false;
		
	}
}
