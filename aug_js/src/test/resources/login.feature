Feature: Validating Login Functionality

 Scenario: Validating User Login
   Given User navigates to the application
   When  User enters valid credentials
   And   Clicks on Login button
   Then  User is navigated to the Dashboard page