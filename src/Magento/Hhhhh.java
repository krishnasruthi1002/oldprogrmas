package Magento;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Hhhhh {

    @SuppressWarnings("resource")
	public static void main(String[] args) throws URISyntaxException,
            IOException {

        FileWriter writer = null;
        File file = new File("C:\\Users\\sruthi reddy\\Downloads\\PayLoad.txt");
        Scanner scan = new Scanner(file);
        File file2 = new File("C:\\Users\\sruthi reddy\\Downloads\\Data_Analysis.xlsx");
        file.createNewFile();
        writer = new FileWriter(file2);

        while (scan.hasNext()) {
            String csv = scan.nextLine().replace(",", ",");
            System.out.println(csv);
            writer.append(csv);
            writer.append("\n");
            writer.flush();
        }
    }
}