import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter marks: ");
int m = scanner.nextInt();
if (m <= 100) {
if (m >= 85) {
System.out.println("Excellent");
} 
else if (m >= 70 && m <= 84) {
System.out.println("Good");
} 
else if (m >= 60 && m < 70) {
System.out.println("Satisfactory");
} 
else {
System.out.println("Not satisfactory");
}
} 
else {
System.out.println("Marks should be less than 100!!");
}
scanner.close();
}
}
