Feature: MyAccountPage Test
 @sanity@regression
Scenario: verifyUserShouldNavigateToRegisterPageSuccessfully
Given I am on a HomePage
When  I click on My Account Link.
And   I call the method “selectMyAccountOptions” method and pass the parameter "Register"
Then  I verify the text "Register Account" on register page
@sanity@regression
 Scenario:  verifyUserShouldNavigateToLoginPageSuccessfully
Given I am on homepage
When  I click on My Account Link.
And   I call the method “selectMyAccountOptions” method and pass the parameter "Login"
Then  I verify the text “Returning Customer”.
@smoke@regression
Scenario:  verifyThatUserRegisterAccountSuccessfully()
When   I click on My Account Link.
And   I call the method “selectMyAccountOptions” method and pass the parameter "Register"
And I enter following user details
 |Helen|McGarth|helen@gmail.com|7895623104|judy123|judy123|
And   I select Subscribe Yes radio button
And   I click on Privacy Policy check box
And   I click on Continue button
And   I verify the message "Your Account Has Been Created!" after registration complete
And   I click on Continue button on account has been created page
And   I click on My Account Link.
And   I call the method “selectMyAccountOptions” method and pass the parameter "Logout"
And   I verify the text “Account Logout”
Then   I click on Continue button on Logoutpage
@regression
Scenario: verifyThatUserShouldLoginAndLogoutSuccessfully
And   I click on My Account Link.
And   I call the method “selectMyAccountOptions” method and pass the parameter "Login"
And I enter following login details
 |helen@gmail.com|judy123|
And   I click on Login button
And   I verify text "My Account"
And   I click on My Account Link.
And   I call the method “selectMyAccountOptions” method and pass the parameter "Logout"
And   I verify the text "Account Logout" on Account logout page
Then  I click on Continue button on account logout page
