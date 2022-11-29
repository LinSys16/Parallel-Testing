import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PruebaF {
	
	
	ThreadLocal<ChromeDriver> driver = new ThreadLocal<ChromeDriver>();
	
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/Lindsay/OneDrive/Escritorio/Demo2/chromedriver.exe/");
        driver.set(new ChromeDriver());
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    
    public WebDriver getDriver(){
        
        return driver.get();       
    }
    
    @Test
    public void testGooglePage1() {
        
        getDriver().get("https://www.disneyplus.com");
        getDriver().findElement(By.cssSelector("body > header > nav.nav.pre-sticky > ul > li > a")).click();
        getDriver().findElement(By.name("email")).sendKeys("dayanalbr85@gmail.com");
        getDriver().findElement(By.name("dssLoginSubmit")).click();
        getDriver().findElement(By.id("password")).sendKeys("Lunalin09#");
        getDriver().findElement(By.name("dssLoginSubmit")).click();  
        
        
        
        
        
    }
     
    @Test
    public void testGooglePage2() {
        
        getDriver().get("https://www.disneyplus.com");
        getDriver().findElement(By.cssSelector("body > header > nav.nav.pre-sticky > ul > li > a")).click();
        getDriver().findElement(By.name("email")).sendKeys("dayanalbr85@gmail.com");
        getDriver().findElement(By.name("dssLoginSubmit")).click();
        getDriver().findElement(By.id("password")).sendKeys("Lunalin09#");
        getDriver().findElement(By.name("dssLoginSubmit")).click();
        
    
    }
    
    @Test
    public void testGooglePage3() {
        
        getDriver().get("https://www.disneyplus.com");
        getDriver().findElement(By.cssSelector("body > header > nav.nav.pre-sticky > ul > li > a")).click();
        getDriver().findElement(By.name("email")).sendKeys("dayanalbr85@gmail.com");
        getDriver().findElement(By.name("dssLoginSubmit")).click();
        getDriver().findElement(By.id("password")).sendKeys("Lunalin09#");
        getDriver().findElement(By.name("dssLoginSubmit")).click();
        
    
    }
    @After
    public void tearDown() {
        //getDriver().quit();
    }
    
}
	
	
	
	
	
	

	