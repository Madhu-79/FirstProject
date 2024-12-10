package project;
import java.io.*;
public class Fileinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String inputFilePath="C:\\Users\\SRIMADHU\\eclipse-workspace\\java1\\src\\ame.txt";
String outputFilePath="C:\\Users\\SRIMADHU\\eclipse-workspace\\java1\\src\\op.txt";

        int lineCount = 0;

        try (FileReader fileReader = new FileReader(inputFilePath)) {
            int character;
            boolean isNewLine = true;

            // Reading each character from the file
            while ((character = fileReader.read()) != -1) {
                if (character == '\n') {       // Checking for newline character
                    lineCount++;
                    isNewLine = true;
                } else {
                    isNewLine = false;
                }
            }
            // Add one if the file doesn't end with a newline but has content
            if (!isNewLine) {
                lineCount++;
            }

            // Writing the line count to an output file
            try (FileWriter fileWriter = new FileWriter(outputFilePath)) {
                fileWriter.write("Number of lines: " + lineCount);
            }

            System.out.println("Line count written to " + outputFilePath);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}


