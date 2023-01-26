package com.nttdata.ct.web.glue;

import com.nttdata.ct.web.lib.WebDriverManager;
import com.nttdata.ct.web.step.CommerceStep;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class CommerceStepDefinition {

    @Autowired
    private WebDriverManager manager;
    @Autowired
    private CommerceStep commerceStep;


    @Cuando("ingreso los datos para el registro")
    public void ingresoLosDatosParaElRegistro(DataTable dataTable) {
        commerceStep.ingresoDatosParaElRegistro(dataTable);
    }

    @Y("envio los datos para su validacion")
    public void envioLosDatosParaSuValidacion() {
        commerceStep.envioLosDatosParaSuValidacionBtnSubmit();
    }

    @Entonces("valido que me muestra popup de envio con mensaje {string}")
    public void validoQueMeMuestraPopupDeEnvioCorrecto(String mensaje) {
        Assert.assertTrue("No se muestra el mensaje esperado",
                commerceStep.validoQueMuestraPopUpDeEnvioConMensajeCorrectamente(mensaje));
    }
}
