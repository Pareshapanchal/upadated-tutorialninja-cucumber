package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());
    public MyAccountPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'My Account')]")
    WebElement myAccountlink ;
    @CacheLookup
    @FindBy(xpath="//body[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]")
    WebElement myAccountlink1 ;
    @CacheLookup
    @FindBys(@FindBy(xpath="//div[@id='top-links']//li[contains(@class,'open')]/ul/li"))
    List<WebElement> listOfOptions ;
    @CacheLookup
    @FindBy(xpath="//h2[contains(text(),'Returning Customer')]")
    WebElement returningCustomerText ;
    @CacheLookup
    @FindBy(xpath="//h1[contains(text(),'Register Account')]")
    WebElement registerAccountText ;
    @CacheLookup
    @FindBy(id="input-firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(id="input-lastname")
    WebElement lastName ;
    @CacheLookup
    @FindBy(id="input-email")
    WebElement emailField ;
    @CacheLookup
    @FindBy(id="input-telephone")
    WebElement telephone ;
    @CacheLookup
    @FindBy(id="input-password")
    WebElement password ;
    @CacheLookup
    @FindBy(id="input-confirm")
    WebElement confirmPassword ;
    @CacheLookup
    @FindBy(xpath="//label[normalize-space()='Yes']")
    WebElement subscribeRadioButton ;
    @CacheLookup
    @FindBy(xpath="//div[@class = 'buttons']//input[@name='agree']")
    WebElement privacyCheckbox ;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
    WebElement continueButton ;
    @CacheLookup
    @FindBy(xpath="//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement accoutCreatedText ;
    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'Continue')]")
    WebElement continueButton2 ;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/h1[1]")
    WebElement accountLogout ;
    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'Continue')]")
    WebElement continueButton3 ;
    @CacheLookup
    @FindBy(xpath="//form[contains(@action,'login')]//input[@type='submit']")
    WebElement loginButton ;
    @CacheLookup
    @FindBy(xpath = "//body[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[5]/a[1]")
    WebElement logout;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/h2[1]")
    WebElement myAccounttext;
    public String getMyAccountText(){
        log.info("Get My Account Text");
        return getTextFromElement(myAccounttext);
    }
    public void clickOnLoginButton(){
       log.info("Click on Login Button"+loginButton.toString());
        clickOnElement(loginButton);
    }

    public void sendFirstNameLastName(String firstname, String lastname){
       log.info("Enter First Name  "+firstname.toString() +"  And Last Name"+lastname.toString() );
        sendTextToElement(firstName,firstname);
        sendTextToElement(lastName,lastname);
    }
    public void sendPassword(String password1){
       log.info("Enter Password in passwordfield  "+ password1.toString());
        sendTextToElement(password,password1);
    }
    public void sendEmail(String email){
       log.info("Enter Email Address "+ email.toString() );
        sendTextToElement(emailField,email);
    }
    public void sendTelephone(String phone) {
       log.info("Enter Telephone number "+phone.toString() );
       sendTextToElement(telephone,phone);
    }
    public void sendPasswordAndConfirmPassword(String password1, String confirmpassword){
       log.info("Enter Passwrod "+password1.toString()+" Enter Confirm Password "+confirmpassword.toString() );
        sendTextToElement(password,password1);
        sendTextToElement(confirmPassword,confirmpassword);
    }
    public void selectSubscribeRadioButton(String text){

       log.info("Select Subscriber Radio Button " + subscribeRadioButton.toString());
       clickOnElement(subscribeRadioButton);
    }
    public void clickOnPrivacyPolicy() {
       log.info("Check on PrivacyPolicy checkbox" +privacyCheckbox.toString());
       clickOnElement(privacyCheckbox);
    }
    public void clickOnContinueButton() {
       log.info("Click on Continue button" +continueButton.toString());
       clickOnElement(continueButton);
    }
    public String getAccountCreatedMessage() {
       log.info("Get Account created message" + accoutCreatedText.toString());
       return getTextFromElement(accoutCreatedText);
    }
    public void clickOnContinueButton2() {
       log.info("Click on Continue Button"+continueButton2.toString() );
       clickOnElement(continueButton2);
    }
    public String getAccountLogoutMessage(){
       log.info("Get Account Logout message" +accountLogout.toString());
       return getTextFromElement(accountLogout);

    }
    public void clickOnContinueButton3(){

       log.info("Click on Continue button"+continueButton3.toString() );
       clickOnElement(continueButton3);
    }
    public void clickOnMyAccountlink(){
       log.info("Click on My Account tab" +myAccountlink.toString());
       clickOnElement(myAccountlink);
    }
    public void clickOnMyAccountTab(){
       log.info("Click on My Account tab"+myAccountlink1.toString() );

        clickOnElement(myAccountlink1);
    }

    public String getReturningCustomerText(){
       log.info("Get Returning Customer text" + returningCustomerText.toString());
       return getTextFromElement(returningCustomerText); }

    public String getRegisterAccountText(){
       log.info("Get Register Account text" +registerAccountText.toString());
       return getTextFromElement(registerAccountText);}

    public void clickOnLogout(){

        log.info("Click on Logout link"+logout.toString());
        clickOnElement(logout);
    }

    public void selectMyAccountOptions(String option){

       log.info("Select option from MyAccount" );

        try {
            for (WebElement options : listOfOptions) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        }catch (StaleElementReferenceException e){
            System.out.println(listOfOptions);
        }

    }
}
