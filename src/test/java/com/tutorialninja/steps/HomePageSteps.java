package com.tutorialninja.steps;

import com.tutorialninja.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class HomePageSteps {
    @When("^I mouse hover on “Desktops” Tab and click$")
    public void iMouseHoverOnDesktopsTabAndClick() {
        new HomePage().mouseHoverOnAndClickDesktops();
    }

    @And("^I call selectMenu method and pass the menu = “Show All Desktops”$")
    public void iCallSelectMenuMethodAndPassTheMenuShowAllDesktops() {
        new HomePage().selectMenuAndClickShowAllDesktops();
    }

    @And("^I verify the text \"([^\"]*)\"$")
    public void iVerifyTheText(String desktop) {
        Assert.assertEquals(new HomePage().getDesktopText(),desktop,"Not navigate to Desktop page");

    }

    @When("^I mouse hover on “Laptops & Notebooks” Tab and click$")
    public void iMouseHoverOnLaptopsNotebooksTabAndClick() {
        new HomePage().mouseHoverOnLaptopsAndNoteBooks();
    }

    @And("^I call selectMenu method and pass the menu = “Show All Laptops & Notebooks”$")
    public void iCallSelectMenuMethodAndPassTheMenuShowAllLaptopsNotebooks() {
        new HomePage().selectMenuAndClickShowAllLaptopsAndNoteBooks();
    }

    @And("^I verify the text ‘Laptops & Notebooks’$")
    public void iVerifyTheTextLaptopsNotebooks() {
        Assert.assertEquals(new HomePage().getLaptopAndNoteBooksText(),"Laptops & Notebooks","Not navigate to Laptops and Notebooks page");
    }
    @When("^I mouse hover on \"([^\"]*)\" Tab and click$")
    public void iMouseHoverOnTabAndClick(String arg0)  {
        new HomePage().mouseHoverAndClickOnComponents();
    }

    @And("^I call selectMenu method and pass the menu = \"([^\"]*)\"$")
    public void iCallSelectMenuMethodAndPassTheMenu(String arg0) {
        new HomePage().selectMenuAndClickShowAllComponents();
    }

    @Then("^I verify the text \"([^\"]*)\" on components page$")
    public void iVerifyTheTextOnComponentsPage(String component) {
        Assert.assertEquals(new HomePage().getComponentText(),component,"Not navigate to Components page");
    }
}
