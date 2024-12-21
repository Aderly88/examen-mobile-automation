package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CarroScreen {

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement lblMyCart;

    public boolean isProductDisplayed() {

        //waitFor(ExpectedConditions.visibilityOf(lblProduct));
        return lblMyCart.isEnabled();
    }

}
