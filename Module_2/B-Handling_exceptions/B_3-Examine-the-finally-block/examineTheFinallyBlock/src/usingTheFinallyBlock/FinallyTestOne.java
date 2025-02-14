package usingTheFinallyBlock;

public class FinallyTestOne {
    public static void main(String[] args) {
        try {
            int[] array = {10, 20, 30, 40, 50};
            System.out.println(array[4]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("In the finally block!");
        }
        System.out.println("More code");
    }
}
