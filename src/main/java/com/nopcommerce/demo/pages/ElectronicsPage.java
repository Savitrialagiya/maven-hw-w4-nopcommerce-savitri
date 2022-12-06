package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    By hoverOnElectronic = By.xpath("//a[text()='Electronics ']");
    By clickOnCellPhone = By.xpath("//ul[1]/li[2]/ul[1]/li[2]/a[1]");
    By getCellPhoneText = By.xpath("//h1[text()='Cell phones']");
    By listViewTab = By.xpath("//a[contains(text(),'List')]");
    By nokiaLumia1020 = By.xpath("//div[3]/div[1]/div[2]/h2[1]/a");
    By getNokiaLumiaText = By.xpath("//h1[text()='Nokia Lumia 1020']");
    By getPrice349 = By.id("price-value-20");
    By changeQuantity = By.name("addtocart_20.EnteredQuantity");
    By addToCartTab = By.id("add-to-cart-button-20");
    By getProductAddedInShoppingCart = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeButton = By.xpath("//span[@title='Close']");
    By hoverOnShoppingCart = By.xpath("//span[text()='Shopping cart']");
    By clickGoToCart = By.xpath("//button[text()='Go to cart']");
    By getShoppingCartText = By.xpath("//h1[text()='Shopping cart']");
    By checkQuantityIs2 = By.xpath("//span[contains(text(),'(2)')]");
    By checkTotal698 = By.xpath("//tbody/tr[1]/td[6]/span[1]");
    By checkbox = By.id("termsofservice");
    By checkout = By.id("checkout");
    By getWelcomeMessage = By.xpath("//h1[text()='Welcome, Please Sign In!']");
    By register = By.xpath("//button[text()='Register']");
    By checkRegisterText = By.xpath("//h1[text()='Register']");
    By gender = By.id("gender-male");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By day = By.name("DateOfBirthDay");
    By month = By.name("DateOfBirthMonth");
    By year = By.name("DateOfBirthYear");
    By email = By.id("Email");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By checkRegistrationText = By.xpath("//div[text()='Your registration completed']");
    By continueTab = By.xpath("//a[text()='Continue']");
    By checkShoppingCartText = By.xpath("//h1[text()='Shopping cart']");
    By country = By.id("BillingNewAddress_CountryId");
    By city = By.id("BillingNewAddress_City");
    By address = By.id("BillingNewAddress_Address1");
    By postCode = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By continueButton = By.xpath("//div/button[4]");
    By on2ndDayAir = By.id("shippingoption_2");
    By clickContinue = By.xpath("//form/div[2]/button[1]");
    By creditCardRadioButton = By.id("paymentmethod_1");
    By clickCon = By.xpath("//li[4]/div[2]/div[1]/button[1]");
    By visa = By.id("CreditCardType");
    By cardholderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By expireMonth = By.id("ExpireMonth");
    By expireYear = By.id("ExpireYear");
    By cardCode = By.id("CardCode");
    By clickConBtn = By.xpath("//li[5]/div[2]/div[1]/button[1]");
    By checkCreditCardText = By.xpath("//span[contains(text(),'Credit Card')]");
    By check2ndDayAirText = By.xpath("//div[2]/div[2]/ul[1]/li[1]/span[2]");
    By checkLastTotal = By.xpath("//tbody/tr[1]/td[6]/span[1]");
    By confirmButton = By.xpath("//button[contains(text(),'Confirm')]");
    By checkThankYouText = By.xpath("//h1[contains(text(),'Thank you')]");
    By successfullyMessage = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By clickOnContinue = By.xpath("//button[contains(text(),'Continue')]");
    By welcomeToOurStoreMessage = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By logoutLink = By.xpath("//a[contains(text(),'Log out')]");


    public void mouseHoverOnElectronicTab() {
        mouseHoverToElement(hoverOnElectronic);
    }

    public void clickOnCellPhones() {
        clickOnElement(clickOnCellPhone);
    }

    public String getCellPhoneText() {
        return getTextFromElement(getCellPhoneText);
    }

    public void clickOnListViewTab() {
        clickOnElement(listViewTab);
    }

    public void clickOnNokiaLumiaProduct() {
        clickOnElement(nokiaLumia1020);
    }

    public String verifyNokiaLumiaText() {
        return getTextFromElement(getNokiaLumiaText);
    }

    public String verifyPrice349() {
        return getTextFromElement(getPrice349);
    }

    public void changeTheQuantity() {
        driver.findElement(changeQuantity).clear();
        sendTextToElement(changeQuantity,"2");
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartTab);
    }

    public String verifyProductAddedInShoppingCartText() {
        return getTextFromElement(getProductAddedInShoppingCart);
    }

    public void clickOnCloseButton() {
        clickOnElement(closeButton);
    }

    public void hoverOnShoppingCartAndClickOnGoToCartButton() {
        mouseHoverToElement(hoverOnShoppingCart);
        clickOnElement(clickGoToCart);
    }

    public String verifyShoppingCartText() {
        return getTextFromElement(getShoppingCartText);
    }

    public String verifyTheQuantityIs2() {
        return getTextFromElement(checkQuantityIs2);
    }

    public String verifyTheTotal() {
        return getTextFromElement(checkTotal698);
    }

    public void clickOnCheckBox() {
        clickOnElement(checkbox);
    }

    public void clickOnCheckoutButton() {
        clickOnElement(checkout);
    }

    public String verifyWelcomeMessage() {
        return getTextFromElement(getWelcomeMessage);
    }

    public void clickOnRegisterTab() {
        clickOnElement(register);
    }

    public String verifyRegisterText() {
        return getTextFromElement(checkRegisterText);
    }

    public void mandatoryFields() {
        clickOnElement(gender);
        sendTextToElement(firstName, "Adam");
        sendTextToElement(lastName, "smith");
        selectByVisibleTextFromDropDown(day, "22");
        selectByVisibleTextFromDropDown(month, "June");
        selectByVisibleTextFromDropDown(year, "1985");
        sendTextToElement(email, "Adam123"+getAlphaNumericString(3)+"@gmail.com");
        sendTextToElement(password, "Adam123456");
        sendTextToElement(confirmPassword, "Adam123456");
    }

    public void clickOnRegistrationButton() {
        clickOnElement(registerButton);
    }

    public String verifyRegistrationText() {
        return getTextFromElement(checkRegistrationText);
    }

    public void clickOnContinueTab() {
        clickOnElement(continueTab);
    }

    public String checkShoppingCartText() {
        return getTextFromElement(checkShoppingCartText);
    }

    public void fillDeliveryAddressFields() {
        selectByVisibleTextFromDropDown(country, "United Kingdom");
        sendTextToElement(city, "London");
        sendTextToElement(address, "1, Charlie road");
        sendTextToElement(postCode, "HA5 7NN");
        sendTextToElement(phoneNumber, "1234567890");
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public void clickOn2ndDayAirButton() {
        clickOnElement(on2ndDayAir);
    }

    public void clickContinue() {
        clickOnElement(clickContinue);
    }

    public void selectCreditCardRadioButton() {
        clickOnElement(creditCardRadioButton);
    }

    public void clickCon(){
        clickOnElement(clickCon);
    }

    public void selectVisaFromDropDown() {
        selectByVisibleTextFromDropDown(visa, "Visa");
    }

    public void fillCardDetails() {
        sendTextToElement(cardholderName, "Adam Smith");
        sendTextToElement(cardNumber, "4222222222222");
        selectByVisibleTextFromDropDown(expireMonth, "05");
        selectByVisibleTextFromDropDown(expireYear, "2025");
        sendTextToElement(cardCode, "646");
    }

    public void clickConBtn() {
        clickOnElement(clickConBtn);
    }

    public String verifyCreditCardText() {
        return getTextFromElement(checkCreditCardText);
    }

    public String verify2ndDayAirText() {
        return getTextFromElement(check2ndDayAirText);
    }

    public String verifyFinalTotal() {
        return getTextFromElement(checkLastTotal);
    }

    public void clickOnConfirmButton() {
        clickOnElement(confirmButton);
    }

    public String verifyThankYouText() {
        return getTextFromElement(checkThankYouText);
    }

    public String verifySuccessfullyProcessedMessage() {
        return getTextFromElement(successfullyMessage);
    }

    public void clickOnContinue() {
        clickOnElement(clickOnContinue);
    }

    public String verifyWelcomeToOurStoreText() {
        return getTextFromElement(welcomeToOurStoreMessage);
    }

    public void clickOnLogoutLink() {
        clickOnElement(logoutLink);
    }
}


