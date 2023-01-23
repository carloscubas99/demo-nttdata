package com.nttdata.ct.web.step;

import com.nttdata.ct.web.page.StepPages;
import com.nttdata.ct.web.service.aspect.evidence.ScreenShotAfter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PracticeStep {

    @Autowired
    private StepPages page;

    @ScreenShotAfter
    public void ingresoDatosDeSesionNombreyCorreo(String nombre, String correo) {
        page.practicePage().ingresoDatosDeSesionNombreyCorreo(nombre,correo);
    }

    @ScreenShotAfter
    public String validoQueAccedoCorrectamenteSeccionPractice() {
        return page.practicePage().validoQueAccedoCorrectamenteALaSeccionPractice();
    }

    @ScreenShotAfter
    public void queMeEncuentroEnLaOpcionDePractice(String opcion) {
        page.practicePage().queMeEncuentroEnLaOpcionDePractice(opcion);
    }
}
