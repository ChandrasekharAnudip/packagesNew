package com.bank.bll;

public class TransferAccount implements TransferBankAccount{
	private double balance;
	
	public TransferAccount() {
		
	}
	
	public TransferAccount(double balance) {
		this.balance = balance;
	}
	
	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		
	}

	@Override
	public boolean withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			return true;
		}
		
		return false;
	}

	@Override
	public boolean transferTo(double amount, BankAccount acc) {
		//1. withdraw from the fromAccount
		if(withdraw(amount) == true) {
			//2. deposit withdrawal amount to toAccount(acc)
			acc.deposit(amount);
			return true;
		}
		
		return false;
		
	}
	
}
