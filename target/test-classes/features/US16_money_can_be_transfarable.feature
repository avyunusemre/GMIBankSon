@US16TCs
    Feature: US16_money_can_transferable_between_accounts
        Background: US16_money_transfer_between_accounts
            Given User is on GMIBank Login page
            When  user provide valid username "Team5Customer"
            When  user provide valid password "customerTeam5"
            When  user click sign in button
            When  verify  username when user logged in
            When  user goes to Transfer Money under My Operation
            Then  verify user is on Customer Accounts page

        Scenario: User should have at least 2 accounts
            Then  verify user has minimum two accounts

        Scenario:User can select the first account as From dropdown where they receive their money from
            When user select an account from FROM box "5778"
            Then verify selected account is displayed in the FROM box "5778"

        Scenario:User can select the other account as TO dropdown where they receive their money to
            When user select an account from FROM box "5778"
            When user select an account from TO box "5776"
            Then verify selected account is displayed in the TO box "5776"

        Scenario: User can provide  a balance that they want to proceed with
            When user select an account from FROM box "5778"
            When user select an account from TO box "5776"
            When user provide an amount that user want to transfer "100"
            Then verify the amount is visible in the box "100"

        Scenario: User should provide a description for that transfer
            When user select an account from FROM box "5778"
            When user select an account from TO box "5776"
            When user provide an amount that user want to transfer "100"
            When user provide description to the box "Transfer"
            Then verify the description is visible int the box "Transfer"

        Scenario: User can make sure  transfer is done successfully validating the message an amount of transaction
            When user select an account from FROM box "5778"
            When user select an account from TO box "5776"
            When user provide an amount that user want to transfer "100"
            When user provide description to the box "Transfer"
            When user click Make Transfer button
            Then verify success message "100.0$ is transferred successfully."