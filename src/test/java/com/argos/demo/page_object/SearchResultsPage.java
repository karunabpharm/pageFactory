package com.argos.demo.page_object;

import com.argos.demo.drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SearchResultsPage extends DriverFactory {

    @FindBy(css = ".ac-product-name.ac-product-card__name")
    private List<WebElement> products;

    public List<String> listOfAllProdcuts() {
        List<String> collectedProdcuts = new ArrayList<>();
        for (WebElement product : products) {
            collectedProdcuts.add(product.getText().toLowerCase());
        }
        return collectedProdcuts;
    }
}
