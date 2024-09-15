package org.example.typesofvariables;

public class LocalVariables {

    public  void calculateInterest()
    {
        int principle=1000; //local variable double
        double rate=5.5;
        double time=1;
        double result=(principle*rate*time)/100;
        System.out.println("Result "+result);
    }

    public  void oneMonth()
    {
        int principle=1000; //local variable double
        double rate=5.5;
        double time=1;
        double result=(principle*rate*time)/100;
        System.out.println("Result "+result);
    }
    public  void oneYear()
    {
        int principle=1000; //local variable double
        double rate=5.5;
        double time=1;
        double result=(principle*rate*time)/100;
        System.out.println("Result "+result);
    }
    public static void main(String[] args) {

        LocalVariables obj=new LocalVariables();
        obj.calculateInterest();
    }
}
