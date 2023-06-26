package task1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Task {
    private String description;
    private boolean completed;

    public Task(String description, boolean completed) {
        this.description = description;
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}

public class TodoListApp {
    private static final String FILE_NAME = "tasks.txt";

    public static void main(String[] args) {
        List<Task> tasks = loadTasks();

        while (true) {
            displayMenu();

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayTasks(tasks);
                    break;
                case 2:
                    addTask(tasks);
                    break;
                case 3:
                    completeTask(tasks);
                    break;
                case 4:
                    saveTasks(tasks);
                    System.out.println("Todo list saved. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n......Todo List Application......");
        System.out.println("1. View Todo List");
        System.out.println("2. Add Task");
        System.out.println("3. Mark Task as Completed");
        System.out.println("4. Quit");
        System.out.print("Enter your choice (1-4): ");
    }

    private static List<Task> loadTasks() {
        List<Task> tasks = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                String description = parts[0];
                boolean completed = Boolean.parseBoolean(parts[1]);
                Task task = new Task(description, completed);
                tasks.add(task);
            }
        } catch (IOException e) {
           System.out.println(e);
        }

        return tasks;
    }

    private static void displayTasks(List<Task> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("Todo List is empty!");
        } else {
            System.out.println("Todo List:");
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                String status = task.isCompleted() ? "✓" : "◻";
                System.out.println((i + 1) + ". [" + status + "] " + task.getDescription());
            }
        }
    }

    private static void addTask(List<Task> tasks) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        Task task = new Task(description, false);
        tasks.add(task);
        System.out.println("Task '" + description + "' added!");
    }

    private static void completeTask(List<Task> tasks) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter task number to mark as completed: ");
        int taskNumber = scanner.nextInt();

        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
            Task task = tasks.get(taskNumber - 1);
            task.setCompleted(true);
            System.out.println("Task marked as completed!");
        } else {
            System.out.println("Invalid task number!");
        }
    }

    private static void saveTasks(List<Task> tasks) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Task task : tasks) {
                writer.write(task.getDescription() + "|" + task.isCompleted());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while saving the todo list.");
        }
    }
}
