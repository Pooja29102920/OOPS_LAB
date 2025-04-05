import java.io.*;
import java.util.Scanner;

public class P2 {
    private static Scanner scanner = new Scanner(System.in);
    private static final String BASE_DIRECTORY = "files";

    public static void main(String[] args) {
        // Create base directory if it doesn't exist
        createBaseDirectory();

        while (true) {
            System.out.println("\n=== File Management System ===");
            System.out.println("1. Create a new file");
            System.out.println("2. Write to a file");
            System.out.println("3. Read from a file");
            System.out.println("4. List all files");
            System.out.println("5. Delete a file");
            System.out.println("6. File information");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: createFile(); break;
                case 2: writeToFile(); break;
                case 3: readFromFile(); break;
                case 4: listFiles(); break;
                case 5: deleteFile(); break;
                case 6: fileInformation(); break;
                case 7:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    private static void createBaseDirectory() {
        File directory = new File(BASE_DIRECTORY);
        if (!directory.exists()) {
            directory.mkdir();
            System.out.println("Base directory created successfully!");
        }
    }

    private static void createFile() {
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        File file = new File(BASE_DIRECTORY + File.separator + fileName);

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists!");
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }

    private static void writeToFile() {
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        File file = new File(BASE_DIRECTORY + File.separator + fileName);

        if (!file.exists()) {
            System.out.println("File does not exist!");
            return;
        }

        System.out.println("Enter text (type 'END' on a new line to finish):");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String line;
            while (!(line = scanner.nextLine()).equals("END")) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Content written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    private static void readFromFile() {
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        File file = new File(BASE_DIRECTORY + File.separator + fileName);

        if (!file.exists()) {
            System.out.println("File does not exist!");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            System.out.println("\nFile contents:");
            System.out.println("==============");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("==============");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static void listFiles() {
        File directory = new File(BASE_DIRECTORY);
        File[] files = directory.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("No files found!");
            return;
        }

        System.out.println("\nFiles in directory:");
        for (File file : files) {
            System.out.println(file.getName());
        }
    }

    private static void deleteFile() {
        System.out.print("Enter file name to delete: ");
        String fileName = scanner.nextLine();
        File file = new File(BASE_DIRECTORY + File.separator + fileName);

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully!");
            } else {
                System.out.println("Failed to delete file!");
            }
        } else {
            System.out.println("File does not exist!");
        }
    }

    private static void fileInformation() {
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        File file = new File(BASE_DIRECTORY + File.separator + fileName);

        if (!file.exists()) {
            System.out.println("File does not exist!");
            return;
        }

        System.out.println("\nFile Information:");
        System.out.println("Name: " + file.getName());
        System.out.println("Path: " + file.getAbsolutePath());
        System.out.println("Size: " + file.length() + " bytes");
        System.out.println("Last Modified: " + new java.util.Date(file.lastModified()));
        System.out.println("Is Directory: " + file.isDirectory());
        System.out.println("Is File: " + file.isFile());
        System.out.println("Can Read: " + file.canRead());
        System.out.println("Can Write: " + file.canWrite());
        System.out.println("Can Execute: " + file.canExecute());
    }
}