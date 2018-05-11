package com.argos.demo.page_object;

import com.argos.demo.drivers.DriverFactory;

public class HomePage extends DriverFactory {

    public String isOnHomePage(){
      return driver.getCurrentUrl();
    }
}
