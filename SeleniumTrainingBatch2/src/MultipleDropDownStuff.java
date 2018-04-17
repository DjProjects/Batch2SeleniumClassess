import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDownStuff {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette","D:\\Selenium\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		
		ArrayList l1 = new ArrayList();
		ArrayList l2 = new ArrayList();
		l1.add("Banana");
		l1.add("Apple");
		l1.add("Orange");
		//l1.add("Grape");
		Select s = new Select(driver.findElement(By.id("fruits")));
		
	
		List<WebElement> options = s.getOptions();
		for(WebElement ele : options) {
			l2.add(ele.getText());
		}
		
		if(l1.equals(l2)) {
			System.out.println("Values displayed are correct");
		}else {
			System.out.println("Values displayed are not correct");
		}
		//s.selectByVisibleText("Banana");
	   // s.selectByVisibleText("Apple");
		System.out.println(s.isMultiple());
		
		/*s.deselectByIndex(0);
		//s.deselectByVisibleText("Apple");
		s.deselectByValue("apple"); */
		
		

	}

}
