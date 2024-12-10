package project;

import java.util.ArrayList;
import java.util.Scanner;
public class ToDoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			        ArrayList<String> todoList = new ArrayList<>();
			        Scanner ip = new Scanner(System.in);

			        while (true) {
			            System.out.println("\n--- To-Do List ---");
			        	System.out.println("\n****MENU****");
			            System.out.println("1. Add Task");
			            System.out.println("2. Remove Task");
			            System.out.println("3. Show the list");
			            System.out.println("4. Exit");
			            System.out.print("Enter your choice: ");
			            int choice = ip.nextInt();
			            ip.nextLine(); 

			            switch (choice) {
			                case 1:
			                    System.out.print("Enter the Task: ");
			                    String AddTask = ip.nextLine();
			                    todoList.add(AddTask);
			                    System.out.println("\"" + AddTask + "\" added to the list.");
			                    break;
			                case 2:
			                    if (todoList.isEmpty()) {
			                        System.out.println("The list is empty. Nothing to remove.");
			                    } else {
			                        System.out.println("Enter the index of the task to remove (1 to " + todoList.size() + "): ");
			                        int index = ip.nextInt();
			                        if (index > 0 && index <= todoList.size()) {
			                            String removedItem = todoList.remove(index - 1);
			                            System.out.println("\"" + removedItem + "\" removed from the list.");
			                        } else {
			                            System.out.println("Invalid index. Try again.");
			                        }
			                    }
			                    break;
			                case 3:
			                    if (todoList.isEmpty()) {
			                        System.out.println("The list is empty.");
			                    } else {
			                        System.out.println("Your to-do list:");
			                        for (int i = 0; i < todoList.size(); i++) {
			                            System.out.println((i + 1) + ". " + todoList.get(i));
			                        }
			                    }
			                    break;
			                case 4:
			                    System.out.println("No Task To DO---Have a great day!");
			                    return;
			                default:
			                    System.out.println("Invalid choice. Please try again.");
			            

			            }
			        }
			    }
	}

