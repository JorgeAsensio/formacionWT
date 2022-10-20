package com.curso.domain;

import java.io.Serializable;

public class Customer implements Serializable{
	private int idCustomer;
	private String firstName;

	private String lastName;

	private Account[] accounts;
	private int numberOfAccounts;

	public Customer(int id, String f, String l) {
		firstName = f;
		lastName = l;
		idCustomer = id;
		// initialize accounts array
		accounts = new Account[10];
		numberOfAccounts = 0;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	public void addAccount(Account acct) {
		int i = numberOfAccounts++;
		accounts[i] = acct;
	}

	public int getNumOfAccounts() {
		return numberOfAccounts;
	}

	public Account getAccount(int account_index) {
		return accounts[account_index];
	}
}
