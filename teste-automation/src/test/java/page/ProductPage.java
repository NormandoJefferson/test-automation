package page;

import maps.ProductMaps;

public class ProductPage extends BasePage{

    ProductMaps productMaps = new ProductMaps();

    public void validateSelectedProduct() {
        validateObject(productMaps.backToProductsButton);
        validateObject(productMaps.intentoryDetailsContainer);
    }
}
