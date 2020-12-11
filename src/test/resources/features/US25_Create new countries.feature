@US_25


Feature: US_25 read and create all country

  Scenario: read all country
    Given Tum data'lari GET kullanarak ekranda görelim "https://www.gmibank.com/api/tp-countries"
    And  http Status Code 200
    Then Oluşturulmuş herhangi bir datayi Array ile okuyalım.

  Scenario: create all country
    Given POST kullanarak yeni data oluşturalım endpoint "https://www.gmibank.com/api/tp-countries" and create "Finland" country
    And Oluşturulduktan sonra oluşturulan ülkeyi doğrulayalım "Finland"

