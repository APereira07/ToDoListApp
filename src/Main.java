// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        boolean running = true;

        System.out.println("Welcome to the To-Do List Application!");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1 - Add To-Do Item");
            System.out.println("2 - Delete To-Do Item");
            System.out.println("3 - View To-Do List");
            System.out.println("4 - Exit");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item to add: ");
                    String item = scanner.nextLine();
                    toDoList.addItem(item);
                    break;
                case 2:
                    toDoList.viewItems();
                    System.out.print("Enter index to delete: ");
                    int index = scanner.nextInt();
                    toDoList.deleteItem(index);
                    break;
                case 3:
                    toDoList.viewItems();
                    break;
                case 4:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
