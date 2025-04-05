import java.io.*;
import java.util.Scanner;

public class FH2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word to search: ");
        String word = sc.nextLine();
        int count = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("source.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                for (String w : line.split("\\s+")) {
                    if (w.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
            }
            br.close();
            System.out.println("The word '" + word + "' appears " + count + " times.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}