package udemy.section11.scope;

public class ScopeCheck {

    //scope of various objects and

    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck(){

        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar = " + privateVar);

    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void times(){

        // this variable will have local scope to this class
        int privateVar = 2;

        for (int i = 0; i < 10; i++){


            System.out.println(i + " times 2 is " + i * privateVar);


        }
    }





}
