package D_More_examples_of_using_the_finally_block;

public class FinallyTestFour {

    private static String containsAnE(String word){
        try {
            return word.contains("E") ? "Contains an E" : "No E found!";
        } catch (NullPointerException e){
            System.out.println("A NullPointerException ocurred!");
            return "Return from catch ";
        } finally {
            System.out.println("In the finally block!");
        }
    }

    public static void main(String[] args) {
        // containsAnE("Hello");
        containsAnE(null);
        System.out.println("More code");
    }
}
