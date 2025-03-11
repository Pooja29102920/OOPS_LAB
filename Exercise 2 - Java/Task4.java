import java.util.Scanner;
public class Task4 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the value of base: ");
double base = scanner.nextDouble();
System.out.print("Enter the value of height: ");
double height = scanner.nextDouble();
double area = 0.5 * base * height;
System.out.println("The area is " + area);
scanner.close();
}
}
