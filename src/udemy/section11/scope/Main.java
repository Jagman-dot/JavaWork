package udemy.section11.scope;

public class Main {

    public static void main(String[] args) {

        String privateVar = "This is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("Scope Instance private Var is " + scopeInstance.getPrivateVar());

        System.out.println(privateVar);

        scopeInstance.times();



    }





}
