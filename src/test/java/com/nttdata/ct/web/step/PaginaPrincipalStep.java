package com.nttdata.ct.web.step;

import com.nttdata.ct.web.page.StepPages;
import com.nttdata.ct.web.service.aspect.evidence.ScreenShot;
import com.nttdata.ct.web.service.aspect.evidence.ScreenShotAfter;
import com.nttdata.ct.web.service.aspect.evidence.ScreenShotBefore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class PaginaPrincipalStep {

    @Autowired
    private StepPages page;

    @ScreenShotAfter
    public boolean validarHome() {
        return page.paginaPrincipalPage().validarHome();
    }

    @ScreenShotAfter
    public void seleccionarCategoriaDelNavBar(String categoria) {
        page.paginaPrincipalPage().seleccionarCategoriaDelNavbar(categoria);
    }

}
