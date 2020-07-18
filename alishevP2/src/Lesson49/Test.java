package Lesson49;

/**
 * @author BR
 */
public class Test {
    public static void main(String[] args) {
//        someMethod();

//        counter(1);

        // 4! = 4 * 3 * 2 * 1
        // 1! = 1
        // 15! = 15 * 14 * 13 ... * 1
        // 0! = 1

        System.out.println(fac(4));
    }

    // fac(4)
    // 4 * fac(3)
    // 3 * fac(2)
    // 2 * fac(1)
    // fac(1) = return 1;

    private static int fac(int n) {
        if (n == 1)
            return 1;

        return n * fac(n - 1);
    }

    // counter(3) -> counter(2) -> counter(1)

    // someMethod() -> someMethod() -> someMethod()

    //counter(3)
    //counter(2)
    //counter(1)
    //counter(0)

//    private static void counter(int n) {
////        System.out.println("Hello!");
////        someMethod();
//
//        System.out.println(n);
//
//        if (n == 0)
//            return;
//
//        counter(n - 1); // 3 2 1
//    }
}