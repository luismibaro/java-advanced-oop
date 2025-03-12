import java.io.*;

public class Main {
    public static void writeUTF8(){
        // Writting to a file with UTF-8 encoding
        try(OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("patientRecords.txt"), "UTF-8")) {
            writer.write("José Álvarez\n");
            writer.write("Müller\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readUTF8() {
        try(InputStreamReader reader = new InputStreamReader(
                new FileInputStream("patientRecords.txt"), "UTF-8")){
            int data;
            while((data = reader.read()) != -1){
                System.out.println((char) data);
            }
        } catch (IOException e ) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args){
        System.out.println("Hello world!");
        writeUTF8();
        readUTF8();
    }
}
