package lesson5;

public class Test {
    public static void main(String[] args) {

        System.out.println("Task 1");

//        System.out.println(new ExponentiationNumber().run(0, 0));
//        System.out.println(new ExponentiationNumber().run(1, 1));
//        System.out.println(new ExponentiationNumber().run(1, 0));
//        System.out.println(new ExponentiationNumber().run(0, 1));
//        System.out.println(new ExponentiationNumber().run(-1, 0));
//        System.out.println(new ExponentiationNumber().run(0, -1));
//        System.out.println(new ExponentiationNumber().run(1, -1));
//        System.out.println(new ExponentiationNumber().run(-1, 1));
//        System.out.println(new ExponentiationNumber().run(-1, -1));

//        System.out.println(new ExponentiationNumber().run(20, 0));
//        System.out.println(new ExponentiationNumber().run(20, 1));
//        System.out.println(new ExponentiationNumber().run(20, 2));
//        System.out.println(new ExponentiationNumber().run(20, 10));
//
//        System.out.println(new ExponentiationNumber().run(-20, 0));
//        System.out.println(new ExponentiationNumber().run(-20, 1));
//        System.out.println(new ExponentiationNumber().run(-20, 2));
//        System.out.println(new ExponentiationNumber().run(-20, 10));
//
//        System.out.println(new ExponentiationNumber().run(20, -1));
//        System.out.println(new ExponentiationNumber().run(20, -2));
//        System.out.println(new ExponentiationNumber().run(20, -10));
//
//        System.out.println(new ExponentiationNumber().run(-20, -1));
//        System.out.println(new ExponentiationNumber().run(-20, -2));
//        System.out.println(new ExponentiationNumber().run(-20, -10));

        System.out.println("Task 2 - Задача о рюкзаке");

        Backpack bp = new Backpack(15, 9);
        bp.showAllThings();
        bp.uploadBackpack();
        bp.showThingsInBackpack();

    }
}
