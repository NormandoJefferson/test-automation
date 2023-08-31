package page;

import driver.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    WebDriver driver = Driver.getDriver();

    public void click(By by) {
        driver.findElement(by).click();
    }

    public void sendKeys(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public void clear(By by) {
        driver.findElement(by).clear();
    }

    public String getText(By by) {
        String text = driver.findElement(by).getText();
        return text;
    }

    public void validateEquals(String text, By by) {
        String elementText = getText(by);
        Assert.assertEquals( text, elementText);
    }

    public boolean exists(By by) {
        return driver.findElements(by).size() > 0;
    }

    public void validateObject(By by) {
        Assert.assertTrue(exists(by));
    }
}
