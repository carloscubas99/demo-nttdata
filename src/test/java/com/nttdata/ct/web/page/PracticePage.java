package com.nttdata.ct.web.page;

import com.nttdata.ct.web.base.WebBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class PracticePage extends WebBase {
    WebDriverWait webDriverWait = new WebDriverWait(driver(), Duration.ofSeconds(16));

    @FindBy(css = "div.preloader span")
    protected WebElement loader;
    @FindBy(id = "name")
    protected WebElement inputName;
    @FindBy(id = "email")
    protected WebElement inputEmail;
    @FindBy(css = "section#project-container h5")
    protected WebElement titleOurProjectPractice;
    @FindBy(id = "form-submit")
    protected WebElement btnSubmit;

    public void ingresoDatosDeSesionNombreyCorreo(String nombre, String correo) {
        waitUntilElementIsVisible(inputName, 10);
        type(inputName, nombre);
        type(inputEmail, correo);
        click(btnSubmit);
    }

    public String validoQueAccedoCorrectamenteALaSeccionPractice() {
        waitUntilElementIsVisible(titleOurProjectPractice,20);
        return titleOurProjectPractice.getText();
    }

    public void queMeEncuentroEnLaOpcionDePractice(String opcion) {
        WebElement elementLinkOpcion = find().getElementBy(By.linkText(opcion));
        elementLinkOpcion.click();
    }
}
