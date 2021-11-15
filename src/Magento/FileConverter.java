package Magento;

ab.jm.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class FileConverter {

    public static String ConvertCSVToXLS(String file) throws IOException {

        if (file.indexOf(".csv") < 0)
            return "Error converting file: .csv file not given.";

        String name = FileManager.getFileNameFromPath("C:\\Users\\sruthi reddy\\Downloads\\PayLoad.txt", false);
        ArrayList<ArrayList<String>> arList = new ArrayList<ArrayList<String>>();
        ArrayList<String> al = null;

        String thisLine;
        DataInputStream myInput = new DataInputStream(new FileInputStream(file));

        while ((thisLine = myInput.readLine()) != null) {
            al = new ArrayList<String>();
            String strar[] = thisLine.split(",");

            for (int j = 0; j < strar.length; j++) {
                // My Attempt (BELOW)
                String edit = strar[j].replace('\n', ' ');
                al.add(edit);
            }

            arList.add(al);
            System.out.println();
        }
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}