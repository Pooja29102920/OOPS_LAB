import java.io.*;

public class FH3 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("plain.txt");
            FileWriter fw = new FileWriter("encrypted.txt");

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch + 1);
            }

            fr.close();
            fw.close();
            System.out.println("File encrypted!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}