package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerPageTest extends BaseTest {
    ComputerPage computerPage = new ComputerPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {
        computerPage.clickOnComputerTab();
        computerPage.clickOnDesktop();
        computerPage.getSelectByText("Name: Z to A");
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        computerPage.clickOnComputerTab();
        computerPage.clickOnDesktop();
        computerPage.getSelectByText("Name: Z to A");
        computerPage.clickOnAddToCart();
        String expectedText = "Build your own computer";
        Assert.assertEquals(computerPage.getBuildYourOwnText(), expectedText, "Message not displayed");
        computerPage.selectProcessorE2200ByValue("1");
        computerPage.selectRam8GBByValue("5");
        computerPage.clickOnHDDRadio400GB();
        computerPage.clickOnOsRadioVistaPremium();
        computerPage.clickOnSoftwareTotalCommander();
        computerPage.totalCommand();
        Thread.sleep(2000);
        //Assert.assertEquals(computerPage.getTotalPrice1475(), "$1,470.00", "Price Not displayed");
        computerPage.clickOnAddToCartButton();
        String expectedMessage = "The product has been added to your shopping cart";
        Assert.assertEquals(computerPage.getCartText(), expectedMessage, "Not displayed");
        computerPage.closeCartMessageBox();
        computerPage.mouseHoverOnShoppingCart();
        computerPage.clickOnShoppingCart();
        Assert.assertEquals(computerPage.getShoppingCartText(), "Shopping cart", "Not Displayed");
        computerPage.clearTextInQuantityField();
        computerPage.sendTextToQuantityField();
        computerPage.clickOnUpdateShoppingCartButton();
        Assert.assertEquals(computerPage.verifyTotalPrice2950(), "$2,950.00", "Price not displayed");
        computerPage.clickOnCheckBoxIAgreeWithTermsAndCondition();
        computerPage.clickOnCheckOutButton();
        String expectedTextWelcome = "Welcome, Please Sign In!";
        Assert.assertEquals(computerPage.getWelcomePleaseSignInText(), expectedTextWelcome, "Text not displayed");
        computerPage.clickOnCheckOutAsGuestBox();
        Thread.sleep(2000);
        computerPage.enterTextToFirstNameField("Adam");
        computerPage.enterTextToLastNameField("Smith");
        computerPage.enterTextToEmailField("Adam1"+getAlphaNumericString(3)+"@gmail.com");
        computerPage.selectTextToCountryField();
        computerPage.selectStateToStateField();
        computerPage.selectTextToCityField("London");
        computerPage.sendTextToAddressLine1("1,Charlie road");
        computerPage.enterTextToAddressLine2("ninja");
        computerPage.enterTextToPostcode("HA5 7NN");
        computerPage.enterTextToPhoneNumberField("1234567890");
        computerPage.clickOnContinueButton();
        computerPage.clickOnNextDayAirButton();
        computerPage.clickOnContinueButtonAgain();
        computerPage.clickOnCreditCardButton();
        computerPage.clickOnContinue2();
        computerPage.clickOnCreditCardRadioButton();
        computerPage.clickOnContinueButton3();
        computerPage.selectMasterCardFromCreditCardDropdown("Master card");
        computerPage.sendTextTOCardHolderName("Adam");
        computerPage.sendTextTOCardNumber("5555555555554444");
        computerPage.selectMonthAndYearForCreditCardExpireData();
        computerPage.sendTextToCardCode("802");
        computerPage.clickOnContinueButton4();
        String expectedPaymentMethod = "Payment Method: Credit Card";
       Thread.sleep(2000);
        Assert.assertEquals(computerPage.getPaymentMethodText(),expectedPaymentMethod,"Card not Displayed");
        String expectedShippingMethod = "Shipping Method: Next Day Air";
        Assert.assertEquals(computerPage.verifyShippingMethodText(),expectedShippingMethod);
        Assert.assertEquals(computerPage.verifyTotalPriceIs2950(),"$2,950.00","Price Not matched");
        computerPage.clickOnConfirmButton();
        Assert.assertEquals(computerPage.verifyThankYouText(),"Thank you");
        String expectedText2 = "Your order has been successfully processed!";
        Assert.assertEquals(computerPage.verifySuccessfullyProcessedText(),expectedText2);
        computerPage.clickOnContinueButton5();
        String expectedWelcome = "Welcome to our store";
        Assert.assertEquals(computerPage.getWelcomeToOurStoreText(),expectedWelcome);

    }
}


