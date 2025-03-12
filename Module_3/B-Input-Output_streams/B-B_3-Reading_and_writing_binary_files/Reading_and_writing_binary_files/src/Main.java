import java.io.*;
import java.util.Random;

public class Main {
    public static void binaryWrite(){
        int sensorID = 1;
        Random rd = new Random();
        float sensorValue = rd.nextFloat();
        String timestamp = "2024-8-23 16:00:00";
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("sensorData.bin"))){
            dos.writeInt(sensorID);         // Step 1: Write the sensor ID
            dos.writeFloat(sensorValue);    // Step 2: Write the sensor value
            dos.writeUTF(timestamp);        // Strp 3: Write the timestamp
        } catch (IOException e){
            e.printStackTrace(); // Handle I/O errors
        }
    }
    public static void binaryRead(){
        try(DataInputStream dis = new DataInputStream(new FileInputStream("sensorData.bin"))){
            while(true){
                try {
                    int sensorId = dis.readInt();
                    float sensorValue = dis.readFloat();
                    String timestamp = dis.readUTF();
                    System.out.println("id: "+sensorId+" Value: "+sensorValue+" timestamp: "+timestamp);
                } catch (EOFException e) { break;}
                catch (IOException e){ throw new RuntimeException(e); }
            }
        } catch (IOException e ){
            e.printStackTrace(); // Handle other I/O errors
        }
    }
    public static void main(String[] args) {
        binaryWrite();
        binaryRead();
    }
}
