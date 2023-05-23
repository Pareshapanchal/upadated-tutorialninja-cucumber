package com.tutorialninja.steps;

import com.tutorialninja.pages.DesktopsPage;
import com.tutorialninja.pages.LaptopsAndNoteBooksPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.List;

public class DesktopsPageSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on Desktops$")
    public void iMouseHoverOnDesktops() {
        new DesktopsPage().mouseHoverOnAndClickDesktops();
    }

    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String option) {
        new DesktopsPage().selectMenuAndClickShowAllDesktops();

    }
    @And("^I select Sort By position \"([^\"]*)\" and verify the Product will arrange in Descending order\\.$")
    public void iSelectSortByPositionAndVerifyTheProductWillArrangeInDescendingOrder(String option)  {
        List<String> expectedList = new DesktopsPage().getExpectedProductsNameInZtoAOrder();
        new DesktopsPage().selectsortByOptionsFromDropDown(option);
        Assert.assertEquals(new DesktopsPage().getActualProductsNameInZtoAOrder(),expectedList,"not match");
    }


//    @And("^I select Sort By position \"([^\"]*)\"$")
//    public void iSelectSortByPosition(String option) throws InterruptedException {
//        Thread.sleep(1000);
//
//    }
//
//    @Then("^I verify the Product will arrange in Descending order\\.$")
//    public void iVerifyTheProductWillArrangeInDescendingOrder() throws InterruptedException{
//
//        Collections.sort(expectedList);
//        System.out.println(expectedList);
//
//        Thread.sleep(1000);
//
//    }
//
@And("^I select Sort By position \"([^\"]*)\"$")
public void iSelectSortByPosition(String option) {
        new LaptopsAndNoteBooksPage().selectOptionFromSortByDropDown(option);

}
    @And("^I select product \"([^\"]*)\"$")
    public void iSelectProduct(String product)  {
        new DesktopsPage().clickOnHPLP3065();
    }

    @And("^I verify the Text \"([^\"]*)\"$")
    public void iVerifyTheText(String productTitle) {
        Assert.assertEquals(new DesktopsPage().getHPLP3065Text(),"HP LP3065","HP LP3065 Product not display");

    }
    @And("^I select Delivery Date (\\d+)-(\\d+)-(\\d+) onproduct page$")
    public void iSelectDeliveryDateOnproductPage(int arg0, int arg1, int arg2) throws InterruptedException{
        new DesktopsPage().clickOnCalenderButton();
        Thread.sleep(2000);
        try {
            new DesktopsPage().selectDateFromTheCalender("2023", "November", "30");
        }catch (Exception e){
            System.out.println("Error occured");
        }
    }
    @And("^I enter Qty \"([^\"]*)\" using Select class\\.$")
    public void iEnterQtyUsingSelectClass(String qty)  {
        new DesktopsPage().changeQuantity(qty);
    }

    @And("^I click on “Add to Cart” button$")
    public void iClickOnAddToCartButton() {
        new DesktopsPage().clickOnAddToCartButton();
    }

    @And("^I verify the Message \"([^\"]*)\"$")
    public void iVerifyTheMessage(String successMessage)  {
        boolean message = new DesktopsPage().getProductAddedMessage().contains(successMessage.trim());
        Assert.assertTrue(message);
    }

    @And("^I click on link “shopping cart” display into success message$")
    public void iClickOnLinkShoppingCartDisplayIntoSuccessMessage()throws InterruptedException {
        new DesktopsPage().clickOnShoppingCart();
        Thread.sleep(1000);
        new DesktopsPage().clickOnViewCar();

    }
    @And("^I verify the text \"([^\"]*)\" on shopingcart page$")
    public void iVerifyTheTextOnShopingcartPage(String shoppingCart) {
        Assert.assertTrue(new DesktopsPage().getShoppingCartText().contains("Shopping Cart"));
    }
    @And("^I verify the Product name \"([^\"]*)\"$")
    public void iVerifyTheProductName(String productName)  {
        Assert.assertEquals(new DesktopsPage().getProductTitle(),"HP LP3065","Product name not matched");
    }
    @And("^I verify the Delivery Date \"([^\"]*)\" is displayed$")
    public void iVerifyTheDeliveryDateIsDisplayed(String arg0) {
        System.out.println(new DesktopsPage().getDeliveryDate());
        Assert.assertTrue(new DesktopsPage().getDeliveryDate().contains("2023-11-30"));
    }


    @And("^I verify the Model \"([^\"]*)\"$")
    public void iVerifyTheModel(String model) {
        Assert.assertEquals(new DesktopsPage().getProductModel(),"Product 21", "Model not matched");
    }

    @Then("^I verify the Total \"([^\"]*)\"$")
    public void iVerifyTheTotal(String total) {

        Assert.assertEquals(new DesktopsPage().getTotalText(),"$122.00","Total not matched");
    }



}
