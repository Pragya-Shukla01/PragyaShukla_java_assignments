package com.coforge.Day6;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Account {
 private long accId;
 private String accHolderName;
 private String bankName;
 private double balance;
 public void withDraw(double amount) throws InsufficientFundsException {
	 if(amount<=this.balance) {
		 this.balance-=amount;
		 System.out.println("Withdraw Successful");
	 }
	 else {
	throw new InsufficientFundsException("Not Successful");
	 }
 }
 public void deposit(double amount) {
	 this.balance += amount;
	 System.out.println("amount deposited");
 }
}
