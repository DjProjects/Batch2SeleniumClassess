import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleProgram1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","D:\\Selenium\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		WebElement ele = driver.findElement(By.linkText("Home"));
		ele.click();
		
		driver.findElement(By.partialLinkText("Ho")).click();
		
		/* driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click(); 
		System.out.println(driver.getTitle()); */
		
		
	/*	String expectedTitle = "Welcome: Mercury";
		String actualTitle = driver.getTitle();
		System.out.println(driver.getTitle());
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Title is displaying correctly");
		}else {
			System.out.println("Title is displaying incorrectly");
		} */
		
		//driver.close();
		//driver.quit();
		
	}

}
