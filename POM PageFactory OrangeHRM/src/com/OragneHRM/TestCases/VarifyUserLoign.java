package com.OragneHRM.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.OrangeHRM.Pages.LoginPage;

import Helper.BrowserFactory;

public class VarifyUserLoign {

	@Test
	public void TestBrowser() throws Exception {
		WebDriver driver = BrowserFactory.StartBrowser("IE",
				"https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		LoginPage loginHRM = PageFactory.initElements(driver, LoginPage.class);
		loginHRM.LoginHRM("Admin", "admin123");

	}
}
