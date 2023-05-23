Feature: Desktops Page Test
@sanity@regression
  Scenario:verifyProductArrangeInAlphaBaticalOrder
  Given I am on homepage
  When  I mouse hover on Desktops
  And   I click on "Show All Desktops"
  And   I select Sort By position "Name (Z - A)" and verify the Product will arrange in Descending order.
@smoke@regression
  Scenario:verifyProductAddedToShoppingCartSuccessFully
  Given I am on homepage
  When  I mouse hover on Desktops
  And   I click on "Show All Desktops"
  And   I select Sort By position "Name (A - Z)"
  And   I select product "HP LP3065"
  And   I verify the Text "HP LP3065"
  And   I select Delivery Date 2022-11-30 onproduct page
  And   I enter Qty "1" using Select class.
  And   I click on “Add to Cart” button
  And   I verify the Message "Success: You have added HP LP3065 to your shopping cart!"
  And   I click on link “shopping cart” display into success message
  And   I verify the text "Shopping Cart" on shopingcart page
  And   I verify the Product name "HP LP3065"
  And   I verify the Delivery Date "2022-11-30" is displayed
  And   I verify the Model "Product21"
  Then  I verify the Total "£74.73"