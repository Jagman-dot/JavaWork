package udemy.section11.access;

public class Main {

    public static void main(String[] args) {

        Account jagmanAccount = new Account("Jagman");


        jagmanAccount.deposit(10000);
        jagmanAccount.withdraw(1000);
        jagmanAccount.withdraw(-2000);

        jagmanAccount.deposit(-200);

        jagmanAccount.calculateBalance();


    }



}
