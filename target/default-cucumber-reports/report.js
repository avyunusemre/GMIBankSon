$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/db.feature");
formatter.feature({
  "name": "DataBase Test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@db"
    }
  ]
});
formatter.scenario({
  "name": "TC02_kullanici database baglantini kontrol eder",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@db"
    }
  ]
});
formatter.step({
  "name": "kullanici veritabanina baglanir",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.DBStepDefinitions.kullanici_veritabanina_baglanir()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});