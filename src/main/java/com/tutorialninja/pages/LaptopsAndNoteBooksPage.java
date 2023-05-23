package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNoteBooksPage extends Utility {
    private static final Logger log = LogManager.getLogger(LaptopsAndNoteBooksPage.class.getName());
    public LaptopsAndNoteBooksPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(linkText= "Laptops & Notebooks")
    WebElement laptopAndNoteBooks ;
    @CacheLookup
    @FindBy(xpath="//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement laptopAndNoteBooksText ;
    @CacheLookup
    @FindBys(@FindBy(xpath="//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"))
    List<WebElement> options ;
    @CacheLookup
    @FindBys (@FindBy(xpath="//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"))
    List<WebElement> options1 ;
    @CacheLookup
    @FindBys(@FindBy(xpath="//p[@class ='price']"))
    List<WebElement> price ;
    @CacheLookup
    @FindBys(@FindBy(xpath="//p[@class ='price']"))
    List<WebElement> price1 ;
    @CacheLookup
    @FindBy(id="input-sort")
    WebElement sortBy ;
    @CacheLookup
    @FindBy(linkText="MacBook")
    WebElement macbook ;
    @CacheLookup
    @FindBy(xpath="//button[@id='button-cart']")
    WebElement addToCartButton ;
    @CacheLookup
    @FindBy(xpath="//h1[contains(text(),'MacBook')]")
    WebElement macbookText;
    @CacheLookup
    @FindBy(css = "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")
    WebElement productAdded ;
    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath="//body[1]/header[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[1]/p[1]/a[1]/strong[1]/i[1]")
    WebElement viewCartButton ;
    @CacheLookup
    @FindBy(xpath="//div[@id='content']//h1")
    WebElement shoppingCartText ;
    @CacheLookup
    @FindBy(xpath="//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement macBookTitle;
    @CacheLookup
    @FindBy(xpath="//input[contains(@name, 'quantity')]")
    WebElement quantity ;
    @CacheLookup
    @FindBy(xpath="//i[@class='fa fa-refresh']")
    WebElement updateQuantity;//input[@name='quantity
    @CacheLookup
    @FindBy(xpath="//div[@id='checkout-cart']/div[1]")
    WebElement shoppingCartMessage;
    @CacheLookup
    @FindBy(xpath="//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement total ;
    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement checkout;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/h1[1]")
    WebElement checkoutText;
    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement guestCheckout;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
    WebElement continueOnCheckoutPage;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New Customer']")
    WebElement newCustomerText;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//div[@class='form-group required']//input[@placeholder='E-Mail']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Telephone']")
    WebElement telephone;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Address 1']")
    WebElement address1;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/fieldset[1]/div[7]/select[1]")
    WebElement state;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='City']")
    WebElement city;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postcode;
    @CacheLookup
    @FindBy(xpath = "//select[@name='country_id']")
    WebElement country;
    @CacheLookup
    @FindBy(xpath = "//div[@class='pull-right']//input[@value='Continue']")
    WebElement continueOnGuestCheckout;
    @CacheLookup
    @FindBy(xpath = "//textarea[@name='comment']")
    WebElement comment;
    @CacheLookup
    @FindBy(xpath = "//input[@name='agree']")
    WebElement termsAndCondition;
    @CacheLookup
    @FindBy(xpath = "//div[@class='panel-collapse collapse in']//input[@value='Continue']")
    WebElement continueOnPaymentMethod;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]")
    WebElement warningMessage;
    public String getWaringMessage(){
        log.info("Get warning Message"+ warningMessage.toString());
        return getTextFromElement(warningMessage);
    }

    public void clickOnContinueOnPaymentMethod(){
        log.info("Click on Continue"+continueOnPaymentMethod.toString());
        clickOnElement(continueOnPaymentMethod);
    }
    public void clickOnTermsAndConditionButton(){
        log.info("Click on Terms & Condition"+termsAndCondition.toString());
        clickOnElement(termsAndCondition);
    }
    public void addComment(String comment1){
        log.info("Add comments"+comment.toString());
        sendTextToElement(comment,comment1);
    }
    public void clickcontinueOnGuestCheckoutPage(){
        log.info("Click on Continue"+continueOnGuestCheckout.toString());
        clickOnElement(continueOnGuestCheckout);
    }
    public void selectState(String state1){
        log.info("Select state "+state.toString());
        selectByVisibleTextFromDropDown(state,state1);
    }
    public void selectCountry(String country1){
        log.info("Select Country"+country.toString());
        selectByVisibleTextFromDropDown(country,country1);

    }
    public void enterPostcode(String postcode1){
        sendTextToElement(postcode,postcode1);
    }
    public void enterCity(String city1){
        log.info("Enter City"+city.toString());
        sendTextToElement(city,city1);
    }
    public void enterAddress1(String address){
        log.info("Enter Address1 "+address1.getText());
        sendTextToElement(address1,address);
    }
    public void enterFirstName(String firstname){
        log.info("Send on First Name to First Name field "+firstName.toString());
        sendTextToElement(firstName,firstname);
    }
    public void enterLastName(String lastname){
        log.info("Send on Last Name to Last Name field "+lastName.toString());
        sendTextToElement(lastName,lastname);
    }
    public void enterEmail(String email1){
        log.info("Enter Email to Email field "+email.toString());
        sendTextToElement(email,email1);
    }
    public void enterTelephone(String telephone1){
        log.info("Enter Telephone"+telephone.toString());
        sendTextToElement(telephone,telephone1);
    }

    public String getNewCustomerText(){
        log.info("Get New Customer text"+newCustomerText.toString());
        return getTextFromElement(newCustomerText);
    }
    public void clickOnContinueButtonOnCheckOutPage(){
        log.info("Clilck on Continue button on Checkout page"+continueOnCheckoutPage.toString());
        clickOnElement(continueOnCheckoutPage);
    }
    public void clickOnGuestCheckOutRadioButton(){
        log.info("Click on GuestCheckout Radio Button"+guestCheckout.toString());
        clickOnElement(guestCheckout);
    }
    public String getCheckoutText(){
        log.info("Get Checkout text"+checkoutText.toString());
        return getTextFromElement(checkoutText);
    }
    public void clickOnCheckoutButton(){
        log.info("Click on Checkout "+checkout.toString());
        clickOnElement(checkout);
    }
    public void mouseHoverOnLaptopsAndNoteBooks(){

        log.info("Click on Lpatops & Notebooks" +laptopAndNoteBooks.toString());
        mouseHoverToElementAndClick(laptopAndNoteBooks);
    }
    public void selectMenuAndClickShowAllLaptopsAndNoteBooks(){

      log.info("Click on Show AllLpatops & Notebooks"+options.toString() );
      selectAndClickOnTheElementFromTheList( options,"Show AllLaptops & Notebooks");

    }

    public List<Double> getExpectedPriceInDescendingOrder(){

      log.info("Get expected price list in decending order" );
      List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : price) {
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
        return originalProductsPrice;
    }

    public List<Double> getActualPriceInDescendingOrder(){

      log.info("Get actual price list in decending order" );
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : price1) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        return afterSortByPrice;
    }
    public void selectOptionFromSortByDropDown(String option){

        log.info("SortBy " +option);
        selectByVisibleTextFromDropDown(sortBy,option);
    }

    public void clickOnMacBook(){
      log.info("Click on MacBook" +macbook.toString());
      clickOnElement(macbook);
    }


    public String getMacBookText(){

        log.info("Get MacBook Text "+macbookText.getText() );
        return getTextFromElement(macbookText);
    }

    public void clickOnAddToCartButton(){

      log.info("Click on ADDTOCART button" +addToCartButton.toString());
      clickOnElement(addToCartButton);

    }

    public String getProductAddedMessage(){

        log.info("Get Product Added message "+productAdded.getText() );
        return getTextFromElement(productAdded);
    }

    public void clickOnShoppingCart(){

        log.info("Click on Shopping Cart" +shoppingCart.toString());
        clickOnElement(shoppingCart);
    }

    public void clickOnViewCart(){

      log.info("Click on ViewCart" +viewCartButton.toString());
     clickOnElement(viewCartButton);

    }

    public String getShoppingCartText(){

      log.info("Get Shopping Cart Text " +shoppingCartText.getText());
      return getTextFromElement(shoppingCartText);

    }

    public String getMacBookTitle(){

      log.info("Get MacBook Title "+macBookTitle.getText() );
      return getTextFromElement(macBookTitle);

    }

    public void changeQuantityField(String qty){

        log.info("Change quantity to" +qty);
        clearTextFromField(quantity);
        sendTextToElement(quantity,qty);
    }

    public void clickOnUpdateButton(){

      log.info("Click on Update" );
      clickOnElement(updateQuantity);
    }

    public String getShoppingCartMessage(){

      log.info("Get ShoppintCartMessage" +shoppingCartMessage.getText());
      return getTextFromElement(shoppingCartMessage);}

    public String getTotal(){

      log.info("Get Total"+total.toString() );
      return getTextFromElement(total);}
}
