package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuPageTest extends BaseTest {
    TopMenuPage topMenuPage = new TopMenuPage();
    @Test
    public void verifyUserShouldNavigateToComputer() {
        topMenuPage.selectMenu("Computers");
        Assert.assertEquals(topMenuPage.verifyComputer(), "Computers", "Error Message not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToElectronics() {
        topMenuPage.selectMenu("Electronics");
        Assert.assertEquals(topMenuPage.verifyElectronics(), "Electronics", "Error Message not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToApparel() {
        topMenuPage.selectMenu("Apparel");
        Assert.assertEquals(topMenuPage.verifyApparel(), "Apparel", "Error Message not displayed");
    }
}
