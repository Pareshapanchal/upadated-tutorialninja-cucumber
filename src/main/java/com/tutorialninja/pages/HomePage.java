package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(linkText="Desktops")
    WebElement desktop;
    @CacheLookup
    @FindBys(@FindBy(xpath= "//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"))
    List<WebElement> options ;
    @CacheLookup
    @FindBy(xpath="//h2[contains(text(),'Desktops')]")
    WebElement desktopText;
    @CacheLookup
    @FindBy(linkText="Laptops & Notebooks")
    WebElement laptopAndNoteBooks ;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/div[1]/a[1]")
    WebElement showAllLaptopsAndNotebooks;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/h2[1]")
    //"//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement laptopAndNoteBooksText ;
    @CacheLookup
    @FindBy(linkText="Components")
    WebElement components ;
    @CacheLookup
    @FindBy(xpath="//h2[contains(text(),'Components')]")
    WebElement componentsText ;
    public void mouseHoverOnAndClickDesktops(){
       log.info("Click on Desktops"+desktop.toString() );
        mouseHoverToElementAndClick(desktop);
    }
    public void selectMenuAndClickShowAllDesktops(){
       log.info("Click on Show AllDesktops" +options.toString());
       selectAndClickOnTheElementFromTheList(options,"Show AllDesktops");
    }
    public String getDesktopText(){
       log.info("Get Desktop text" +desktopText.toString());
        return getTextFromElement(desktopText);
    }
    public void mouseHoverOnLaptopsAndNoteBooks(){
       log.info("Mouse hover on Laptops and Notebooks" +laptopAndNoteBooks.toString());
       mouseHoverToElement(laptopAndNoteBooks);
    }
    public void selectMenuAndClickShowAllLaptopsAndNoteBooks(){
       log.info("Click on Show AllLaptops & Notebooks" +showAllLaptopsAndNotebooks.toString());
        mouseHoverToElementAndClick(showAllLaptopsAndNotebooks);
        //selectAndClickOnTheElementFromTheList(options,"Show AllLaptops & Notebooks");
    }
    public String getLaptopAndNoteBooksText(){
       log.info("Get Laptop And Notbook Text" +laptopAndNoteBooksText.getText());
        return  getTextFromElement(laptopAndNoteBooksText);
    }
    public void mouseHoverAndClickOnComponents(){
        log.info("Click on Components" +components.toString());
        mouseHoverToElementAndClick(components);
    }
    public void selectMenuAndClickShowAllComponents(){
       log.info("Click on Show AllComponents"+options.toString() );
       selectAndClickOnTheElementFromTheList(options,"Show AllComponents");
    }
    public String getComponentText(){
       log.info("Get Componenet Text"+ componentsText.toString() );
        return getTextFromElement(componentsText);
    }
}
