package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.Assert;
import pojos_.Country;
import utilities.ConfigurationReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class US25_StepDefinitions {
    Response response;

    @Given("Tum data'lari GET kullanarak ekranda görelim {string}")
    public void tum_data_lari_GET_kullanarak_ekranda_görelim(String endpoint) {
        response = given().
                contentType(ContentType.JSON).
                auth().
                oauth2(ConfigurationReader.getProperty("token")).
                when().
                get(endpoint);
        response.prettyPrint();
    }

    @Given("http Status Code {int}")
    public void http_Status_Code(Integer code) {
        response.
                then().
                assertThat().
                statusCode(code);

    }

    @Then("Oluşturulmuş herhangi bir datayi Array ile okuyalım.")
    public void oluşturulmuş_herhangi_bir_datayi_Array_ile_okuyalım() throws IOException {
        ObjectMapper obj = new ObjectMapper();
        Country[] countries = obj.readValue(response.asString(), Country[].class);

        System.out.println(countries[2].getName());

        for (int i=0; i<countries.length; i++){
            if (countries[i].getId() != null){
                System.out.println(countries[i].getId()+" - "+countries[i].getName());
            }
        }

    }

    @Given("POST kullanarak yeni data oluşturalım endpoint {string} and create {string} country")
    public void post_kullanarak_yeni_data_oluşturalım_endpoint_and_create_country(String endpoint, String ulke) {
        Country country = new Country(ulke,null);

        response=given().
                contentType(ContentType.JSON).
                auth().
                oauth2(ConfigurationReader.getProperty("token")).
                body(country).
                when().
                post(endpoint);
        response.prettyPrint();

    }

    @Given("Oluşturulduktan sonra oluşturulan ülkeyi doğrulayalım {string}")
    public void oluşturulduktan_sonra_oluşturulan_ülkeyi_doğrulayalım(String string) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Country country = objectMapper.readValue(response.asString(),Country.class);

        String actual = country.getName();
        Assert.assertEquals(actual,string);

        System.out.println("Actual : " + actual);
        System.out.println("Expected : " + string);

    }

}
