package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCatagoryPage;
import util.BrowseFactory;

public class FirstTestPage {
	WebDriver driver;
	@Test
	public void validUserShouldBelandonPage() throws InterruptedException {
		driver=BrowseFactory.init();
				AddCatagoryPage addCatagoryPage = PageFactory.initElements(driver, AddCatagoryPage.class);
				addCatagoryPage.addInputElement("abza A");
				addCatagoryPage.clickButtonElement();
				
				
				
				
	}
	}
	


