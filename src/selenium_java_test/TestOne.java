package selenium_java_test;

import org.openqa.selenium.By;      
import org.openqa.selenium.WebDriver;              
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class TestOne {
 
    public static void main(String[] args)  throws InterruptedException {
       
        System.setProperty("webdriver.chrome.driver", "F:/Selenium/chromedriver.exe");
       
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();         
 
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
       
        driver.findElement(By.id("sum1")).sendKeys("5");                    
        driver.findElement(By.id("sum2")).sendKeys("5");    
        driver.findElement(By.xpath("//*[@id='gettotal']/button")).click();  
       
        String result = driver.findElement(By.xpath("//*[@id=\'addmessage\']")).getText();
        
        System.out.println(result);
        if( Integer.parseInt(result) == 10) {
             System.out.println("Test Success");             

        } else {
             System.out.println("Test Failed");
        }
        
        driver.quit();              
    }
}