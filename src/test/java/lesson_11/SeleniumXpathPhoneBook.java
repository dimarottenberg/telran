package lesson_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumXpathPhoneBook {
    WebDriver driver;

    @BeforeClass
    public void precondition() {
        driver = new ChromeDriver();
        driver.navigate().to("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @AfterClass
    public void teardown() {
        driver.close();
        driver.quit();

    }

    @Test
    public void test1Xpath() {
        WebElement test1findXpath = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/h1"));
        //System.out.println (test1.getText());
        Assert.assertEquals(test1findXpath.getText(), "Home Component");
    }

    @Test
    public void test2tagname() {
        WebElement test2findtagname = driver.findElement(By.tagName("h2"));
        Assert.assertEquals(test2findtagname.getText(), "React Contacts App");
    }

    @Test
    public void testcssselector() {
        WebElement test3cssselector = driver.findElement(By.cssSelector("h3"));
        Assert.assertEquals(test3cssselector.getText(), "For QA Testing");

    }

    @Test
    public void testclickabout() {
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/a[2]"));
        submitButton.click();
        System.out.println(submitButton.getText());
    }
}


