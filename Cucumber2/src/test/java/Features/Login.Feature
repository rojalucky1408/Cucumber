Feature:  LoginFeature
  This feature deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given Navigate to the login page
    And enter email address as Email : admin
    And  Enter the following Details for Login
      | username | password      |
      | admin    | adminpassword |
    And  click login button
    Then Login Successful

