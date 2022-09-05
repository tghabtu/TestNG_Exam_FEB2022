package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCatagoryPage {


WebDriver driver;

public AddCatagoryPage(WebDriver driver) {
	this.driver = driver;
	}
	@FindBy(how=How.XPATH, using = "//input[@name='categorydata']")WebElement ADD_INPUT_ELEMENT;
	@FindBy(how=How.XPATH, using = "//input[@value='Add category']")WebElement ADD_CATAGORY_BUTTON_ELEMENT;

	public void addInputElement(String anthing) throws InterruptedException {
		ADD_INPUT_ELEMENT.sendKeys(anthing);
		Thread.sleep(3000);
	}
	public void clickButtonElement() {
		ADD_CATAGORY_BUTTON_ELEMENT.click();
	
		
	}
	
}

