import java.util.*;

class Task {
    private String title;
    private String description;
    private Date dueDate;
    private boolean isCompleted;

    public Task(String title, String description, Date dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public Date getDueDate() { return dueDate; }
    public boolean isCompleted() { return isCompleted; }
    public void setCompleted(boolean completed) { isCompleted = completed; }

    @Override
    public String toString() {
        return String.format("Task: %s\nDescription: %s\nDue Date: %s\nStatus: %s\n",
                title, description, dueDate, isCompleted ? "Completed" : "Pending");
    }
}

public class P1 {
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Task Manager ===");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Sort Tasks by Due Date");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    markTaskCompleted();
                    break;
                case 4:
                    sortTasksByDueDate();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    private static void addTask() {
        System.out.print("Enter task title: ");
        String title = scanner.nextLine();

        System.out.print("Enter task description: ");
        String description = scanner.nextLine();

        // Creating a current date as due date for simplicity
        Date dueDate = new Date();

        Task task = new Task(title, description, dueDate);
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available!");
            return;
        }

        System.out.println("\n=== All Tasks ===");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("\nTask #" + (i + 1));
            System.out.println(tasks.get(i));
        }
    }

    private static void markTaskCompleted() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available!");
            return;
        }

        viewTasks();
        System.out.print("Enter task number to mark as completed: ");
        int taskNum = scanner.nextInt();

        if (taskNum > 0 && taskNum <= tasks.size()) {
            Task task = tasks.get(taskNum - 1);
            task.setCompleted(true);
            System.out.println("Task marked as completed!");
        } else {
            System.out.println("Invalid task number!");
        }
    }

    private static void sortTasksByDueDate() {
        Collections.sort(tasks, new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                return t1.getDueDate().compareTo(t2.getDueDate());
            }
        });
        System.out.println("Tasks sorted by due date!");
        viewTasks();
    }
}