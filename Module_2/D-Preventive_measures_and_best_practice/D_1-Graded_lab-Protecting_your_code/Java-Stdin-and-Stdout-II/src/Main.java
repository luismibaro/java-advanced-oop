import java.util.Scanner;

public class Main {
    public static void  main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduzca los datos necesarios: ");
        int i = scan.nextInt();
        double d = scan.nextDouble();
       // scan.nextLine();
        String s = scan.nextLine();

        scan.close();

        System.out.println("Int: " + i);
        System.out.println("Double: " + d);
        System.out.println("String: " + s);
    }
}
