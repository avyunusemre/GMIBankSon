package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import utilities.DatabaseUtility;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static utilities.DatabaseUtility.executeQuery;

public class US29_DataBase {
    SoftAssert softAssert=new SoftAssert();
    List<Map<String,String>>list=new ArrayList<>();
    List<Map<String,String>>listCountries=new ArrayList<>();
    List<Map<String,String>>listStateOfUSA=new ArrayList<>();

    @Given("Create connection with DataBase")
    public void create_connection_with_DataBase() {
        DatabaseUtility.createConnection();
    }

    @Given("I can from database all users' info about login withdraw")
    public void i_can_from_database_all_users_info_about_login_withdraw() throws SQLException {
     //  String query="SELECT * FROM public.jhi_user;";
      //  ResultSet rst1=executeQuery(query);
       // ResultSetMetaData rsmd=rst1.getMetaData();
       // int columnNumber=rsmd.getColumnCount();
       // String columnName=rsmd.getTableName(3);
        //System.out.println(columnNumber);
       // System.out.println(columnName);
        List<Map<String,String>> list=DatabaseUtility.getQueryAsAListOfMaps("SELECT * FROM public.jhi_user");
        System.out.println(list);
        list.stream().map(t->t.get("login")).forEach(System.out::println);
    }

    @Then("I can verify login with database data")
    public void i_can_verify_login_with_database_data() {
        softAssert.assertEquals(list.contains("emreemplo"),list.contains("emreemplo"));
        softAssert.assertAll();

    }

    @Given("I can from database all countries' info withdraw")
    public void i_can_from_database_all_countries_info_withdraw() throws SQLException{
        List<Map<String,String>> listCountries=DatabaseUtility.getQueryAsAListOfMaps("SELECT * FROM public.tp_country");
        System.out.println(listCountries);


    }

    @Then("I can verify all countries from database")
    public void i_can_verify_all_countries_from_database() {
        softAssert.assertEquals(listCountries.contains("Belgium"),listCountries.contains("Belgium"));
        softAssert.assertAll();

    }

    @Given("I can from database all states in USA info withdraw")
    public void i_can_from_database_all_states_in_USA_info_withdraw()throws SQLException {
        listStateOfUSA=DatabaseUtility.getQueryAsAListOfMaps("SELECT * FROM public.tp_state");
        System.out.println(listStateOfUSA);
        softAssert.assertAll();

    }

    @Then("I can verify all states in USA from database")
    public void i_can_verify_all_states_in_USA_from_database() {

        softAssert.assertEquals(listStateOfUSA.contains("ohio"),listStateOfUSA.contains("ohio"));
        softAssert.assertAll();

    }



}
