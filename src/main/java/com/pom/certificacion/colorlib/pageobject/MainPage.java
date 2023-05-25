package com.pom.certificacion.colorlib.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject{

    @FindBy(xpath = "//*[@id=\"menu\"]/li[6]/a/span[2]")
    public WebElementFacade arrowMenu;

    @FindBy(xpath = "//*[@id=\"menu\"]/li[6]/ul/li[2]")
    public WebElementFacade option;

}
