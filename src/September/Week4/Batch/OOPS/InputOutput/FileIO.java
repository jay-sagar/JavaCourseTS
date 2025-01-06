package September.Week4.Batch.OOPS.InputOutput;

import java.io.*;

public class FileIO {
    public static void main(String[] args) throws IOException {
        String[] names = {"John", "Carl", "Jerry"};


        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write("Writing to a file.");
        writer.write("\nthis is seconding line.");

        for (String name: names) {
            writer.write("\n" + name);
        }
        writer.close();


        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
        String line;
        while((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();


    }

}
