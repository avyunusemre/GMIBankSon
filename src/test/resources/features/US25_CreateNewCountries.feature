@US_25 @Sprint2


Feature: US_25 read and create all country
  @US25_TC001
  Scenario: read all country
    Given Tum data'lari GET kullanarak ekranda görelim "https://www.gmibank.com/api/tp-countries"
    And  http Status Code 200
    Then Oluşturulmuş herhangi bir datayi Array ile okuyalım.
  @US25_TC002
  Scenario: create all country
    Given POST kullanarak yeni data oluşturalım endpoint "https://www.gmibank.com/api/tp-countries" and create "Finland" country
    And Oluşturulduktan sonra oluşturulan ülkeyi doğrulayalım "Finland"

