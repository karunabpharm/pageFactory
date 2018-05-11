package com.argos.demo.page_object;

import com.argos.demo.drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class SearchResultsPage extends DriverFactory {

    @FindBy(css = ".ac-star-rating")
    private List<WebElement> starRatings;

    @FindBy(css = ".icon--loading")
    private WebElement spinner;

    @FindBy(css = ".ac-product-name.ac-product-card__name")
    private List<WebElement> products;

    @FindBy(css = ".ac-facet__label")
    private List<WebElement> filters;

    public List<String> listOfAllProdcuts() {
        List<String> collectedProdcuts = new ArrayList<>();
        for (WebElement product : products) {
            collectedProdcuts.add(product.getText().toLowerCase());
        }
        return collectedProdcuts;
    }

    public void selectFilters(String filterValue){
        for (WebElement filter:filters){
           if( filter.getText().equalsIgnoreCase(filterValue)){
               filter.click();
               break;
           }
        }
        sleep(5000);
      //  new WebDriverWait(driver,10).until(ExpectedConditions.invisibilityOf(spinner));
    }


    public List<Double> getAllStarRatings(){
        List<Double> actulRatingList=new ArrayList<>();
        for (WebElement starRating:starRatings){
          actulRatingList.add(Double.parseDouble(starRating.getAttribute("data-star-rating")));
        }
        return actulRatingList;
    }




}
