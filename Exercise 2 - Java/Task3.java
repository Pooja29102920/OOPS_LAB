import java.util.Scanner;
public class Task3 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the Weight in kilograms: ");
double weight = scanner.nextDouble();
System.out.print("Enter the Height in meters: ");
double height = scanner.nextDouble();
double bmi = weight / (height * height);
if (bmi < 18.5) {
System.out.println("Underweight");
} 
else if (bmi <= 24.9) {
System.out.println("Normal weight");
} 
else if (bmi <= 29.9) {
System.out.println("Overweight");
} 
else {
System.out.println("Obese");
}
System.out.printf("Your BMI: %.2f\n", bmi);
scanner.close();
}
}
