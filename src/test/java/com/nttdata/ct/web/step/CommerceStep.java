package com.nttdata.ct.web.step;

import com.nttdata.ct.web.page.StepPages;
import com.nttdata.ct.web.service.aspect.evidence.ScreenShot;
import com.nttdata.ct.web.service.aspect.evidence.ScreenShotAfter;
import com.nttdata.ct.web.service.util.UtilWeb;
import io.cucumber.datatable.DataTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommerceStep {

    @Autowired
    private StepPages page;

    @ScreenShotAfter
    public void ingresoDatosParaElRegistro(DataTable dataTable) {
        String nombre = UtilWeb.getValueFromDataTable(dataTable,"nombre");
        String email = UtilWeb.getValueFromDataTable(dataTable,"email");
        String password = UtilWeb.getValueFromDataTable(dataTable,"password");
        String chkIceCream = UtilWeb.getValueFromDataTable(dataTable,"chkIceCream");
        String genero = UtilWeb.getValueFromDataTable(dataTable,"genero");
        String estadoEmpleado = UtilWeb.getValueFromDataTable(dataTable,"estadoEmpleado");
        String cumpleanos = UtilWeb.getValueFromDataTable(dataTable,"cumpleanos");
        page.commercePage().ingresoDatosParaElRegistro(nombre,email,password,chkIceCream,genero,estadoEmpleado,cumpleanos);
    }

    @ScreenShotAfter
    public void envioLosDatosParaSuValidacionBtnSubmit() {
        page.commercePage().envioDatosParaValidacionBtnSubmit();
    }

    @ScreenShotAfter
    public boolean validoQueMuestraPopUpDeEnvioConMensajeCorrectamente(String mensaje) {
        return page.commercePage().validoQueMuestraPopUpDeEnvioConMensajeCorrecto(mensaje);
    }
}