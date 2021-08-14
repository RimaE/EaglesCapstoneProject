Feature: Retail Page

  Background: 
    Given User is on Retail Website
    And User click on MyAccount
    When User click on Login
    And User enter username 'ruru@gmail.com' and password 'eagles'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  @RegisterAffiliate
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on 'Register for an Affiliate Account' link
    And User fill affiliate form with below information
      | company   | website      | taxID | paymentMethod | ChequePayeeName|
      | TekSchool | https://tekschool.us/ |  2345 | cheque       | Rima Elayan|
    And User check on About Us check box
    And User click on Continue affiliate button
    Then User should see a success message 'Success: Your account has been successfully updated.'

  @EditAffiliate
  Scenario: Edit your affiliate information from Cheque payment Method to Bank Transfer
   	When User click on 'Edit your affiliate information' link
    And User click on Bank Transfer radio button
    And User fill bank information with below information
      | bankName    | abaNumber  | swiftCode | accountName | accountNumber |
      | Wells Fargo | 2743430450 |     23453 | Rima        |       1234567 |
    And User click on Continue affiliate button
    Then User should see a success message 'Success: Your account has been successfully updated.'

  @EditAccountInfo
  Scenario: Edit your account Information
    When User click on 'Edit your account information' link
    And User modify below information
      | firstName | lastName | email | telephone |
      |	Rima| Elayan| ahmad@gmail.com | 5715278782 |
    And  User click on continue button
    Then User should see a message 'Success: Your account has been successfully updated'
