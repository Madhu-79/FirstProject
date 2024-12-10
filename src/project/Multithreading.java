package project;

import java.io.FileWriter;
import java.io.IOException;

		// Task 1: Print numbers from 1 to 5
		class Numbertask implements Runnable {
		    @Override
		    public void run() {
		        for (int i = 1; i <= 5; i++) {
		            System.out.println("Number: " + i);
		            try {
		                Thread.sleep(500);  // Pause for 500 milliseconds
		            } catch (InterruptedException e) {
		                Thread.currentThread().interrupt();
		                System.out.println("Number thread was interrupted.");
		            }
		        }
		    }
		}

		// Task 2: Write lines to output.txt
		class FileWriterTask implements Runnable {
		    @Override
		    public void run() {
		        try (FileWriter writer = new FileWriter("numtask.txt")) {
		            for (int i = 1; i <= 5; i++) {
		                writer.write("Line " + i + "\n");
		                System.out.println("Written to file: Line " + i);
		                Thread.sleep(500);  // Pause for 500 milliseconds
		            }
		        } catch (IOException | InterruptedException e) {
		            System.out.println("File writing was interrupted or failed.");
		        }
		    }
		}

		public class Multithreading{
		    public static void main(String[] args) {
		        // Create threads for both tasks
		        Thread numberThread = new Thread(new Numbertask());
		        Thread fileWriterThread = new Thread(new FileWriterTask());

		        // Start both threads
		        numberThread.start();
		        fileWriterThread.start();
		    }
	}
