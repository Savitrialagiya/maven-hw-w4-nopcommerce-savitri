package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopMenuPage extends Utility {
    By getComputer = By.xpath("//a[@href='/computers']");
    By getElectronics = By.xpath("//a[@href='/electronics']");
    By getApparel = By.xpath("//a[@href='/apparel']");


    public void selectMenu(String menu) {
        List<WebElement> menuList = driver.findElements(By.xpath("//div[@class = 'header-menu']/ul/li"));
        try {
            for (WebElement options : menuList) {
                if (options.getText().equals(menu)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            menuList = driver.findElements(By.xpath("//div[@class = 'header-menu']/ul/li"));
        }
    }


    public String verifyComputer() {
        return getTextFromElement(getComputer);
    }
    public String verifyElectronics() {
        return getTextFromElement(getElectronics);
    }
    public String verifyApparel() {
        return getTextFromElement(getApparel);
    }

}
