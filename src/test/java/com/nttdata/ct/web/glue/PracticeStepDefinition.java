package com.nttdata.ct.web.glue;

import com.nttdata.ct.web.lib.WebDriverManager;
import com.nttdata.ct.web.step.PracticeStep;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class PracticeStepDefinition {

    @Autowired
    private WebDriverManager manager;
    @Autowired
    private PracticeStep practiceStep;


    @Y("me identifico con nombre: {string} y correo: {string}")
    public void meIdentificoConNombreyCorreo(String nombre, String correo) {
        practiceStep.ingresoDatosDeSesionNombreyCorreo(nombre,correo);
    }

    @Entonces("valido que accedo correctamente a la seccion practice {string}")
    public void valido_que_accedo_correctamente_a_la_seccion_de_practica(String titlePagina) {
        Assert.assertEquals("No se muestra la pagina practice {0}", titlePagina,
                practiceStep.validoQueAccedoCorrectamenteSeccionPractice());

    }

    @Dado("que me encuentro en la seccion {string}")
    public void queMeEncuentroEnLaSeccion(String opcion) {
        practiceStep.queMeEncuentroEnLaOpcionDePractice(opcion);
    }
}
