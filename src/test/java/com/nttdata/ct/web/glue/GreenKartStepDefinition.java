package com.nttdata.ct.web.glue;

import com.nttdata.ct.web.lib.WebDriverManager;
import com.nttdata.ct.web.step.GreenKartStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class GreenKartStepDefinition {

    @Autowired
    private WebDriverManager manager;
    @Autowired
    private GreenKartStep greenKartStep;


    @Y("me dirijo al modulo {string} de GreenKart")
    public void seleccionolModuloDeGreenKart(String modulo) {
        //manager.navigateTo("https://rahulshettyacademy.com/seleniumPractise/#/");
        greenKartStep.seleccionoModuloDeGreenKart(modulo);
    }

    @Cuando("ordeno la lista por orden alfabetico")
    public void ordenoLaListaPorOrdenAlfabetico() {
        greenKartStep.ordernoListPorOrdenAlfabetico();
    }

    @Entonces("valido que los productos se muestran en orden alfabetico correctamente")
    public void validoQueLosProductosSeMuestranEnOrdenAlfabeticoCorrectamente() {
        Assert.assertTrue(greenKartStep.validoQueLosProductosSemuestranEnOrdenAlfabeticoAtoZCorrectamente());
    }
}
