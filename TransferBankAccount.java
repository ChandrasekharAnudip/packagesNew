package com.bank.bll;

public interface TransferBankAccount extends BankAccount {
	/*
	public boolean transferTo(double amount, SavingAccount acc);
	public boolean transferTo(double amount, SalaryAccount acc);
	public boolean transferTo(double amount, BusinessAccount acc);
	*/
	
	public boolean transferTo(double amount, BankAccount acc);
	
	// Base class reference can hold derived class object.
}
