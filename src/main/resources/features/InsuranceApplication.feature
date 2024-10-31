Feature: Insurance Application

  Scenario: Fill and Submit Insurance Application
    Given I am on the insurance application page
    When I fill in the vehicle data and proceed
    And I fill in the insurant data and proceed
    And I fill in the product data and proceed
    And I select a price option and proceed
    And I fill in the quote details and submit
    Then I should see the message "Sending e-mail success!"
