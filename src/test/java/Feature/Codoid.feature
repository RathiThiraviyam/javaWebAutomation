Feature: Codoid Page validations

  Scenario: User verify Codoid Home page

    Given As a User I Launch URL
    When I click on Log in button
    When I Enter "hariniravi25217@gmail.com" and passwords:
      | Password1   |
      | StrongPass2 |
      | SecurePass3 |
    Then I click on Login Button


