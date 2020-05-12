package udemy.section11.statictest;

public class Main {

    public static void main(String[] args) {

       StaticTest firstInstance = new StaticTest("1st instance");
//     System.out.println(firstInstance.getName() + " is Instance number : " + StaticTest.getNumInstances());
//
        StaticTest secondInstance = new StaticTest("2ndst instance");
//      System.out.println(secondInstance.getName() + " is Instance number : " + StaticTest.getNumInstances());

        StaticTest thirdInstance = new StaticTest("3rd instance");

        System.out.println(StaticTest.getNumInstances());
        System.out.println(StaticTest.getNumInstances());
        System.out.println(StaticTest.getNumInstances());


        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        System.out.println(" ");


    }




}
