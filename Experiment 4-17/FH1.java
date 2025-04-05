import java.io.*;

public class FH1 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("source.txt"));
            String line;
            int words = 0, lines = 0, chars = 0;

            while ((line = br.readLine()) != null) {
                lines++;
                chars += line.length();
                words += line.split("\\s+").length;
            }

            br.close();
            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + chars);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}