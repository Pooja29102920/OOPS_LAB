import java.io.*;

public class FH4{
    public static void main(String[] args) {
        String topStudent = "";
        double highestAvg = 50;

        try (BufferedReader br = new BufferedReader(new FileReader("marks.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0];
                int total = 0;
                for (int i = 1; i < data.length; i++) {
                    total += Integer.parseInt(data[i]);
                }
                double avg = total / (double)(data.length - 1);

                System.out.println(name + "'s Average: " + avg);

                if (avg > highestAvg) {
                    highestAvg = avg;
                    topStudent = name;
                }
            }

            System.out.println("Topper is: " + topStudent + " with average " + highestAvg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}