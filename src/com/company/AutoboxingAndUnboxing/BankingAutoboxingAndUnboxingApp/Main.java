package com.company.AutoboxingAndUnboxing.BankingAutoboxingAndUnboxingApp;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Bank bank=new Bank("Pekao");

        bank.addBranch("Piotrkowska");
        bank.addBranch("Główna");
        bank.addBranch("Boczna");

        bank.addCustomer("Piotrkowska","Ewelina",100.52);
        bank.addCustomer("Piotrkowska","Marzena",56.65);
        bank.addCustomer("Piotrkowska","Jula",107.52);
        bank.addCustomer("Główna","Mola",1007.52);
        bank.addCustomer("Główna","Regina",12207.52);

        bank.addCustomerTransaction("Piotrkowska","Ewelina",5888.99);
        bank.addCustomerTransaction("Piotrkowska","Ewelina",55.00);
        bank.addCustomerTransaction("Piotrkowska","Marzena",6595.26);

        bank.listCustomers("Główna",false);
    }



}
