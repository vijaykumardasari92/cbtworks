package com.cbtworks.genriclib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class WebDriverCommonLib {

	public String getPageTitle() {
		return BaseTest.driver.getTitle();
	}

	public void verify(String actualResult, String expectedResult, String page) {
		Assert.assertEquals(actualResult, expectedResult);
		Reporter.log(page + " is Displayed, PASS", true);

	}

	public void selectOption(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	public void selectOption(String value, WebElement element) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	public void selectOption(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

}
