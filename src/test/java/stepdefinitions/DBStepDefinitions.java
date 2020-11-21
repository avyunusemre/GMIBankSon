package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.DatabaseUtility;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class DBStepDefinitions {
    @Given("kullanici veritabanina baglanir")
    public void kullanici_veritabanina_baglanir() throws Exception {
        DatabaseUtility.createConnection();

        String query = "SELECT * FROM public.tp_customer";
        List<Object> list = DatabaseUtility.getColumnData(query, "email");

        for(Object w : list){
//            System.out.println(w.toString());
        }

        int rowSayisi=DatabaseUtility.getRowCount();


        List<Map<String, Object>> sonuclarHaritada = DatabaseUtility.getQueryResultMap(query); //Tum tabloyu bir liste icinde map halinde getirecek.
        System.out.println(sonuclarHaritada);

        List<List<Object>> sonuclarListe=DatabaseUtility.getQueryResultList(query);
        System.out.println(sonuclarListe);

        List<String> kolonAdlari=DatabaseUtility.getColumnNames(query);
        System.out.println(kolonAdlari);
//        Driver.getDriver().get("http://google.com");

        Map<String, Object> map0=DatabaseUtility.getRowMap(query);
        System.out.println("0. indexi map ta gosterdik"+map0);

        List<Object> row0=DatabaseUtility.getRowList(query);
        System.out.println("0.index liste: " + row0);

    }

}
