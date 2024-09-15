package org.example.typesofvariables;

public class Instancevariables {
    String accountHolderName;// instance variable
      double balance; //instance variable
    public Instancevariables(String accountHolderName,double balance)
    {
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }
    public  void displayAccountDetails()
    {
        System.out.println("Account Holder Name is "+accountHolderName+" and Balance is"+balance);
    }

    public static void main(String[] args) {

        Instancevariables account1=new Instancevariables("BALU",5000);
        Instancevariables account2=new Instancevariables("SAI KUMAR",5000);

        account1.displayAccountDetails();
        account2.displayAccountDetails();

    }
}
