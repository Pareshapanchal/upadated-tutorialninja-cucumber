$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("desktops.feature");
formatter.feature({
  "line": 1,
  "name": "Desktops Page Test",
  "description": "",
  "id": "desktops-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5708059600,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "verifyProductArrangeInAlphaBaticalOrder",
  "description": "",
  "id": "desktops-page-test;verifyproductarrangeinalphabaticalorder",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@sanity"
    },
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I mouse hover on Desktops",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click on \"Show All Desktops\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I select Sort By position \"Name (Z - A)\" and verify the Product will arrange in Descending order.",
  "keyword": "And "
});
formatter.match({
  "location": "DesktopsPageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 46288500,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsPageSteps.iMouseHoverOnDesktops()"
});
formatter.result({
  "duration": 167416100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Show All Desktops",
      "offset": 12
    }
  ],
  "location": "DesktopsPageSteps.iClickOn(String)"
});
formatter.result({
  "duration": 745992400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name (Z - A)",
      "offset": 27
    }
  ],
  "location": "DesktopsPageSteps.iSelectSortByPositionAndVerifyTheProductWillArrangeInDescendingOrder(String)"
});
formatter.result({
  "duration": 525236700,
  "status": "passed"
});
formatter.after({
  "duration": 574255900,
  "status": "passed"
});
formatter.before({
  "duration": 3507824100,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "verifyProductAddedToShoppingCartSuccessFully",
  "description": "",
  "id": "desktops-page-test;verifyproductaddedtoshoppingcartsuccessfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@smoke"
    },
    {
      "line": 8,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I mouse hover on Desktops",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I click on \"Show All Desktops\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select Sort By position \"Name (A - Z)\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select product \"HP LP3065\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I verify the Text \"HP LP3065\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select Delivery Date 2022-11-30 onproduct page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter Qty \"1\" using Select class.",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on “Add to Cart” button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I verify the Message \"Success: You have added HP LP3065 to your shopping cart!\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on link “shopping cart” display into success message",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I verify the text \"Shopping Cart\" on shopingcart page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I verify the Product name \"HP LP3065\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I verify the Delivery Date \"2022-11-30\" is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I verify the Model \"Product21\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I verify the Total \"£74.73\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DesktopsPageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 24700,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsPageSteps.iMouseHoverOnDesktops()"
});
formatter.result({
  "duration": 133300300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Show All Desktops",
      "offset": 12
    }
  ],
  "location": "DesktopsPageSteps.iClickOn(String)"
});
formatter.result({
  "duration": 686668000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name (A - Z)",
      "offset": 27
    }
  ],
  "location": "DesktopsPageSteps.iSelectSortByPosition(String)"
});
formatter.result({
  "duration": 328075100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HP LP3065",
      "offset": 18
    }
  ],
  "location": "DesktopsPageSteps.iSelectProduct(String)"
});
formatter.result({
  "duration": 654637100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HP LP3065",
      "offset": 19
    }
  ],
  "location": "DesktopsPageSteps.iVerifyTheText(String)"
});
formatter.result({
  "duration": 32657400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2022",
      "offset": 23
    },
    {
      "val": "11",
      "offset": 28
    },
    {
      "val": "30",
      "offset": 31
    }
  ],
  "location": "DesktopsPageSteps.iSelectDeliveryDateOnproductPage(int,int,int)"
});
formatter.result({
  "duration": 7540198600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 13
    }
  ],
  "location": "DesktopsPageSteps.iEnterQtyUsingSelectClass(String)"
});
formatter.result({
  "duration": 90359700,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsPageSteps.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 36568800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Success: You have added HP LP3065 to your shopping cart!",
      "offset": 22
    }
  ],
  "location": "DesktopsPageSteps.iVerifyTheMessage(String)"
});
formatter.result({
  "duration": 678591800,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsPageSteps.iClickOnLinkShoppingCartDisplayIntoSuccessMessage()"
});
formatter.result({
  "duration": 1371867300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shopping Cart",
      "offset": 19
    }
  ],
  "location": "DesktopsPageSteps.iVerifyTheTextOnShopingcartPage(String)"
});
formatter.result({
  "duration": 25057700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HP LP3065",
      "offset": 27
    }
  ],
  "location": "DesktopsPageSteps.iVerifyTheProductName(String)"
});
formatter.result({
  "duration": 15626800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2022-11-30",
      "offset": 28
    }
  ],
  "location": "DesktopsPageSteps.iVerifyTheDeliveryDateIsDisplayed(String)"
});
formatter.result({
  "duration": 36390700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Product21",
      "offset": 20
    }
  ],
  "location": "DesktopsPageSteps.iVerifyTheModel(String)"
});
formatter.result({
  "duration": 15264300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "£74.73",
      "offset": 20
    }
  ],
  "location": "DesktopsPageSteps.iVerifyTheTotal(String)"
});
formatter.result({
  "duration": 14496100,
  "status": "passed"
});
formatter.after({
  "duration": 605134000,
  "status": "passed"
});
formatter.uri("homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Homepage Test",
  "description": "",
  "id": "homepage-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4081340200,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "verifyUserShouldNavigateToDesktopsPageSuccessfully",
  "description": "",
  "id": "homepage-test;verifyusershouldnavigatetodesktopspagesuccessfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@sanity"
    },
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I mouse hover on “Desktops” Tab and click",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I call selectMenu method and pass the menu \u003d “Show All Desktops”",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I verify the text \"Desktops\"",
  "keyword": "And "
});
formatter.match({
  "location": "DesktopsPageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 21900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iMouseHoverOnDesktopsTabAndClick()"
});
formatter.result({
  "duration": 129918100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iCallSelectMenuMethodAndPassTheMenuShowAllDesktops()"
});
formatter.result({
  "duration": 734901600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Desktops",
      "offset": 19
    }
  ],
  "location": "HomePageSteps.iVerifyTheText(String)"
});
formatter.result({
  "duration": 15295900,
  "status": "passed"
});
formatter.after({
  "duration": 580308000,
  "status": "passed"
});
formatter.before({
  "duration": 4087837600,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully",
  "description": "",
  "id": "homepage-test;verifyusershouldnavigatetolaptopsandnotebookspagesuccessfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@smoke"
    },
    {
      "line": 8,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I mouse hover on “Laptops \u0026 Notebooks” Tab and click",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I call selectMenu method and pass the menu \u003d “Show All Laptops \u0026 Notebooks”",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I verify the text ‘Laptops \u0026 Notebooks’",
  "keyword": "And "
});
formatter.match({
  "location": "DesktopsPageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 13700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iMouseHoverOnLaptopsNotebooksTabAndClick()"
});
formatter.result({
  "duration": 155655000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iCallSelectMenuMethodAndPassTheMenuShowAllLaptopsNotebooks()"
});
formatter.result({
  "duration": 604271500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iVerifyTheTextLaptopsNotebooks()"
});
formatter.result({
  "duration": 25195100,
  "status": "passed"
});
formatter.after({
  "duration": 578990600,
  "status": "passed"
});
formatter.before({
  "duration": 3835108900,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "verifyUserShouldNavigateToComponentsPageSuccessfully",
  "description": "",
  "id": "homepage-test;verifyusershouldnavigatetocomponentspagesuccessfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I mouse hover on \"Components\" Tab and click",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I call selectMenu method and pass the menu \u003d \"Show All Components\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I verify the text \"Components\" on components page",
  "keyword": "Then "
});
formatter.match({
  "location": "DesktopsPageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 12500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Components",
      "offset": 18
    }
  ],
  "location": "HomePageSteps.iMouseHoverOnTabAndClick(String)"
});
formatter.result({
  "duration": 135987300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Show All Components",
      "offset": 46
    }
  ],
  "location": "HomePageSteps.iCallSelectMenuMethodAndPassTheMenu(String)"
});
formatter.result({
  "duration": 515091100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Components",
      "offset": 19
    }
  ],
  "location": "HomePageSteps.iVerifyTheTextOnComponentsPage(String)"
});
formatter.result({
  "duration": 15786500,
  "status": "passed"
});
formatter.after({
  "duration": 599247200,
  "status": "passed"
});
formatter.uri("laptopsandnotebooks.feature");
formatter.feature({
  "line": 1,
  "name": "LaptopsAndNoteBooksPage Test",
  "description": "",
  "id": "laptopsandnotebookspage-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4105663800,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "verifyProductsPriceDisplayHighToLowSuccessfully",
  "description": "",
  "id": "laptopsandnotebookspage-test;verifyproductspricedisplayhightolowsuccessfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@sanity"
    },
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I mouse hover on Laptops \u0026 Notebooks Tab.and click",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click on “Show All Laptops \u0026 Notebooks”",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I select Sort By \"Price (High \u003e Low)\" and verify the product price will arrange in High to Low order",
  "keyword": "Then "
});
formatter.match({
  "location": "DesktopsPageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 13500,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNoteBooksPageSteps.iMouseHoverOnLaptopsNotebooksTabAndClick()"
});
formatter.result({
  "duration": 128726800,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNoteBooksPageSteps.iClickOnShowAllLaptopsNotebooks()"
});
formatter.result({
  "duration": 615099900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (High \u003e Low)",
      "offset": 18
    }
  ],
  "location": "LaptopsAndNoteBooksPageSteps.iSelectSortByAndVerifyTheProductPriceWillArrangeInHighToLowOrder(String)"
});
formatter.result({
  "duration": 399856400,
  "status": "passed"
});
formatter.after({
  "duration": 585654400,
  "status": "passed"
});
formatter.before({
  "duration": 4162625100,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "verifyThatUserPlaceOrderSuccessfully",
  "description": "",
  "id": "laptopsandnotebookspage-test;verifythatuserplaceordersuccessfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@smoke"
    },
    {
      "line": 8,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I mouse hover on Laptops \u0026 Notebooks Tab.and click",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I click on “Show All Laptops \u0026 Notebooks”",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select Sort By \"Price (High \u003e Low)\" option",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select Product \"MacBook\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I verify the text “MacBook”",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on ‘Add To Cart’ button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I verify the message Success: You have added MacBook to your shopping cart! on page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on link “shopping cart” on checkout page",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I mouse hover and click on view cart",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I verify the text \"Shopping Cart\" text",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I verify the Product name \"MacBook\" title",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I change Quantity \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on “Update” Tab",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I verify the message “Success: You have modified your shopping cart!”",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I verify the Total \"£737.45\" on page",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on “Checkout” button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I verify the text \"Checkout\" on page",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I verify the Text \"New Customer\" onCheckout page",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I click on “Guest Checkout” radio button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click on “Continue” tab",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I enter following  user details in mandatory fields",
  "rows": [
    {
      "cells": [
        "Siya",
        "Shah",
        "siya@gmail.com",
        "9125689425",
        "3,Sama Road",
        "Vadodara",
        "85642",
        "India",
        "Gujarat"
      ],
      "line": 32
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click on “Continue” Button onGuestCheckout page",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I add Comments About your order into text area",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I check the Terms \u0026 Conditions check box",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I click on “Continue” button onPaymentMethod page",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I verify the message \"Warning: Payment method required!\"message after clicking continue",
  "keyword": "Then "
});
formatter.match({
  "location": "DesktopsPageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 33700,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNoteBooksPageSteps.iMouseHoverOnLaptopsNotebooksTabAndClick()"
});
formatter.result({
  "duration": 157581000,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNoteBooksPageSteps.iClickOnShowAllLaptopsNotebooks()"
});
formatter.result({
  "duration": 539484600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (High \u003e Low)",
      "offset": 18
    }
  ],
  "location": "LaptopsAndNoteBooksPageSteps.iSelectSortByOption(String)"
});
formatter.result({
  "duration": 340507100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MacBook",
      "offset": 18
    }
  ],
  "location": "LaptopsAndNoteBooksPageSteps.iSelectProduct(String)"
});
formatter.result({
  "duration": 709014600,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNoteBooksPageSteps.iVerifyTheTextMacBook()"
});
formatter.result({
  "duration": 26891900,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNoteBooksPageSteps.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 32316800,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNoteBooksPageSteps.iVerifyTheMessageSuccessYouHaveAddedMacBookToYourShoppingCartOnPage()"
});
formatter.result({
  "duration": 267090800,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNoteBooksPageSteps.iClickOnLinkShoppingCartOnCheckoutPage()"
});
formatter.result({
  "duration": 2373124900,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNoteBooksPageSteps.iMouseHoverAndClickOnViewCart()"
});
formatter.result({
  "duration": 1013797800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shopping Cart",
      "offset": 19
    }
  ],
  "location": "LaptopsAndNoteBooksPageSteps.iVerifyTheTextText(String)"
});
formatter.result({
  "duration": 24523300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MacBook",
      "offset": 27
    }
  ],
  "location": "LaptopsAndNoteBooksPageSteps.iVerifyTheProductNameTitle(String)"
});
formatter.result({
  "duration": 18977300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 19
    }
  ],
  "location": "LaptopsAndNoteBooksPageSteps.iChangeQuantity(String)"
});
formatter.result({
  "duration": 83637200,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNoteBooksPageSteps.iClickOnUpdateTab()"
});
formatter.result({
  "duration": 528937500,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNoteBooksPageSteps.iVerifyTheMessageSuccessYouHaveModifiedYourShoppingCart()"
});
formatter.result({
  "duration": 22718000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "£737.45",
      "offset": 20
    }
  ],
  "location": "LaptopsAndNoteBooksPageSteps.iVerifyTheTotalOnPage(String)"
});
formatter.result({
  "duration": 13377800,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNoteBooksPageSteps.iClickOnCheckoutButton()"
});
formatter.result({
  "duration": 320289800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Checkout",
      "offset": 19
    }
  ],
  "location": "LaptopsAndNoteBooksPageSteps.iVerifyTheTextOnPage(String)"
});
formatter.result({
  "duration": 16376600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New Customer",
      "offset": 19
    }
  ],
  "location": "LaptopsAndNoteBooksPageSteps.iVerifyTheTextOnCheckoutPage(String)"
});
formatter.result({
  "duration": 2042569700,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNoteBooksPageSteps.iClickOnGuestCheckoutRadioButton()"
});
formatter.result({
  "duration": 31325800,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNoteBooksPageSteps.iClickOnContinueTab()"
});
formatter.result({
  "duration": 36998000,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNoteBooksPageSteps.iEnterFollowingUserDetailsInMandatoryFields(DataTable)"
});
formatter.result({
  "duration": 1031347800,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNoteBooksPageSteps.iClickOnContinueButtonOnGuestCheckoutPage()"
});
formatter.result({
  "duration": 33834100,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNoteBooksPageSteps.iAddCommentsAboutYourOrderIntoTextArea()"
});
formatter.result({
  "duration": 622914800,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNoteBooksPageSteps.iCheckTheTermsConditionsCheckBox()"
});
formatter.result({
  "duration": 1044742300,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNoteBooksPageSteps.iClickOnContinueButtonOnPaymentMethodPage()"
});
formatter.result({
  "duration": 2048935400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Warning: Payment method required!",
      "offset": 22
    }
  ],
  "location": "LaptopsAndNoteBooksPageSteps.iVerifyTheMessageMessageAfterClickingContinue(String)"
});
formatter.result({
  "duration": 2047176400,
  "status": "passed"
});
formatter.after({
  "duration": 619324000,
  "status": "passed"
});
formatter.uri("myaccount.feature");
formatter.feature({
  "line": 1,
  "name": "MyAccountPage Test",
  "description": "",
  "id": "myaccountpage-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4097687100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "verifyUserShouldNavigateToRegisterPageSuccessfully",
  "description": "",
  "id": "myaccountpage-test;verifyusershouldnavigatetoregisterpagesuccessfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@sanity"
    },
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on a HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on My Account Link.",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I call the method “selectMyAccountOptions” method and pass the parameter \"Register\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I verify the text \"Register Account\" on register page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountPageSteps.iAmOnAHomePage()"
});
formatter.result({
  "duration": 50500,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 46383100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 74
    }
  ],
  "location": "MyAccountPageSteps.iCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameter(String)"
});
formatter.result({
  "duration": 561357700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register Account",
      "offset": 19
    }
  ],
  "location": "MyAccountPageSteps.iVerifyTheTextOnRegisterPage(String)"
});
formatter.result({
  "duration": 17915800,
  "status": "passed"
});
formatter.after({
  "duration": 573735100,
  "status": "passed"
});
formatter.before({
  "duration": 4204263000,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "verifyUserShouldNavigateToLoginPageSuccessfully",
  "description": "",
  "id": "myaccountpage-test;verifyusershouldnavigatetologinpagesuccessfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@sanity"
    },
    {
      "line": 8,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I click on My Account Link.",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I call the method “selectMyAccountOptions” method and pass the parameter \"Login\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I verify the text “Returning Customer”.",
  "keyword": "Then "
});
formatter.match({
  "location": "DesktopsPageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 10700,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 45362500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 74
    }
  ],
  "location": "MyAccountPageSteps.iCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameter(String)"
});
formatter.result({
  "duration": 324276200,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.iVerifyTheTextReturningCustomer()"
});
formatter.result({
  "duration": 24395700,
  "status": "passed"
});
formatter.after({
  "duration": 568834300,
  "status": "passed"
});
formatter.before({
  "duration": 4154188800,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "verifyThatUserRegisterAccountSuccessfully()",
  "description": "",
  "id": "myaccountpage-test;verifythatuserregisteraccountsuccessfully()",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@smoke"
    },
    {
      "line": 14,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I click on My Account Link.",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I call the method “selectMyAccountOptions” method and pass the parameter \"Register\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter following user details",
  "rows": [
    {
      "cells": [
        "Helen",
        "McGarth",
        "helen@gmail.com",
        "7895623104",
        "judy123",
        "judy123"
      ],
      "line": 19
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I select Subscribe Yes radio button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on Privacy Policy check box",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I verify the message \"Your Account Has Been Created!\" after registration complete",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on Continue button on account has been created page",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on My Account Link.",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I call the method “selectMyAccountOptions” method and pass the parameter \"Logout\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I verify the text “Account Logout”",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I click on Continue button on Logoutpage",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountPageSteps.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 44899600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 74
    }
  ],
  "location": "MyAccountPageSteps.iCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameter(String)"
});
formatter.result({
  "duration": 525609200,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.iEnterFollowingUserDetails(DataTable)"
});
formatter.result({
  "duration": 273271100,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.iSelectSubscribeYesRadioButton()"
});
formatter.result({
  "duration": 41633500,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.iClickOnPrivacyPolicyCheckBox()"
});
formatter.result({
  "duration": 34071400,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 514572800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your Account Has Been Created!",
      "offset": 22
    }
  ],
  "location": "MyAccountPageSteps.iVerifyTheMessageAfterRegistrationComplete(String)"
});
formatter.result({
  "duration": 50759900,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.iClickOnContinueButtonOnAccountHasBeenCreatedPage()"
});
formatter.result({
  "duration": 289045100,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 33992500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Logout",
      "offset": 74
    }
  ],
  "location": "MyAccountPageSteps.iCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameter(String)"
});
formatter.result({
  "duration": 526401200,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.iVerifyTheTextAccountLogout()"
});
formatter.result({
  "duration": 19321000,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.iClickOnContinueButtonOnLogoutpage()"
});
formatter.result({
  "duration": 12900,
  "status": "passed"
});
formatter.after({
  "duration": 589765000,
  "status": "passed"
});
formatter.before({
  "duration": 4107517400,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "verifyThatUserShouldLoginAndLogoutSuccessfully",
  "description": "",
  "id": "myaccountpage-test;verifythatusershouldloginandlogoutsuccessfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "I click on My Account Link.",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I call the method “selectMyAccountOptions” method and pass the parameter \"Login\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I enter following login details",
  "rows": [
    {
      "cells": [
        "helen@gmail.com",
        "judy123"
      ],
      "line": 34
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I verify text \"My Account\"",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I click on My Account Link.",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I call the method “selectMyAccountOptions” method and pass the parameter \"Logout\"",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I verify the text \"Account Logout\" on Account logout page",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I click on Continue button on account logout page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountPageSteps.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 45350700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 74
    }
  ],
  "location": "MyAccountPageSteps.iCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameter(String)"
});
formatter.result({
  "duration": 301288800,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.iEnterFollowingLoginDetails(DataTable)"
});
formatter.result({
  "duration": 112815700,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 483459800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Account",
      "offset": 15
    }
  ],
  "location": "MyAccountPageSteps.iVerifyText(String)"
});
formatter.result({
  "duration": 19346900,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 25564600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Logout",
      "offset": 74
    }
  ],
  "location": "MyAccountPageSteps.iCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameter(String)"
});
formatter.result({
  "duration": 480319200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Account Logout",
      "offset": 19
    }
  ],
  "location": "MyAccountPageSteps.iVerifyTheTextOnAccountLogoutPage(String)"
});
formatter.result({
  "duration": 19062600,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.iClickOnContinueButtonOnAccountLogoutPage()"
});
formatter.result({
  "duration": 300946100,
  "status": "passed"
});
formatter.after({
  "duration": 565556800,
  "status": "passed"
});
});