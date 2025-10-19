public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");

            try {
                System.out.println("Inner try block");
                int result = 10 / 0; // ArithmeticException
                System.out.println("This line will not execute");
            } catch (NullPointerException e) {
                System.out.println("Inner catch block: NullPointerException");
            } finally {
                System.out.println("Inner finally block");
            }

            System.out.println("After inner try-catch-finally");

        } catch (ArithmeticException e) {
        	e.printStackTrace();
            System.out.println("Outer catch block NullPointerException");
        } finally {
            System.out.println("Outer finally block");
        }

        System.out.println("End of main method");
    }
    
    
 
    
   
}
