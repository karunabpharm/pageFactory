package com.argos.demo.page_object;

import com.argos.demo.drivers.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends DriverFactory {

    @FindBy(css="#searchTerm")
    private WebElement searchTxtBox;

    @FindBy(css = ".argos-header__search-button")
    private WebElement searchBtn;

    public void doSearch(String term){
        searchTxtBox.sendKeys(term);
        searchBtn.click();
    }
}
