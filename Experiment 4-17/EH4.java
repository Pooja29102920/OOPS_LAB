class FileTooLargeException extends Exception {
    public FileTooLargeException(String msg) {
        super(msg);
    }
}

public class EH4 {
    public static void main(String[] args) {
        int fileSizeInMB = 25; // Example file size

        try {
            if (fileSizeInMB > 20) {
                throw new FileTooLargeException("File size exceeds 20MB limit!");
            } else {
                System.out.println("File uploaded successfully.");
            }
        } catch (FileTooLargeException e) {
            System.out.println("Upload Failed: " + e.getMessage());
        }
    }
}