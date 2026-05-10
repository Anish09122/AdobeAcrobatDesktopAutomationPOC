package com.utils;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class CommonFunctions {

    Robot rb;

    // =====================================
    // CONSTRUCTOR
    // =====================================

    public CommonFunctions() throws Exception {

        rb = new Robot();
    }

    // =====================================
    // CTRL + O
    // =====================================

    public void pressCtrlO() {

        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_O);

        rb.keyRelease(KeyEvent.VK_O);
        rb.keyRelease(KeyEvent.VK_CONTROL);
    }

    // =====================================
    // CTRL + F
    // =====================================

    public void pressCtrlF() {

        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_F);

        rb.keyRelease(KeyEvent.VK_F);
        rb.keyRelease(KeyEvent.VK_CONTROL);
    }

    // =====================================
    // PRESS ENTER
    // =====================================

    public void pressEnter() {

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
    }

    // =====================================
    // CLEAR TEXT FIELD
    // =====================================

    public void clearTextField() {

        // CTRL + A
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_A);

        rb.keyRelease(KeyEvent.VK_A);
        rb.keyRelease(KeyEvent.VK_CONTROL);

        sleep(500);

        // DELETE
        rb.keyPress(KeyEvent.VK_DELETE);
        rb.keyRelease(KeyEvent.VK_DELETE);

        sleep(500);
    }

    // =====================================
    // ZOOM IN
    // =====================================

    public void zoomIn() {

        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_EQUALS);

        rb.keyRelease(KeyEvent.VK_EQUALS);
        rb.keyRelease(KeyEvent.VK_CONTROL);

        sleep(1000);
    }

    // =====================================
    // ZOOM OUT
    // =====================================

    public void zoomOut() {

        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_MINUS);

        rb.keyRelease(KeyEvent.VK_MINUS);
        rb.keyRelease(KeyEvent.VK_CONTROL);

        sleep(1000);
    }

    // =====================================
    // PAGE DOWN
    // =====================================

    public void pageDown() {

        rb.keyPress(KeyEvent.VK_PAGE_DOWN);
        rb.keyRelease(KeyEvent.VK_PAGE_DOWN);

        sleep(1000);
    }

    // =====================================
    // PAGE UP
    // =====================================

    public void pageUp() {

        rb.keyPress(KeyEvent.VK_PAGE_UP);
        rb.keyRelease(KeyEvent.VK_PAGE_UP);

        sleep(1000);
    }

    // =====================================
    // CLOSE APPLICATION
    // =====================================

    public void closeApplication() {

        rb.keyPress(KeyEvent.VK_ALT);
        rb.keyPress(KeyEvent.VK_F4);

        rb.keyRelease(KeyEvent.VK_F4);
        rb.keyRelease(KeyEvent.VK_ALT);
    }

    // =====================================
    // COMMON SLEEP METHOD
    // =====================================

    public void sleep(int milliseconds) {

        try {

            Thread.sleep(milliseconds);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}