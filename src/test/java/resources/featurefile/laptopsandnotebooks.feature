Feature: LaptopsAndNoteBooksPage Test
@sanity@regression
  Scenario: verifyProductsPriceDisplayHighToLowSuccessfully
    Given I am on homepage
    When  I mouse hover on Laptops & Notebooks Tab.and click
    And   I click on “Show All Laptops & Notebooks”
    Then  I select Sort By "Price (High > Low)" and verify the product price will arrange in High to Low order
@smoke@regression
 Scenario: verifyThatUserPlaceOrderSuccessfully
   Given  I am on homepage
   When   I mouse hover on Laptops & Notebooks Tab.and click
   And    I click on “Show All Laptops & Notebooks”
   And    I select Sort By "Price (High > Low)" option
   And    I select Product "MacBook"
   And    I verify the text “MacBook”
   And    I click on ‘Add To Cart’ button
   And    I verify the message Success: You have added MacBook to your shopping cart! on page
   And    I click on link “shopping cart” on checkout page
   And    I mouse hover and click on view cart
   And    I verify the text "Shopping Cart" text
   And    I verify the Product name "MacBook" title
   And    I change Quantity "2"
   And    I click on “Update” Tab
   And    I verify the message “Success: You have modified your shopping cart!”
   And    I verify the Total "£737.45" on page
   And    I click on “Checkout” button
   And    I verify the text "Checkout" on page
   And    I verify the Text "New Customer" onCheckout page
   And    I click on “Guest Checkout” radio button
   And    I click on “Continue” tab
   And    I enter following  user details in mandatory fields
  |Siya|Shah|siya@gmail.com|9125689425|3,Sama Road|Vadodara|85642|India|Gujarat|
   And    I click on “Continue” Button onGuestCheckout page
   And    I add Comments About your order into text area
   And    I check the Terms & Conditions check box
   And    I click on “Continue” button onPaymentMethod page
   Then   I verify the message "Warning: Payment method required!"message after clicking continue

