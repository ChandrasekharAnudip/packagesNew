package com.bank.bll;

public interface BankAccount {
	public double getBalance();
	public void deposit(double amount);
	public boolean withdraw(double amount);
}
