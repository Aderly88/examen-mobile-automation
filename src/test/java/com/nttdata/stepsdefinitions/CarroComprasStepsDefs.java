package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CarritoComprasSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class CarroComprasStepsDefs {
    @Steps
    CarritoComprasSteps carritoComprasSteps;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoy_en_la_aplicación_de_sauce_labs() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("valido que carguen correctamente los productos en la galería")
    public void valido_que_carguen_correctamente_los_productos_en_la_galería() {
        carritoComprasSteps.products();

    }

    @When("agrego {string} unidad\\(s) del producto {string}")
    public void agrego_unidad_s_del_producto(String productos, String unidades) {
        carritoComprasSteps.productsSuccess();

    }

    @Then("valido que el carrito de compras se actualice correctamente con <UNIDADES> unidad\\(s)")
    public void valido_que_el_carrito_de_compras_se_actualice_correctamente_con_unidades_unidad_s() {


    }

}
