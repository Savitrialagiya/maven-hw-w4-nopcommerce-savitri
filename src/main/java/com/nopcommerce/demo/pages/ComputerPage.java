package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class ComputerPage extends Utility {
    By computerMenu = By.linkText("Computers");
    By desktopMenu = By.xpath("//h2[@class='title']//a");
    By sortByZToA = By.xpath("//select[@name='products-orderby']");
    By addToCart = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");
    By getBuildYourOwn = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By processorE2200 = By.xpath("//select[@id='product_attribute_1']");
    By selectRam8GB = By.xpath("//select[@id='product_attribute_2']");
    By selectHDDRadio = By.xpath("//label[text()='400 GB [+$100.00]']");
    By selectOSRadioVista = By.xpath("//label[text()='Vista Premium [+$60.00]']");
    By checkBoxMSOffice = By.xpath("//input[@id='product_attribute_5_10']");
    By checkBoxTotalCommander = By.xpath("//input[@id='product_attribute_5_12']");
    By getTotalPrice = By.xpath("//span[@id='price-value-1']");
    By addToCartButton = By.xpath("//button[@id='add-to-cart-button-1']");
    By getCartMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeCartMessage = By.xpath("//span[@class='close']");
    By hoverOnShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCartClick = By.xpath("//button[contains(text(),'Go to cart')]");
    By getShoppingCartMessage = By.xpath("//span[contains(text(),'Shopping cart')]");
    By clearText = By.xpath("//input[@value='1']");
    By sendTextToQuantity = By.xpath("//input[@value='1']");
    By clickOnUpdateShoppingCart = By.xpath("//button[@id='updatecart']");
    By getTotal2950 = By.xpath("//span[@class='product-subtotal']");
    By termsAndServicesCheckbox = By.xpath("//input[@id='termsofservice']");
    By clickOnCheckout = By.xpath("//button[@id='checkout']");
    By getTextWelcomePleaseSignInMessage = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By clickOnCheckoutAsGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By sendTextToFirstName = By.id("BillingNewAddress_FirstName");
    By sendTextToLastName = By.id("BillingNewAddress_LastName");
    By sendTextToEmail = By.id("BillingNewAddress_Email");
    By selectCountry = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By selectCity = By.xpath("//input[@id='BillingNewAddress_City']");
    By selectState = By.id("BillingNewAddress_StateProvinceId");
    By address1 = (By.cssSelector("#BillingNewAddress_Address1"));
    By address2 = (By.cssSelector("#BillingNewAddress_Address2"));
    By postalCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By clickOnContinue = By.name("save");
    By nextDayAirButton = By.xpath("//input[@id='shippingoption_1']");
    By clickOnContinue1 = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By creditCard = By.xpath("//input[@id='paymentmethod_1']");
    By continueButton2 = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By creditCardRadioButton = By.xpath("//input[@id='paymentmethod_1']");
    By continueButton3 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
    By masterCard = By.xpath("//select[@id='CreditCardType']");
    By cardHolderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By cardCode = By.id("CardCode");
    By continueButton4 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By verifyPaymentMethod = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]");
    By getShippingMethodText = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]");
    By totalIs2950 = By.xpath("//tr[@class='order-total']/td[2]/span/strong");
    By confirm = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    By getThankYouText = By.xpath("//h1[contains(text(),'Thank you')]");
    By getSuccessfullyProcessedText = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continueButton5 =  By.cssSelector("div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.checkout-page.order-completed-page div.page-body.checkout-data div.section.order-completed div.buttons > button.button-1.order-completed-continue-button");
    By getWelcomeToOurStore = By.xpath("//h2[contains(text(),'Welcome to our store')]");


    public void clickOnComputerTab() {
        clickOnElement(computerMenu);
    }
    public void clickOnDesktop() {
        clickOnElement(desktopMenu);
    }
    public void getSelectByText(String value){
        selectByVisibleTextFromDropDown(sortByZToA,value);
    }
    public void clickOnAddToCart() {
        try {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        } catch (StaleElementReferenceException e) {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        }
        clickOnElement(addToCart);
    }
    public String getBuildYourOwnText() {
        return getTextFromElement(getBuildYourOwn);
    }
    public void selectProcessorE2200ByValue(String value){
        selectByValueFromDropDown(processorE2200,value);
    }
    public void selectRam8GBByValue(String value){
        selectByValueFromDropDown(selectRam8GB,value);
    }
    public void clickOnHDDRadio400GB() {
        clickOnElement(selectHDDRadio);
    }
    public void clickOnOsRadioVistaPremium() {
        clickOnElement(selectOSRadioVista);
    }
    public void clickOnSoftwareTotalCommander() {
        mouseHoverToElement(checkBoxMSOffice);
    }
    public void totalCommand(){
        clickOnElement(checkBoxTotalCommander);
    }
    public String getTotalPrice1475() {
        return getTextFromElement(getTotalPrice);
    }
    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }
    public String getCartText() {
        return getTextFromElement(getCartMessage);
    }
    public void closeCartMessageBox() {
        clickOnElement(closeCartMessage);
    }
    public void mouseHoverOnShoppingCart() {
        mouseHoverToElementAndClick(hoverOnShoppingCart);
    }
    public void clickOnShoppingCart() {
    clickOnElement(goToCartClick);
    }
    public String getShoppingCartText(){
        return getTextFromElement(getShoppingCartMessage);
    }
    public void clearTextInQuantityField() {
        Actions actions = new Actions(driver);
        WebElement quantity = driver.findElement(clearText);
        quantity.clear();
    }
    public void sendTextToQuantityField() {
        sendTextToElement(sendTextToQuantity, "2");
    }
    public void clickOnUpdateShoppingCartButton() {
        clickOnElement(clickOnUpdateShoppingCart);
    }
    public String verifyTotalPrice2950(){
        return getTextFromElement(getTotal2950);
    }
    public void clickOnCheckBoxIAgreeWithTermsAndCondition() {
        clickOnElement(termsAndServicesCheckbox);
    }
    public void clickOnCheckOutButton() {
        clickOnElement(clickOnCheckout);
    }
    public String getWelcomePleaseSignInText(){
        return getTextFromElement(getTextWelcomePleaseSignInMessage);
    }
    public void clickOnCheckOutAsGuestBox() {
        clickOnElement(clickOnCheckoutAsGuest);
    }
    public void enterTextToFirstNameField(String name) {
        sendTextToElement(sendTextToFirstName, name);
    }
    public void enterTextToLastNameField(String lastName) {
        sendTextToElement(sendTextToLastName, lastName);
    }
    public void enterTextToEmailField(String email) {
        sendTextToElement(sendTextToEmail, email);
    }
    public void selectTextToCountryField() {
        selectByVisibleTextFromDropDown(selectCountry,"United States");
    }
    public void selectTextToCityField(String text) {
        sendTextToElement(selectCity,text);
    }
    public void selectStateToStateField(){
        selectByVisibleTextFromDropDown(selectState,"Alabama");
    }
    public void sendTextToAddressLine1(String address) {
        sendTextToElement(address1, address);
    }
    public void enterTextToAddressLine2(String address) {
        sendTextToElement(address2, address);
    }
    public void enterTextToPostcode(String postcode) {
        sendTextToElement(postalCode, postcode);
    }
    public void enterTextToPhoneNumberField(String number) {
        sendTextToElement(phoneNumber, number);
    }
    public void clickOnContinueButton() {
        clickOnElement(clickOnContinue);
    }
    public void clickOnNextDayAirButton() {
        clickOnElement(nextDayAirButton);
    }
    public void clickOnContinueButtonAgain() {
        clickOnElement(clickOnContinue1);
    }
    public void clickOnCreditCardButton() {
        clickOnElement(creditCard);
    }
    public void clickOnContinue2() {
        clickOnElement(continueButton2);
    }
    public void clickOnCreditCardRadioButton(){
        clickOnElement(creditCardRadioButton);
    }
    public void clickOnContinueButton3(){
        clickOnElement(continueButton3);
    }
    public void selectMasterCardFromCreditCardDropdown(String text) {
        selectByVisibleTextFromDropDown(masterCard,text);
    }
    public void sendTextTOCardHolderName(String name) {
        sendTextToElement(cardHolderName, name);
    }
    public void sendTextTOCardNumber(String num) {
        sendTextToElement(cardNumber, num);
    }
    public void selectMonthAndYearForCreditCardExpireData() {
        selectByValueFromDropDown(By.id("ExpireMonth"), "5");
        selectByValueFromDropDown(By.id("ExpireYear"), "2024");
    }
    public void sendTextToCardCode(String code) {
        sendTextToElement(cardCode, code);
    }
    public void clickOnContinueButton4() {
        clickOnElement(continueButton4);
    }
    public String getPaymentMethodText() {
        return getTextFromElement(verifyPaymentMethod);
    }
    public String verifyShippingMethodText() {
        return getTextFromElement(getShippingMethodText);
    }
    public String verifyTotalPriceIs2950() {
        return getTextFromElement(totalIs2950);
    }
    public void clickOnConfirmButton() {
        clickOnElement(confirm);
    }
    public String verifyThankYouText() {
        return getTextFromElement(getThankYouText);
    }
    public String verifySuccessfullyProcessedText() {
        return getTextFromElement(getSuccessfullyProcessedText);
    }
    public void clickOnContinueButton5() {
        clickOnElement(continueButton5);
    }
    public String getWelcomeToOurStoreText() {
        return getTextFromElement(getWelcomeToOurStore);
    }

}
