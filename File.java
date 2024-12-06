import java.io.IOException;

public class File{
     public static void main(String[] args) {
        String filePath = "testFile.txt";
        String content = "Hello, this is a test content.";

        try {
            // Test the writeToFile function
            writeToFile(filePath, content);
            System.out.println("Content written successfully to " + filePath);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}