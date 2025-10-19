import java.io.*;

public class CheckedExampleHandled {
    public static void readFile() throws IOException {
        FileReader file = new FileReader("nonexistent.txt"); // May throw IOException
    }

    public static void main(String[] args) {
        try {
        	System.out.println("hii");
         //  readFile();  // Calling method inside try-catch
        } catch (Exception e) {
            System.out.println("File not found. Handling exception.");
        }
        System.out.println("Program continues...");
    }
}
