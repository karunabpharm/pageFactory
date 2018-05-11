package com.argos.demo.drivers;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private String browser = "";
    public static WebDriver driver;

    public DriverFactory(){
        PageFactory.initElements(driver,this);
    }

    public void openBrowser() {
        switch (browser) {
            case "chrome":
                ChromeDriverManager.getInstance().setup();
                driver = new ChromeDriver();
                break;
            case "ie":
                InternetExplorerDriverManager.getInstance().setup();
                driver = new InternetExplorerDriver();
                break;
            case "opera":
                OperaDriverManager.getInstance().setup();
                driver = new OperaDriver();
                break;
            default:
                FirefoxDriverManager.getInstance().setup();
                driver = new FirefoxDriver();
                break;
        }
    }

    public void closeBrowser() {
        driver.quit();
    }

    public void applyImplicitWait(){
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

    public void navigateTo(String to){
        driver.get(to);
    }


    public void sleep(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
