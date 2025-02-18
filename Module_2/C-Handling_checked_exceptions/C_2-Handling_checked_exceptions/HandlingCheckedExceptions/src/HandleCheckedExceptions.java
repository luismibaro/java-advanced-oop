public class HandleCheckedExceptions {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch(ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
