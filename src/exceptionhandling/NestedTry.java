package exceptionhandling;

public class NestedTry {

    public static void main(String[] args) {

        try {
            int i = 10;
            int j = i / 0;
            System.out.println("In first try block");
            try {
                String str = null;
                System.out.println(str.length());
                System.out.println("In second try block");
            } catch (NullPointerException e) {
                System.out.println(e);

            }

        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("Number format=>" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Class Cast=>" + e.getMessage());
        }
        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");

    }
}

