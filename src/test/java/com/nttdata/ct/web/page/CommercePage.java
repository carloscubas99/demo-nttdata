package com.nttdata.ct.web.page;

import com.nttdata.ct.web.base.WebBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CommercePage extends WebBase {

        @FindBy(name = "name")
    protected WebElement inputName;
    @FindBy(name = "email")
    protected WebElement inputEmail;
    @FindBy(id = "exampleInputPassword1")
    protected WebElement inputPassword;
    @FindBy(id = "exampleCheck1")
    protected WebElement chkIceCreams;
    @FindBy(id = "exampleFormControlSelect1")
    protected WebElement btnGender;
    @FindBy(css = "#exampleFormControlSelect1 option")
    protected List<WebElement> listGender;
    @FindBy(css = "div.form-check-inline label")
    protected List<WebElement> rdbEmployementStatus;
    @FindBy(name = "bday")
    protected WebElement inpuDateBirth;
    @FindBy(className = "btn-success")
    protected WebElement btnSubmit;
    @FindBy(css = "div.alert-success strong")
    protected WebElement popUpMassageSuccess;


    public void ingresoDatosParaElRegistro(String nombre, String email, String password, String chkIceCream, String genero, String estadoEmpleado, String cumpleanos) {
        waitUntilElementIsVisible(inputName, 10);
        type(inputName, nombre);
        type(inputEmail, email);
        type(inputPassword, password);
        if (chkIceCream.equals("true")) {
            click(chkIceCreams);
        } else if (chkIceCreams.getText().equals("false")) {
            Logger.getGlobal().log(Level.INFO, "No se seleccionará la opcion iceCreams");
        }
        click(btnGender);
        clickElementInAList(listGender, genero);
        clickElementInAList(rdbEmployementStatus, estadoEmpleado);
        type(inpuDateBirth, cumpleanos);
    }

    public void envioDatosParaValidacionBtnSubmit() {
        click(btnSubmit);
    }

    public boolean validoQueMuestraPopUpDeEnvioConMensajeCorrecto(String mensaje) {
        js().scrollElementTop(popUpMassageSuccess);
        return popUpMassageSuccess.getText().equals(mensaje);
    }
}