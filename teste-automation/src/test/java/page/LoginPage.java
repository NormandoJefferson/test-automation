package page;

import maps.LoginMaps;

public class LoginPage extends BasePage{

    LoginMaps loginMaps = new LoginMaps();

    public void login() {
        sendKeys(loginMaps.username, "standard_user");
        sendKeys(loginMaps.password, "secret_sauce");
        click(loginMaps.loginButton);
    }
}
