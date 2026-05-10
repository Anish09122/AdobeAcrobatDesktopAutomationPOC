package com.base;

import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.windows.WindowsDriver;

public class BaseTest {

	public static WindowsDriver driver;

	@BeforeClass
	public void setup() {

		try {

			DesiredCapabilities cap =
					new DesiredCapabilities();

			cap.setCapability(
					"app",
					"Root"
					);

			driver = new WindowsDriver(
					new URL("http://127.0.0.1:4723"),
					cap
					);

			driver.manage()
			.timeouts()
			.implicitlyWait(5, TimeUnit.SECONDS);

			System.out.println("Acrobat launched");

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@AfterClass
	public void tearDown() {

		if(driver != null) {

			driver.quit();
		}

		System.out.println("Session closed");
	}
}
