@Sprint2
Feature: US30 Write Customers' data to PDF

  Background: connection
    Given Create a connection with DB using "jdbc:postgresql://157.230.48.97:5432/gmibank_db","techprodb_user" and "Techpro_@126"

    Scenario Outline: read and validate data using DB
    Given Read Customers'data using "<query>" and "<column>"
      Then Validate the Customers'data
      And  Print Users' data to PDF



      Examples:
        | query |column|
        | Select * from tp_customer; | ssn    |
