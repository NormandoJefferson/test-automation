package runners;

import driver.Driver;
import org.junit.After;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    WebDriver driver = Driver.getDriver();

    @After
    public void close() {
        driver.quit();
    }
}
