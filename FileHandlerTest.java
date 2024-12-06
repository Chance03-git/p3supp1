import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlerTest {
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
    public static String readFromFile(String filePath) throws IOException {
        /**
     * Reads and returns the content of a file at the given file path.
     * 
     * @param filePath The path of the file to read.
     * @return A string containing the content of the file.
     * @throws IOException If an I/O error occurs during file reading.
     */

        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        }
        return content.toString().trim();
    }

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

