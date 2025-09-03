// ToDoList.java
import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<String> items;

    public ToDoList() {
        items = new ArrayList<>();
    }

    // Add a new item
    public void addItem(String item) {
        items.add(item);
        System.out.println("Added: " + item);
    }

    // Delete item by index
    public void deleteItem(int index) {
        if (index >= 0 && index < items.size()) {
            String removed = items.remove(index);
            System.out.println("Removed: " + removed);
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

    // View all items
    public void viewItems() {
        if (items.isEmpty()) {
            System.out.println("Your to-do list is empty.");
        } else {
            System.out.println("Your To-Do List:");
            for (int i = 0; i < items.size(); i++) {
                System.out.println((i) + ": " + items.get(i));
            }
        }
    }
}
