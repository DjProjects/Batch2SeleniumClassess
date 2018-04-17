import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsStuff {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","D:\\Selenium\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://jsbin.com/usidix/1");
		driver.findElement(By.xpath("html/body/input")).click();
		
		Alert ele = driver.switchTo().alert();
		String s = ele.getText();
		System.out.println(s);
		ele.sendKeys("Dhanu");
		//ele.accept();
		ele.dismiss();
		//driver.switchTo().alert().dismiss();
		
		//System.out.println(s);
		
		
		

	}

}
