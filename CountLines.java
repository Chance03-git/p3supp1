import java.io.IOException;

public class CountLines {
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
