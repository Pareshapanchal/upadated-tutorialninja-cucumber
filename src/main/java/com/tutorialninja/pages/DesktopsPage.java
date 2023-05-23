package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());
    public DesktopsPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(linkText="Desktops")
    WebElement desktop;
    @CacheLookup
    @FindBys(@FindBy(xpath="//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"))
    List<WebElement> options;
    @CacheLookup
    @FindBys(@FindBy(xpath="//h4/a"))
    List<WebElement> products ;
    @CacheLookup
    @FindBys(@FindBy(xpath="//h4/a"))
    List<WebElement> products1 ;
    @CacheLookup
    @FindBy(id= "input-sort")
    WebElement sortBy ;
    @CacheLookup
    @FindBy(xpath="//span[normalize-space()='Currency']")
    WebElement currency ;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='£Pound Sterling']")
    WebElement poundSterling ;
    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'HP LP3065')]")
    WebElement hplp3065;
    @CacheLookup
    @FindBy(xpath="//h1[contains(text(),'HP LP3065')]")
    WebElement hplb3065Text;
    @CacheLookup
    @FindBy(xpath="//div[@class = 'input-group date']//button")
    WebElement calenderButton;
    @CacheLookup
    @FindBy(xpath="//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")
    WebElement calenderMonthAndYear ;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//th[@class='next']")
    WebElement nextButtonOnCalender;
    @CacheLookup
    @FindBys(@FindBy(xpath="//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"))
    List<WebElement> datesOnCalender;
    @CacheLookup
    @FindBy(xpath="//button[@id='button-cart']")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath="//input[@id='input-quantity']")
    WebElement quantity;
    @CacheLookup
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
    WebElement productAddedText ;
    @CacheLookup
    @FindBy(xpath= "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    WebElement shoppingCartButton ;
    @CacheLookup
    @FindBy(xpath="//strong[normalize-space()='View Cart']")
    WebElement viewCartButton ;
    @CacheLookup
    @FindBy(xpath="//h1[contains(text(),'Shopping Cart')]")
    WebElement shoppingCartText ;
    @CacheLookup
    @FindBy(xpath="//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productname ;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/small[1]")
    WebElement deliveryDate ;
    @CacheLookup
    @FindBy(xpath="//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement productModel;
    @CacheLookup
    @FindBy(xpath="//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement total ;

    public void mouseHoverOnAndClickDesktops(){
        log.info("Click on Desktops tab"+desktop.toString() );
        mouseHoverToElementAndClick(desktop); }
    public void selectMenuAndClickShowAllDesktops(){
        log.info("Click on Show AllDesktops" +options.toString());
        selectAndClickOnTheElementFromTheList(options,"Show AllDesktops");}
    public List<String> getExpectedProductsNameInZtoAOrder(){
        log.info("Get Expected Produts Name after sorted Z to A order"+products.toString() );
        List<String> list = getTheListOfElementFromTheList(products);
        Collections.reverse(list);
        System.out.println(list);
        return list;
    }
    public void selectsortByOptionsFromDropDown(String text){
        log.info("Sort by "+text );
        selectByVisibleTextFromDropDown(sortBy,text);  }
    public List<String> getActualProductsNameInZtoAOrder(){
        List<String> list;
        list = getTheListOfElementFromTheList(products1);
        System.out.println(list);
        log.info("Get Actual Produts Name after sorted Z to A order" +list);
        return list;
    }
    public List<String> getActualProductsNameInAtoZOrder(){
        List<String> list;
        list = getTheListOfElementFromTheList(products1);
        System.out.println(list);
        log.info("Get Actual Produts Name after sorted A to Z order" +list);
        return list;
    }
    public void clickOnHPLP3065(){
       log.info("Click on HPLP3065" +hplp3065);
       clickOnElement(hplp3065);    }
    public String getHPLP3065Text(){
        log.info("Get HPLP3065 Text" +hplb3065Text.getText());
        return getTextFromElement(hplb3065Text);    }
    public void clickOnCalenderButton(){
        log.info("Click On Calender Button" +calenderButton.toString());
        clickOnElement(calenderButton);    }
    public void selectDateFromTheCalender(String year,String month, String date)throws InterruptedException{
        Thread.sleep(1000);
        while (true) {
            String monthAndYear = getTextFromElement(calenderMonthAndYear);
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                log.info("Select date from calender" +nextButtonOnCalender.toString());
                clickOnElement(nextButtonOnCalender);
            }
        }
        List<WebElement> allDates = datesOnCalender;
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }
    public void clickOnAddToCartButton(){
        log.info("Click on AddToCart Button" +addToCartButton.toString());
        clickOnElement(addToCartButton);
    }
    public String getProductAddedMessage(){
        log.info("Get Product Added Message"+productAddedText.getText() );
        return getTextFromElement(productAddedText);
    }
    public String getShoppingCartText()
    {
        log.info("Get Shopping Cart Text" +shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }
    public void changeQuantity(String qty){
        log.info("Cahnge Quantity"+quantity.toString());
        clearTextFromField(quantity);
        sendTextToElement(quantity,qty);
    }
    public void clickOnShoppingCart(){
        log.info("Click on Shopping Cart" +shoppingCartButton.toString());
        clickOnElement(shoppingCartButton); }
    public void clickOnViewCar(){
        log.info("Click on View Cart" +viewCartButton.toString());
        clickOnElement(viewCartButton);
    }
    public String getProductTitle(){
        log.info("Get Product title" +productname.toString());
        return getTextFromElement(productname);}
    public String getDeliveryDate(){
        log.info("Get Delivery Date"+ deliveryDate.toString() );
        return getTextFromElement(deliveryDate);}
    public String getProductModel(){
        log.info("Get Product Model"+productModel.toString() );
        return getTextFromElement(productModel);}
    public String getTotalText(){
        log.info("Get Total" + total);
        return getTextFromElement(total);}
}
