package Demo.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Reusable {
	

	

	public void seleniumClick(WebDriver driver, WebElement element)
	{
		
		element.click();

		
	}
	
	public void seleniumsendkeys(WebDriver driver, WebElement element, String text)
	{
		element.sendKeys(text);
	}

	public void selenuimSelect(WebDriver driver, WebElement element,String text)
	{
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
}
