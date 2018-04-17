import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownStuff {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","D:\\Selenium\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		Select s = new Select(driver.findElement(By.name("country")));
		//s.selectByIndex(0);
		//s.selectByVisibleText("ANTARCTICA");
		s.selectByValue("3");
		List<WebElement> elements = s.getOptions();
		
		int a[] = {1,2,3};
		for(int x : a) {
			System.out.println(x);
		}
		for(WebElement element : elements) {
			System.out.println(element.getText());
		}

	}

}
