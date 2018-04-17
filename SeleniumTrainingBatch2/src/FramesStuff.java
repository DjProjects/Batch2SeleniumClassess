import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesStuff {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","D:\\Selenium\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        
        driver.get("http://demo.guru99.com/selenium/deprecated.html");
        
    /*   // By Index :
        driver.switchTo().frame(2);
        driver.findElement(By.linkText("Deprecated")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        
       // By Name
        driver.switchTo().frame("packageFrame");
        driver.findElement(By.linkText("Actions")).click();
        driver.switchTo().frame(2);
        
        driver.switchTo().defaultContent();
        
        
       // WebElement 
        WebElement ele =  driver.findElement(By.name("packageFrame"));
        driver.switchTo().frame(ele);
        WebElement ele1 = driver.findElement(By.linkText("Actions"));
        ele1.click();
        
       // =======
        		
        		// InnerFrames :
                driver.switchTo().frame("outerframe");
                driver.switchTo().frame("innerFrame");
                driver.findElement(By.linkText("abc")).click();
                driver.switchTo().parentFrame();
                //driver.switchTo().defaultContent(); */
                
       // Find the no of frames in a webpage and printing it
        
        System.out.println(driver.findElements(By.tagName("frame")).size());
                
        List<WebElement> frames = driver.findElements(By.tagName("frame"));
        for(WebElement frame: frames)
        	System.out.println(frame.getAttribute("title"));

	}

}
