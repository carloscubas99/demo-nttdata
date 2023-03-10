package com.nttdata.ct.web.page;

import com.nttdata.ct.web.base.WebBase;
import com.nttdata.ct.web.service.util.UtilWeb;
import jdk.dynalink.linker.LinkerServices;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class GreenKartPage extends WebBase {
    WebDriverWait webDriverWait = new WebDriverWait(driver(), Duration.ofSeconds(16));

    @FindBy(css = "div.preloader span")
    protected WebElement example;
    @FindBy(css = "div.greenLogo")
    protected WebElement logoGreenKart;
    @FindBy(xpath = "//span[.='Veg/fruit name']/following-sibling::span")
    protected WebElement sortFruitName;
    @FindBy(css = "tbody tr td:nth-child(1)")
    protected List<WebElement> listProductos;

    public void seleccionoModuloEnGreenKart(String modulo) {
        String pathModulo = "//a[@class='cart-header-navlink'][.='%s']";
        var wait = webDriverWait(Duration.ofSeconds(12));
        String moduloElec = String.format(pathModulo, modulo);
        wait.until(ExpectedConditions.visibilityOf(driver().findElement(By.xpath(moduloElec))));
        click(find().getElementBy(By.xpath(moduloElec)));
        UtilWeb.waitForSeconds(1);
    }

    public void switchToOpenTab() {
        var windows = driver().getWindowHandles();
        for (String window : windows) {
            System.out.println("Switching to window: " + window);
           driver().switchTo().window(window);
        }
    }

    public void ordernoListaPorOrdenAlfabetico() {
        switchToOpenTab();
        waitUntilElementIsVisible(sortFruitName, 10);
        click(sortFruitName);
    }

    public boolean validarQueProductosSeMuestranEnOrdenAlfabetico() {
        List<String> originalList = listProductos
                .stream()
                .map(x-> x.getText())
                .collect(Collectors.toList());
        List<String> sortedList = originalList
                .stream()
                .sorted()
                .collect(Collectors.toList());
        return originalList.equals(sortedList);
    }
}
