import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandlingStuff {

	public static void main(String[] args) {
		  
	   System.setProperty("webdriver.firefox.marionette","D:\\Selenium\\geckodriver.exe");
	   
       FirefoxDriver driver = new FirefoxDriver();
        
        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        driver.manage().window().maximize();
        
        String firstwindowname = driver.getWindowHandle();
        
        System.out.println(firstwindowname);
        
        driver.findElement(By.id("button1")).click();
        
        Set<String> windows = driver.getWindowHandles();
        
       List l1 = new ArrayList();
       // Set s1 = new Set();
        for(String s : windows)
        {
        	System.out.println(s);
        	l1.add(s);
        	
        }
        
        String s1 = l1.get(1).toString();
        driver.switchTo().window(s1);
        
        driver.manage().window().maximize();
        driver.findElement(By.linkText("HOME")).click();
        
        
       /* System.out.println("First window..:" + l1.get(0));
        System.out.println("First window..:" + l1.get(1));
        //driver.switchTo().window("cf43a5b1-ed0a-49eb-96e3-6cf6cfe59d92");
        String s1 = l1.get(1).toString();
        driver.switchTo().window(s1);
        driver.manage().window().maximize(); */
        System.out.println("Second Window title is:" + driver.getTitle());
       // driver.close();
        driver.switchTo().window(l1.get(0).toString());
        System.out.println("First window title is:" + driver.getTitle()); 
        
        
        
       // String title = driver.getTitle();
        
       // System.out.println(title);
        
       
	}

}
