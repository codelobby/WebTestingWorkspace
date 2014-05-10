package Google;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {


    WebDriver driver;

    @Before
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("https://www.google.com.au/");
    }

    @Test
    public void shouldLogin() {
        WebElement webElement = driver.findElement(By.name("q"));
        webElement.sendKeys("MrWho");
        webElement.click();
    }

    @After
    public void destroy() {
        driver.quit();
    }
}
