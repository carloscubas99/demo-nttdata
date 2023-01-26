package com.nttdata.ct.web.page;

import org.springframework.stereotype.Component;

@Component
public class StepPages {

    public GoogleSettinsPage settinsPage() {
        return new GoogleSettinsPage();
    }

    public PaginaPrincipalPage paginaPrincipalPage() {
        return new PaginaPrincipalPage();
    }

    public PracticePage practicePage() {
        return new PracticePage();
    }

    public GreenKartPage greenKartPage() {
        return new GreenKartPage();
    }

    public CommercePage commercePage() {
        return new CommercePage();
    }

}
