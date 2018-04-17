import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationStuff {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","D:\\Selenium\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
