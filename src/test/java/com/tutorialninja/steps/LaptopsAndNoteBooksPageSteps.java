package com.tutorialninja.steps;

import com.tutorialninja.pages.LaptopsAndNoteBooksPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.List;

public class LaptopsAndNoteBooksPageSteps {
    @When("^I mouse hover on Laptops & Notebooks Tab\\.and click$")
    public void iMouseHoverOnLaptopsNotebooksTabAndClick() {
        new LaptopsAndNoteBooksPage().mouseHoverOnLaptopsAndNoteBooks();

    }

    @And("^I click on “Show All Laptops & Notebooks”$")
    public void iClickOnShowAllLaptopsNotebooks() {
        new LaptopsAndNoteBooksPage().selectMenuAndClickShowAllLaptopsAndNoteBooks();
    }

    @And("^I select Sort By \"([^\"]*)\" and verify the product price will arrange in High to Low order$")
    public void iSelectSortByAndVerifyTheProductPriceWillArrangeInHighToLowOrder(String option) {
        List<Double> exptectPrice= new LaptopsAndNoteBooksPage().getExpectedPriceInDescendingOrder();
        new LaptopsAndNoteBooksPage().selectOptionFromSortByDropDown(option);
        Assert.assertEquals(new LaptopsAndNoteBooksPage().getActualPriceInDescendingOrder(),exptectPrice,"Proucts has not been ordered as per requirement");
    }

    @And("^I select Sort By \"([^\"]*)\" option$")
    public void iSelectSortByOption(String option)  {
        new LaptopsAndNoteBooksPage().selectOptionFromSortByDropDown(option);
    }

    @And("^I select Product \"([^\"]*)\"$")
    public void iSelectProduct(String arg0)  {
        new LaptopsAndNoteBooksPage().clickOnMacBook();

    }

    @And("^I verify the text “MacBook”$")
    public void iVerifyTheTextMacBook() {
        Assert.assertEquals(new LaptopsAndNoteBooksPage().getMacBookText(),"MacBook","MacBook Product not display");
    }

    @And("^I click on ‘Add To Cart’ button$")
    public void iClickOnAddToCartButton() {
        new LaptopsAndNoteBooksPage().clickOnAddToCartButton();
    }
    @And("^I verify the message Success: You have added MacBook to your shopping cart! on page$")
    public void iVerifyTheMessageSuccessYouHaveAddedMacBookToYourShoppingCartOnPage() {
        Assert.assertTrue(new LaptopsAndNoteBooksPage().getProductAddedMessage().contains("Success: You have added MacBook to your shopping cart!"),"Product not added to cart");
    }
    @And("^I click on link “shopping cart” on checkout page$")
    public void iClickOnLinkShoppingCartOnCheckoutPage() throws InterruptedException{
        new LaptopsAndNoteBooksPage().clickOnShoppingCart();
        Thread.sleep(2000);
        //new LaptopsAndNoteBooksPage().clickOnViewCart();
    }

    @And("^I mouse hover and click on view cart$")
    public void iMouseHoverAndClickOnViewCart() throws InterruptedException{
        Thread.sleep(1000);

    }

    @And("^I verify the text \"([^\"]*)\" text$")
    public void iVerifyTheTextText(String arg0)  {
        Assert.assertTrue(new LaptopsAndNoteBooksPage().getShoppingCartText().contains("Shopping Cart"));

    }

    @And("^I verify the Product name \"([^\"]*)\" title$")
    public void iVerifyTheProductNameTitle(String arg0)  {
        Assert.assertEquals(new LaptopsAndNoteBooksPage().getMacBookTitle(),"MacBook","Product name not matched");

    }

    @And("^I change Quantity \"([^\"]*)\"$")
    public void iChangeQuantity(String qty)  {
        new LaptopsAndNoteBooksPage().changeQuantityField(qty);

    }

    @And("^I click on “Update” Tab$")
    public void iClickOnUpdateTab() {
        new LaptopsAndNoteBooksPage().clickOnUpdateButton();
    }

    @And("^I verify the message “Success: You have modified your shopping cart!”$")
    public void iVerifyTheMessageSuccessYouHaveModifiedYourShoppingCart() {
     Assert.assertTrue(new LaptopsAndNoteBooksPage().getShoppingCartMessage().contains("Success: You have modified your shopping cart!"),"Cart not modified");
    }

    @And("^I verify the Total \"([^\"]*)\" on page$")
    public void iVerifyTheTotalOnPage(String arg0)  {
   Assert.assertEquals(new LaptopsAndNoteBooksPage().getTotal(),"$1,204.00","Total not matched");
    }

    @And("^I click on “Checkout” button$")
    public void iClickOnCheckoutButton() {
        new LaptopsAndNoteBooksPage().clickOnCheckoutButton();
    }

    @And("^I verify the text \"([^\"]*)\" on page$")
    public void iVerifyTheTextOnPage(String arg0)  {
     Assert.assertEquals(new LaptopsAndNoteBooksPage().getCheckoutText(),"Checkout","User can not checkout successfully");
    }
    @And("^I verify the Text \"([^\"]*)\" onCheckout page$")
    public void iVerifyTheTextOnCheckoutPage(String arg0) throws InterruptedException  {
        Thread.sleep(2000);
     Assert.assertEquals(new LaptopsAndNoteBooksPage().getNewCustomerText(),"New Customer","New Customer not displayed");
    }
   @And("^I click on “Guest Checkout” radio button$")
    public void iClickOnGuestCheckoutRadioButton() {
        new LaptopsAndNoteBooksPage().clickOnGuestCheckOutRadioButton();
    }

    @And("^I click on “Continue” tab$")
    public void iClickOnContinueTab() {
        new LaptopsAndNoteBooksPage().clickOnContinueButtonOnCheckOutPage();
    }
    @And("^I enter following  user details in mandatory fields$")
    public void iEnterFollowingUserDetailsInMandatoryFields(DataTable dataTable) {
        List<List<String>> data= dataTable.cells(0);
        new LaptopsAndNoteBooksPage().enterFirstName(data.get(0).get(0));
        new LaptopsAndNoteBooksPage().enterLastName(data.get(0).get(1));
        new LaptopsAndNoteBooksPage().enterEmail(data.get(0).get(2));
        new LaptopsAndNoteBooksPage().enterTelephone(data.get(0).get(3));
        new LaptopsAndNoteBooksPage().enterAddress1(data.get(0).get(4));
        new LaptopsAndNoteBooksPage().enterCity(data.get(0).get(5));
        new LaptopsAndNoteBooksPage().enterPostcode(data.get(0).get(6));
        new LaptopsAndNoteBooksPage().selectCountry(data.get(0).get(7));
        new LaptopsAndNoteBooksPage().selectState(data.get(0).get(8));
    }


    @And("^I add Comments About your order into text area$")
    public void iAddCommentsAboutYourOrderIntoTextArea() {
        new LaptopsAndNoteBooksPage().addComment("All good");
    }
    @And("^I click on “Continue” Button onGuestCheckout page$")
    public void iClickOnContinueButtonOnGuestCheckoutPage() {
        new LaptopsAndNoteBooksPage().clickcontinueOnGuestCheckoutPage();
    }
    @And("^I check the Terms & Conditions check box$")
    public void iCheckTheTermsConditionsCheckBox() throws InterruptedException{
        Thread.sleep(1000);
        new LaptopsAndNoteBooksPage().clickOnTermsAndConditionButton();
    }
    @And("^I click on “Continue” button onPaymentMethod page$")
    public void iClickOnContinueButtonOnPaymentMethodPage() throws InterruptedException{
        Thread.sleep(2000);
        new LaptopsAndNoteBooksPage().clickOnContinueOnPaymentMethod();
    }
    @Then("^I verify the message \"([^\"]*)\"message after clicking continue$")
    public void iVerifyTheMessageMessageAfterClickingContinue(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(new LaptopsAndNoteBooksPage().getWaringMessage());
        Assert.assertEquals(new LaptopsAndNoteBooksPage().getWaringMessage(),"Warning: Payment method required!\n" +
                "×","Warning message not displayed");
    }
}
