package com.coforge;

public class MainPayment {
    public static void main(String[] args) {
        Payment p1 = new CardPayment("4111111111111234", "123", "12/28");
        Payment p2 = new UpiPayment("pragya@upi", "HDFC Bank");
        Payment p3 = new NetBankingPayment("008765432109", "ICICI Bank", "ICIC0001234");
        Payment p4 = new WalletPayment("WAL123456", "Paytm", "9876543210");

        p1.pay(1499.00);
        p2.pay(250.50);
        p3.pay(9999.99);
        p4.pay(75.00);

        Payment p5 = new CardPayment();
        p5.pay(100.00);
    }
}
