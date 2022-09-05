package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.AddCatagoryPage;
import util.BrowseFactory;

public class SecondTestPage {
	WebDriver driver;
	@Test
	public void validUserShouldBelandonPage() throws InterruptedException {
		driver=BrowseFactory.init();
				AddCatagoryPage addCatagoryPage = PageFactory.initElements(driver, AddCatagoryPage.class);
				addCatagoryPage.addInputElement("abza A");
				addCatagoryPage.clickButtonElement();
				String bodyText=driver.findElement(By.tagName("body")).getText();
				String[] arr=bodyText.split(":");
				String  expected=arr[0].trim();
				Assert.assertEquals(expected, "The category you want to add already exists", expected);
				
	}
	}
	


