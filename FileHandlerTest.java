import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlerTest {
    public static void writeToFile(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        }
    }
    public static String readFromFile(String filePath) throws IOException {
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

