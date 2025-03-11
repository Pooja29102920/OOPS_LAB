import java.util.Scanner;
public class Task10{
public static int factorial(int n) {
if (n == 0 || n == 1 && n >= 0) {
return 1;
} 
else {
return n * factorial(n - 1); // Recursive call
}
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = scanner.nextInt();
System.out.println("Factorial of " + num + " is: " + factorial(num));
scanner.close();
}
}
