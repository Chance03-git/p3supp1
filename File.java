import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File{
        /**
     * Writes the specified content to a file at the given file path.
     * If the file does not exist, it will be created.
     * 
     * @param filePath The path of the file to write to.
     * @param content  The content to be written to the file.
     * @throws IOException If an I/O error occurs during file writing.
     */
    public static void writeToFile(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        }
    }
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