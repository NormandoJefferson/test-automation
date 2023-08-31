package runners;

import org.junit.Before;
import org.junit.Test;
import page.HomePage;
import page.LoginPage;
import page.ProductPage;

public class SelectProduct  extends BaseTest{

    LoginPage loginPage;
    HomePage homePage;
    ProductPage productPage;

    @Before
    public void setUp() {
        loginPage = new LoginPage();
        homePage = new HomePage();
        productPage = new ProductPage();
    }

    @Test
    public void selectFirstProdutct() {
        loginPage.login();
        homePage.validateLogin();
        homePage.selectFirstProduct();
        productPage.validateSelectedProduct();
    }
}
