import java.io.IOException;

public class FileHandlerTest {
    public static void main(String[] args) {
        String filePath = "testFile.txt";
        String content = "Hello, this is a test content.";

        try {
            // Write content to the file
            writeToFile(filePath, content);
            System.out.println("Content written successfully to " + filePath);

            // Read content from the file
            String fileData = readFromFile(filePath);
            System.out.println("Content read from file: " + fileData);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

