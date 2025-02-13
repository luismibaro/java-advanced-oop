package m2.L2;

public class TryCatchTest {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: "+result);
        }catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed!");
        }
    }
}
