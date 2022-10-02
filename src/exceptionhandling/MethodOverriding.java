package exceptionhandling;


public class MethodOverriding {

    public void show() throws Exception {
        System.out.println("In show");
    }
}

class ChildClass extends MethodOverriding {

    public static void main(String[] args) throws Exception {
        ChildClass obj = new ChildClass();
        obj.show();
    }

    @Override
    public void show() throws ArithmeticException {

    }
}

/**
 * if parent class declares no exception then child class declare only unchecked exception
 * if parent class declares exception then child class declare same exception.
 * if parent class declare exception then child class declare only their child exception.
 */