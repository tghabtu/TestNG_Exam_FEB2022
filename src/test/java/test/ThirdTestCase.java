package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.AddCatagoryPage;
import util.BrowseFactory;

public class ThirdTestCase {
	WebDriver driver;
	@Test
	public void validUserShouldBelandonPage() {
		driver=BrowseFactory.init();
				AddCatagoryPage addCatagoryPage = PageFactory.initElements(driver, AddCatagoryPage.class);
				addCatagoryPage.clickButtonElement();
				WebElement  monthList=driver.findElement(By.name("due_month"));
				Select sel =new Select(monthList);
				List<WebElement>allMonth=sel.getOptions();
				for(WebElement monthName :allMonth) {
					System.out.println(monthName.getText());
					
				}
				
				
	}		
	
	
}

