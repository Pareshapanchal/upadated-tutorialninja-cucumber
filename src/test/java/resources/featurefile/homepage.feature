Feature: Homepage Test
@sanity@regression
  Scenario: verifyUserShouldNavigateToDesktopsPageSuccessfully
    Given I am on homepage
    When  I mouse hover on “Desktops” Tab and click
    And   I call selectMenu method and pass the menu = “Show All Desktops”
    And   I verify the text "Desktops"
@smoke@regression
  Scenario: verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully
  Given I am on homepage
  When  I mouse hover on “Laptops & Notebooks” Tab and click
  And   I call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
  And   I verify the text ‘Laptops & Notebooks’
@regression
  Scenario: verifyUserShouldNavigateToComponentsPageSuccessfully
  Given I am on homepage
  When  I mouse hover on "Components" Tab and click
  And   I call selectMenu method and pass the menu = "Show All Components"
  Then  I verify the text "Components" on components page