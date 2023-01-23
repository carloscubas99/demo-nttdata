package com.nttdata.ct.web.glue;

import com.nttdata.ct.web.lib.WebDriverManager;
import com.nttdata.ct.web.step.PaginaPrincipalStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class PaginaPrincipalStepDefinition {

    @Value("${url.rahulshetty}")
    private String urlRahulShetty;

    @Autowired
    private WebDriverManager manager;
    @Autowired
    private PaginaPrincipalStep paginaPrincipalStep;

    @Dado("que me encuentro en la pagina de rahulshetty")
    public void que_me_encuentro_en_la_pagina_de_rahulshetty() {
        manager.navigateTo(urlRahulShetty);
        Assert.assertTrue("No se muestra el titulo principal",
                paginaPrincipalStep.validarHome());
    }

    @Cuando("me dirigo a la categoria {string}")
    public void meDirigoALaCategoria(String categoria) {
        paginaPrincipalStep.seleccionarCategoriaDelNavBar(categoria);
    }


}
