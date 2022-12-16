package selenium_java_test;

import org.openqa.selenium.By;      
import org.openqa.selenium.WebDriver;              
import org.openqa.selenium.chrome.ChromeDriver;
 
public class TestOne {
 
    public static void main(String[] args)  throws InterruptedException {
       
        System.setProperty("webdriver.chrome.driver", "F:/Selenium/chromedriver.exe");
       
        WebDriver driver= new ChromeDriver();          
 
        //Maximize window      
        driver.manage().window().maximize();    
       
        //Launch the Site.      
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
       
        //Enter values into form and submit      
        driver.findElement(By.id("sum1")).sendKeys("2");                    
        driver.findElement(By.id("sum2")).sendKeys("25");    
        driver.findElement(By.xpath("//*[@id='gettotal']/button")).click();  
       
        //Verify the result
        String result = driver.findElement(By.xpath("//*[@id=\'addmessage\']")).getText();
        
        System.out.println(result);
        if( Integer.parseInt(result) == 7) {
             System.out.println("Test Success");             

        } else {
             System.out.println("Test Failed");
        }
        //Close the browser
        Thread.sleep(4000);
        driver.quit();              
    }
}