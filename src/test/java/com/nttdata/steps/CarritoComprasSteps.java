package com.nttdata.steps;

import com.nttdata.screens.CarroScreen;
import com.nttdata.screens.ProductsDetailScreen;
import com.nttdata.screens.ProductsScreen;
import org.junit.Assert;

public class CarritoComprasSteps {
    ProductsScreen productsScreen;
    ProductsDetailScreen productsDetailScreen;
    CarroScreen carroScreen;

    public void products() {
        productsScreen.isProductDisplayed();
        productsScreen.clickProductBackpack();
        productsScreen.clickProductTShirt();
        productsScreen.clickProductBikeLight();
        productsDetailScreen.clickProduct();
        carroScreen.isProductDisplayed();

    }

    public void productsSuccess() {
        Assert.assertTrue("Nose se mostro el titulo producto", productsScreen.isProductDisplayed());
    }
}
