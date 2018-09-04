#Author: giedre.olseviciute@gmail.com
@sell
Feature: app.plus500.com > Trade > Sell feature testing
  I want to create, update and delete Sell feature in the system

  Scenario: Create new sell in the plus500
    Given I want to login to the system with random account name
    When I select Sell action in the first row or the table
    And confirm action
    Then I validate that position "Parduoti" displayed in the bottom of the row

  Scenario: Delete sell in the plus500
    Given I want to login to the system with random account name
    And create new sell
    When I select Close action for created sell
    And confirm Close action
    Then I validate that position "Parduoti" not displayed in the bottom of the row

  Scenario: Update sell in the plus500
    Given I want to login to the system with random account name
    And create new sell
    When I select Edit action for created sell
    And select Close At Profit checkbox
    Then I validate that checkox is selected
    And confirm action
    And I validate that Edit sidebar is not visible
