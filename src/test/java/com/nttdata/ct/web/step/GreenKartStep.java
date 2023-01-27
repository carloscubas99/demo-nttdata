package com.nttdata.ct.web.step;

import com.nttdata.ct.web.page.StepPages;
import com.nttdata.ct.web.service.aspect.evidence.ScreenShotAfter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreenKartStep {

    @Autowired
    private StepPages page;

    @ScreenShotAfter
    public void seleccionoModuloDeGreenKart(String modulo) {
        page.greenKartPage().seleccionoModuloEnGreenKart(modulo);
    }

    @ScreenShotAfter
    public void ordernoListPorOrdenAlfabetico() {
        page.greenKartPage().ordernoListaPorOrdenAlfabetico();
    }
    @ScreenShotAfter
    public boolean validoQueLosProductosSemuestranEnOrdenAlfabeticoAtoZCorrectamente() {
        return page.greenKartPage().validarQueProductosSeMuestranEnOrdenAlfabetico();
    }
}
