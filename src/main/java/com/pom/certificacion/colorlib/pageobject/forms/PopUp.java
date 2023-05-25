package com.pom.certificacion.colorlib.pageobject.forms;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class PopUp extends PageObject{

    @FindBy(xpath = "//*[@id=\"top\"]/header/div[2]/h3")
    public WebElementFacade title;
    @FindBy(xpath = "//*[@id=\"req\"]")
    public WebElementFacade required;

    @FindBy(xpath = "//*[@id=\"sport\"]")
    public WebElementFacade select;

    @FindBy(xpath = "//*[@id=\"sport\"]/option[2]")
    public WebElementFacade tennis;

    @FindBy(xpath = "//*[@id=\"sport\"]/option[3]")
    public WebElementFacade football;

    @FindBy(xpath = "//*[@id=\"sport\"]/option[4]")
    public WebElementFacade golf;

    @FindBy(xpath = "//*[@id=\"sport2\"]")
    public WebElementFacade select2;

    @FindBy(xpath = "//*[@id=\"sport2\"]/option[2]")
    public WebElementFacade tennis2;

    @FindBy(xpath = "//*[@id=\"sport2\"]/option[3]")
    public WebElementFacade football2;

    @FindBy(xpath = "//*[@id=\"sport2\"]/option[4]")
    public WebElementFacade golf2;

    @FindBy(xpath = "//*[@id=\"url1\"]")
    public WebElementFacade url;

    @FindBy(xpath = "//*[@id=\"email1\"]")
    public WebElementFacade email;

    @FindBy(xpath = "//*[@id=\"pass1\"]")
    public WebElementFacade password;

    @FindBy(xpath = "//*[@id=\"pass2\"]")
    public WebElementFacade password2;

    @FindBy(xpath = "//*[@id=\"minsize1\"]")
    public WebElementFacade mimimunSize;

    @FindBy(xpath = "//*[@id=\"maxsize1\"]")
    public WebElementFacade maximunSize;

    @FindBy(xpath = "//*[@id=\"number2\"]")
    public WebElementFacade num;

    @FindBy(xpath = "//*[@id=\"ip\"]")
    public WebElementFacade ip;

    @FindBy(xpath = "//*[@id=\"date3\"]")
    public WebElementFacade date;

    @FindBy(xpath = "//*[@id=\"past\"]")
    public WebElementFacade dateE;

    @FindBy(xpath = "//*[@id=\"popup-validation\"]/div[14]/input")
    public WebElementFacade validate;

}
