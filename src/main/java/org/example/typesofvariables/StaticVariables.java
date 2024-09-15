package org.example.typesofvariables;

public class StaticVariables {

    static double interstate=3.5;
    String accountHolder;
    double balance;

    static {
        System.out.println("Welocme to MY ABC  BANK");
    }

    public StaticVariables(String accountHolder,double balance)
    {
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    public void DisplayDetails()
    {
        System.out.println("Account Holder s: "+accountHolder+" Balance :"+balance+" Rate of Intreset :"+interstate);
    }
    public static void main(String[] args) {

        StaticVariables ac1=new StaticVariables("RAMU",36346);
        StaticVariables ac2=new StaticVariables("RAJU",5006);

        ac1.DisplayDetails();
        ac2.DisplayDetails();
    }
}
