package exceptionhandling;

public class ThrowAndThrows {

    public static void main(String[] args) throws Exception {

        int age = 15;

        if (age >= 18) {
            System.out.println("you can vote");
        } else {
            throw new ArithmeticException("you can not vote");
        }

        System.out.println("Hii");
        System.out.println("Hii");
    }

    public void show() throws ArithmeticException {
        throw new ArithmeticException("");
    }
}

/**
 * throw                                     Throws
 * <p>
 * 1 . throw is used to throw exception             1. throws is used to declare the exception.
 * <p>
 * 2.  throw is used within a method                2. throws is used with method signature.
 * <p>
 * 3.  you can throw only one exception at a time   3. you can declare multiple exception at a time.
 * <p>
 * 4.  throw is used with new instance              4. throws is used with class instance
 */