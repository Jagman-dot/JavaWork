package udemy.section11.statictest;

public class Main {

    public static void main(String[] args) {

        StaticTest firstInstance = new StaticTest("1st instance");
        System.out.println(firstInstance.getName() + " is Instance number : " + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2ndst instance");
        System.out.println(secondInstance.getName() + " is Instance number : " + StaticTest.getNumInstances());


    }




}
