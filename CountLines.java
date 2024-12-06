import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CountLines {
     public static void writeToFile(String filePath, String content) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
        }
    }
    public static int countLinesInFile(String filePath) throws IOException {
        int lineCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
        }
        return lineCount;
    }

     public static void main(String[] args) {
        String filePath = "testFile.txt";
        String content = "Hello, this is line 1.\nThis is line 2.\nAnd this is line 3.";

        try {
            // Write content to the file
            writeToFile(filePath, content);
            System.out.println("Content written successfully to " + filePath);

            // Count the number of lines in the file
            int lineCount = countLinesInFile(filePath);
            System.out.println("The file contains " + lineCount + " lines.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
