package utilities;

import pojos_.Customers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadTxt {

    public static List<Customers> returnCustomer(String filePath) {

        List<Customers> all = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while(line != null) {
                Customers customers = new Customers();
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                String[] each = line.split(",");
                customers.setFirstName(each[0]);
                customers.setLastName(each[1]);
                customers.setSsn(each[2]);
                all.add(customers);
            }

            String everything = sb.toString();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return all;
    }


    public static List<String> returnCustomerSSNList(String filePath) {

        List<String> all = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);

            int i = 0;
            while(line != null) {
                Customers customers = new Customers();
                customers.setSsn(line.split(",")[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();

                System.out.println(i++);

                all.add(customers.getSsn());
            }



        } catch (Exception e) {
            e.printStackTrace();
        }

        return all;
    }

}
