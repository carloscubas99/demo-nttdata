package com.nttdata.ct.web.page;

import com.nttdata.ct.web.base.WebBase;
import com.nttdata.ct.web.service.util.UtilWeb;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PaginaPrincipalPage extends WebBase {
    WebDriverWait webDriverWait = new WebDriverWait(driver(), Duration.ofSeconds(15));

    @FindBy(css = "div.preloader span")
    protected WebElement loader;
    @FindBy(xpath = "//div[@class='header-text hidden-xs']//h2/span")
    protected WebElement titlePrincipal;
    @FindBy(css = "nav.main-menu ul li a")
    protected List<WebElement> listCategoria;
    @FindBy(xpath = "//div/h2[.='Join now to Practice']")
    protected WebElement titleJoinNow;

    public boolean validarHome() {
        webDriverWait.until(ExpectedConditions.invisibilityOf(loader));
        waitUntilElementIsVisible(titlePrincipal, 10);
        return titlePrincipal.isDisplayed();
    }

    public void seleccionarCategoriaDelNavbar(String categoria) {
        webDriverWait.until(ExpectedConditions.invisibilityOf(loader));
       /*for (WebElement element: listCategoria){
           if (element.getText().equals(categoria)){
               actions().moveToElement(element).click().build().perform();
               break;
           }
       }*/
        clickElementInAList(listCategoria, categoria);
        UtilWeb.waitForSeconds(3);
        //waitUntilElementIsClickable(titleJoinNow,12);
    }

}
