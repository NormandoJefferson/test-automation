package page;

import maps.HomeMaps;

public class HomePage extends BasePage{

    HomeMaps homeMaps = new HomeMaps();

    public void validateLogin() {
       validateEquals("Swag Labs", homeMaps.homeTitle);
    }

    public void selectFirstProduct() {
        click(homeMaps.firstProductLink);
    }
}
