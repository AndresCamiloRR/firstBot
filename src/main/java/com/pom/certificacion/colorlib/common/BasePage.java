package com.pom.certificacion.colorlib.common;

import com.pom.certificacion.colorlib.pageobject.PaginaLogin;
import org.openqa.selenium.WebDriver;

public class BasePage {
    public static WebDriver driver;

    private PaginaLogin paginaLogin;

    public void openApp(){
        paginaLogin.open();
    }

    public WebDriver getDriver(){
        return driver;
    }
}
