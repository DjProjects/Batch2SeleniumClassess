import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenshotStuff {
	

    public static void main(String[] args) throws Exception {
    	
    	System.setProperty("webdriver.firefox.marionette","D:\\Selenium\\geckodriver.exe");
    	FirefoxDriver driver = new FirefoxDriver();
 	    driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

         File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

         //Move image file to new destination

         File DestFile=new File("D://test3.png");

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

        //Call take screenshot function

     //   takeSnapShot(driver, "D://test1.png") ;     

    }

    /**

     * This function will take screenshot

     * @param webdriver

     * @param fileWithPath

     * @throws Exception

     */

  /*  public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    } */

}