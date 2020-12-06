package utilities;

import pojos_.Customers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToTxt {

    public static void saveDataInFile(String fileName, Customers customers) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));

            writer.append("\n"+customers.getFirstName() + " , " + customers.getLastName() + " , " + customers.getSsn());

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
