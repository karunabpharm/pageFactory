package com.argos.demo;

import com.argos.demo.drivers.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    DriverFactory driverFactory=new DriverFactory();

    @Before
    public void setUp(){
        driverFactory.openBrowser();
        driverFactory.applyImplicitWait();
        driverFactory.navigateTo("http://www.argos.co.uk/");
    }

    @After
    public void tearDown(){
        driverFactory.closeBrowser();
    }
}
