package com.tns.day8.interfacee;

public interface Bank {
	double MIN_BALANCE=1000;
	double DEPOSIT_LIMIT=25000;
	double INTEREST_RATE=7.8;
	
	void deposite(Account account, double amount);
	void withdraw(Account account, double amount);

}
