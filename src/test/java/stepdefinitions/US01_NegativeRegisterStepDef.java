package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.GMIRegistrationPage;
import utilities.Driver;

public class US01_NegativeRegisterStepDef {
 GMIRegistrationPage gmiRegisration = new GMIRegistrationPage();

 @Given("Kullanici bir user olarak gmibank anasayfasina gider")
 public void kullaniciBirUserOlarakGmibankAnasayfasinaGider() {
  Driver.getDriver().get("https://gmibank.com/");

 }

 @And("Kullanici bir user olarak sag ust kosede bulunan insan simgesine tiklar")
 public void kullaniciBirUserOlarakSagUstKosedeBulunanInsanSimgesineTiklar() {
  gmiRegisration.AccountBox.click();

 }git

 @And("Kullanici bir user olarak acilan menuden register linkine tiklar")
 public void kullaniciBirUserOlarakAcilanMenudenRegisterLinkineTiklar() {
  gmiRegisration.RegisterButton.click();
 }

 @Given("Kullanici bir user olarak SSN textboxina gecersiz  {string} numarasini girer")
 public void kullaniciBirUserOlarakSSNTextboxinaGecersizNumarasiniGirer(String ssn) {
  gmiRegisration.ssnBox.sendKeys(ssn);
 }

 @Then("Kullanici bir user olarak {string} hata mesajini goruntuler")
 public void kullaniciBirUserOlarakHataMesajiniGoruntuler(String errormesaj) {
  gmiRegisration.FirstName.click();
  String mesaj = gmiRegisration.SSNInvalidFeedback.getText();
  System.out.println(mesaj);
  Assert.assertTrue(mesaj.equals(errormesaj));

 }

 @Given("Kullanici bir user olarak First Name textboxini {string} bos birakir")
 public void kullaniciBirUserOlarakFirstNameTextboxiniBosBirakir(String firstname) {
  gmiRegisration.FirstName.click();
  gmiRegisration.FirstName.sendKeys(firstname);

 }

 @Then("Kullanici bir user olarak {string} hata uyarisini goruntuler")
 public void kullaniciBirUserOlarakHataUyarisiniGoruntuler(String errorfirstname) {
  gmiRegisration.LastName.click();
  Assert.assertTrue(gmiRegisration.FirstNameInvalidFeedback.getText().equals(errorfirstname));
 }

 @Given("Kullanici bir user olarak Last Name textboxini {string} bos birakir")
 public void kullaniciBirUserOlarakLastNameTextboxiniBosBirakir(String lastname) {
  gmiRegisration.LastName.click();
  gmiRegisration.LastName.sendKeys(lastname);
 }

 @Then("Kullanici bir user olarak {string} Lastname hata mesajini goruntuler")
 public void kullaniciBirUserOlarakLastnameHataMesajiniGoruntuler(String lastnameerror) {
  gmiRegisration.Addressbox.click();
  Assert.assertTrue(gmiRegisration.LastNameInvalidFeedback.getText().equals(lastnameerror));
 }

 @Given("Kullanici bir user olarak Mobile Phone Number textboxina tire olmadan {string} cep telefonu numarasini girer")
 public void kullaniciBirUserOlarakMobilePhoneNumberTextboxinaTireOlmadanCepTelefonuNumarasiniGirer(String phone) {
  gmiRegisration.Mobilephonebox.sendKeys(phone);
 }

 @Given("Kullanici bir user olarak Username textboxina  sadece sayilardan olusan {string} kullanici adini girer")
 public void kullaniciBirUserOlarakUsernameTextboxinaSadeceSayilardanOlusanKullaniciAdiniGirer(String username) {
  gmiRegisration.Username.sendKeys(username);
 }


 @Then("Kullanici bir user olarak Username textboxinin cerceve renginin kirmizi oldugunu goruntuler")
 public void kullaniciBirUserOlarakUsernameTextboxininCerceveRengininKirmiziOldugunuGoruntuler() throws InterruptedException {
 gmiRegisration.Username.click();
  gmiRegisration.Emailbox.click();
  Thread.sleep(2000);
  String mesaj = gmiRegisration.UserNameRed.getText();

  Assert.assertTrue(mesaj.equals("Your username is required."));//bug
 }


 @Given("Kullanici bir user olarak SSN textboxina {string} numarasini girer")
 public void kullaniciBirUserOlarakSSNTextboxinaNumarasiniGirer(String dogrussn) {
  gmiRegisration.ssnBox.sendKeys(dogrussn);
 }


 @And("Kullanici bir user olarak First Name textboxina {string} ismini girer")
 public void kullaniciBirUserOlarakFirstNameTextboxinaIsminiGirer(String dogrufirstname) {
  gmiRegisration.FirstName.sendKeys(dogrufirstname);
 }

 @And("Kullanici bir user olarak Last Name textboxina {string} soyismini girer")
 public void kullaniciBirUserOlarakLastNameTextboxinaSoyisminiGirer(String dogrulastname) {
gmiRegisration.LastName.sendKeys(dogrulastname);
 }

 @And("Kullanici bir user olarak Address textboxina {string}  adresini girer")
 public void kullaniciBirUserOlarakAddressTextboxinaAdresiniGirer(String dogruaddress) {
gmiRegisration.Addressbox.sendKeys(dogruaddress);
 }

 @And("Kullanici bir user olarak Mobile Phone Number textboxina {string} cep telefonu numarasini girer")
 public void kullaniciBirUserOlarakMobilePhoneNumberTextboxinaCepTelefonuNumarasiniGirer(String dogrumobilphone) {
gmiRegisration.Mobilephonebox.sendKeys(dogrumobilphone);
 }

 @And("Kullanici bir user olarak Username textboxina  {string} kullanici adini girer")
 public void kullaniciBirUserOlarakUsernameTextboxinaKullaniciAdiniGirer(String dogruusername) {
 gmiRegisration.Username.sendKeys(dogruusername);
 }

 @And("Kullanici bir user olarak Email textboxina herhangi bir deger girmez")
 public void kullaniciBirUserOlarakEmailTextboxinaHerhangiBirDegerGirmez() {

 }

 @And("Kullanici bir user olarak New password textboxina {string} sifresini girer")
 public void kullaniciBirUserOlarakNewPasswordTextboxinaSifresiniGirer(String dogrunpasword) {
 gmiRegisration.NewPassword.sendKeys(dogrunpasword);
 }

 @And("Kullanici bir user olarak New password confirmation textboxina {string} sifresini girer")
 public void kullaniciBirUserOlarakNewPasswordConfirmationTextboxinaSifresiniGirer(String dogruNewPasswordConfirmation) {
 gmiRegisration.NewPasswordConfirmation.sendKeys(dogruNewPasswordConfirmation);
 }

 @And("Kullanici bir user olarak Register butonuna tiklar")
 public void kullaniciBirUserOlarakRegisterButonunaTiklar() {
 gmiRegisration.Register.click();
 }

 @Then("Kullanici Your email is required mesajini goruntuler")
 public void kullaniciYourEmailIsRequiredMesajiniGoruntuler() throws InterruptedException {
Thread.sleep(2000);
  Assert.assertTrue(gmiRegisration.EmailboxInvalidFeedback.getText().equals("Your email is required."));

 }
}

