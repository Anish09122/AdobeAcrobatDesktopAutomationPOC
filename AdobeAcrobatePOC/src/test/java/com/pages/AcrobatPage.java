package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonFunctions;

import io.appium.java_client.windows.WindowsDriver;

public class AcrobatPage {

    WindowsDriver driver;

    CommonFunctions common;

    // =====================================
    // CONSTRUCTOR
    // =====================================

    public AcrobatPage(WindowsDriver driver)
            throws Exception {

        this.driver = driver;

        common = new CommonFunctions();
    }

    // =====================================
    // OPEN PDF
    // =====================================

    public void openPDF(String filePath)
            throws Exception {


        // CTRL + O
        common.pressCtrlO();

        Thread.sleep(3000);
       System.out.print(filePath);       
       driver.findElement(By.name("File name:")).sendKeys(filePath);
        Thread.sleep(1000);

        // Press ENTER
        common.pressEnter();

        Thread.sleep(5000);

        System.out.println("PDF opened successfully");
    }

    // =====================================
    // ZOOM IN
    // =====================================

    public boolean zoomIn()
            throws Exception {

        common.zoomIn();

        Thread.sleep(2000);
        return true;
    }

    // =====================================
    // ZOOM OUT
    // =====================================

    public boolean zoomOut()
            throws Exception {

        common.zoomOut();

        Thread.sleep(2000);
        return true;
    }

    // =====================================
    // SCROLL DOWN
    // =====================================

    public boolean scrollDown()
            throws Exception {

        common.pageDown();

        Thread.sleep(1500);
        return true;
    }

    // =====================================
    // SCROLL UP
    // =====================================

    public boolean scrollUp()
            throws Exception {

        common.pageUp();

        Thread.sleep(1500);
        return true;
    }

    // =====================================
    // SEARCH TEXT
    // =====================================

    public boolean searchText(String text)
            throws Exception {

        common.pressCtrlF();

        Thread.sleep(2000);

        driver.findElement(By.name("Find text or tools")).sendKeys(text);

        Thread.sleep(1000);

        common.pressEnter();
        Thread.sleep(3000);
        return true;
    }

    // =====================================
    // CLOSE APPLICATION
    // =====================================

    public boolean closeApplication()
            throws Exception {

        common.closeApplication();
        return true;
    }
}