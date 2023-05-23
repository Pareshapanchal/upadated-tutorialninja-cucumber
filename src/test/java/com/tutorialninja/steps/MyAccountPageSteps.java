package com.tutorialninja.steps;

import com.tutorialninja.pages.MyAccountPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.List;

public class MyAccountPageSteps {
    @Given("^I am on a HomePage$")
    public void iAmOnAHomePage() {
    }

    @When("^I click on My Account Link\\.$")
    public void iClickOnMyAccountLink() {
        new MyAccountPage().clickOnMyAccountlink();
    }

    @And("^I call the method “selectMyAccountOptions” method and pass the parameter \"([^\"]*)\"$")
    public void iCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameter(String option)  {
        new MyAccountPage().selectMyAccountOptions(option);

    }

    @Then("^I verify the text \"([^\"]*)\" on register page$")
    public void iVerifyTheTextOnRegisterPage(String arg0)  {
        Assert.assertEquals(new MyAccountPage().getRegisterAccountText(),"Register Account","Register page not displayed");

    }

    @And("^I verify the text “Returning Customer”\\.$")
    public void iVerifyTheTextReturningCustomer() {
        Assert.assertEquals(new MyAccountPage().getReturningCustomerText(),"Returning Customer","Login page not displayed");
    }

    @And("^I test name verifyThatUserRegisterAccountSuccessfully\\(\\)$")
    public void iTestNameVerifyThatUserRegisterAccountSuccessfully() {
    }

    @And("^I clickr on My Account Link\\.$")
    public void iClickrOnMyAccountLink() {
        new MyAccountPage().clickOnMyAccountlink();
    }
    @And("^I enter following user details$")
    public void iEnterFollowingUserDetails(DataTable dataTable) {
        List<List<String>> data = dataTable.cells(0);
        new MyAccountPage().sendFirstNameLastName(data.get(0).get(0),data.get(0).get(1));
        new MyAccountPage().sendEmail(data.get(0).get(2));
        new MyAccountPage().sendTelephone(data.get(0).get(3));
        new MyAccountPage().sendPasswordAndConfirmPassword(data.get(0).get(4),data.get(0).get(5));
    }

    @And("^I select Subscribe Yes radio button$")
    public void iSelectSubscribeYesRadioButton() {
        new MyAccountPage().selectSubscribeRadioButton("Yes");
    }

    @And("^I click on Privacy Policy check box$")
    public void iClickOnPrivacyPolicyCheckBox() {
        new MyAccountPage().clickOnPrivacyPolicy();
    }

    @And("^I click on Continue button$")
    public void iClickOnContinueButton() {
        new MyAccountPage().clickOnContinueButton();
    }
    @And("^I verify the message \"([^\"]*)\" after registration complete$")
    public void iVerifyTheMessageAfterRegistrationComplete(String arg0) {
        Assert.assertEquals(new MyAccountPage().getAccountCreatedMessage(),"Your Account Has Been Created!", "Error");
    }
    @And("^I click on Continue button on account has been created page$")
    public void iClickOnContinueButtonOnAccountHasBeenCreatedPage() {
        new MyAccountPage().clickOnContinueButton2();
    }
    @And("^I verify the text “Account Logout”$")
    public void iVerifyTheTextAccountLogout() {
        Assert.assertEquals(new MyAccountPage().getAccountLogoutMessage(),"Account Logout","Not logged out");
    }
    @And("^I enter following login details$")
    public void iEnterFollowingLoginDetails(DataTable dataTable) {
        List<List<String>> data = dataTable.cells(0);
        new MyAccountPage().sendEmail(data.get(0).get(0));
        new MyAccountPage().sendPassword(data.get(0).get(1));
    }
    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new MyAccountPage().clickOnLoginButton();
    }
    @And("^I verify text \"([^\"]*)\"$")
    public void iVerifyText(String arg0) {
        Assert.assertEquals(new MyAccountPage().getMyAccountText(),"My Account","Login is not successful");
    }
    @And("^I verify the text \"([^\"]*)\" on Account logout page$")
    public void iVerifyTheTextOnAccountLogoutPage(String arg0)  {
        Assert.assertEquals(new MyAccountPage().getAccountLogoutMessage(),"Account Logout","User not logout successfully");
    }


    @Then("^I click on Continue button on account logout page$")
    public void iClickOnContinueButtonOnAccountLogoutPage() {
        new MyAccountPage().clickOnContinueButton3();
    }











    @Then("^I click on Continue button on Logoutpage$")
    public void iClickOnContinueButtonOnLogoutpage() {

    }



}
