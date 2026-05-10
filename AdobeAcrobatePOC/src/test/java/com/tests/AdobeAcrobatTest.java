package com.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.AcrobatPage;

public class AdobeAcrobatTest extends BaseTest {

    AcrobatPage acrobat;

    String pdfPath =" ";// Enter PDF path here

    @BeforeClass
    public void initPage() throws Exception {

        acrobat = new AcrobatPage(driver);

        acrobat.openPDF(pdfPath);
    }

    // TEST CASE 1
    @Test(priority = 1)
    public void verifyZoomIn()
            throws Exception {
        Assert.assertTrue(acrobat.zoomIn());

        System.out.println("Zoom In successful");
    }

    // =====================================
    // TEST CASE 2
    // VERIFY SCROLL DOWN
    // =====================================

    @Test(priority = 2)
    public void verifyScrollDown()
            throws Exception {
        Assert.assertTrue( acrobat.scrollDown());

        System.out.println("Scroll successful");
    }

    // TEST CASE 3

    @Test(priority = 3)
    public void verifySearchText() throws Exception {

        acrobat.searchText("invoice");
        boolean searchDisplayed =driver.findElement(By.name("Find")).isDisplayed();

        Assert.assertTrue(
                searchDisplayed,
                "Search box not displayed"
        );

        System.out.println("Search successful");
    }
}