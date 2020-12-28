import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.nio.ByteBuffer;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;

public class MailOrder1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Name of file to be created/read/written
        // Use Absolute path to ensure root directory is matched
        Path file = Paths.get("MailOrder.txt");
        Path fullFile = file.toAbsolutePath();

        // Create number of records user will write
        System.out.println("Number or items: ");
        final int NUMRECS = sc.nextInt();
        System.out.println();

        // What record will look like
        String record = "0000-00" + System.getProperty("line.separator");

        final int RECSIZE = record.length();

        FileChannel fc = null;
        String delimiter = "-";
        String itemNumber;
        String quantity;
        int total = 0;

        try {
            fc = (FileChannel)Files.newByteChannel(fullFile, CREATE, READ, WRITE);

            // While loops continues to ask user for item number
            // and quantity until number or records is reached
            while(total < NUMRECS) {
                System.out.println("Enter 4 Digit Item Number");
                System.out.println("Ex: 2981");
                itemNumber = sc.next();
                System.out.println();
                System.out.println("Enter Quantity To Order");
                System.out.println("Min: 10 - Max: 99");
                quantity = sc.next();
                System.out.println();
                record = itemNumber + delimiter + quantity + System.getProperty("line.separator");
                byte[] recordData = record.getBytes();
                ByteBuffer recordBuffer = ByteBuffer.wrap(recordData);
                fc.position(Integer.parseInt(itemNumber) * RECSIZE);
                fc.write(recordBuffer);
                total++;
            }
            fc.close();
        } catch(Exception e) {
            System.out.println("Error Message: " + e);
        }
    }
}
