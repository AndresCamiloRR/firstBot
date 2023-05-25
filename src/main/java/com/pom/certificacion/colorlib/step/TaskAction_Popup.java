package com.pom.certificacion.colorlib.step;

import com.pom.certificacion.colorlib.common.BasePage;
import com.pom.certificacion.colorlib.pageobject.PaginaLogin;
import com.pom.certificacion.colorlib.pageobject.MainPage;
import com.pom.certificacion.colorlib.pageobject.forms.PopUp;
import net.thucydides.core.annotations.Step;

public class TaskAction_Popup extends BasePage {

    private PaginaLogin paginaLogin;

    private MainPage mainPage;

    private PopUp popUp;

    @Step
    public void openPage(){
        openApp();
    }

    @Step
    public void signIn(String strUser, String strPassword){
        sendKeysUser(strUser);
        sendKeysPassword(strPassword);
        paginaLogin.btnSingIn.waitUntilClickable().click();
    }

    public void sendKeysUser(String strUser){
        paginaLogin.user.waitUntilClickable().click();
        paginaLogin.user.clear();
        paginaLogin.user.sendKeys(strUser);
    }
    
    public void sendKeysPassword(String strPassword){
        paginaLogin.password.waitUntilClickable().click();
        paginaLogin.password.clear();
        paginaLogin.password.sendKeys(strPassword);
    }

    public void openFormsSubmenu(){
        mainPage.arrowMenu.waitUntilClickable().click();
    }
    public void selectValidationForm(){
        mainPage.option.waitUntilClickable().click();
    }

    public void checkTitle() throws Exception {
        if (!popUp.title.getText().equals("  Form Validation")) throw new Exception();
    }

    public void fillForm(String required, String select, String select2, String url, String email,
                         String password, String password2, String min, String max, String num, String ip,
                         String date, String dateE){

        popUp.required.click();
        popUp.required.clear();
        popUp.required.sendKeys(required);

        popUp.select.click();

        switch (select){

            case "option1":
                popUp.tennis.click();
                break;

            case "option2":
                popUp.football.click();
                break;

            case "option3":
                popUp.golf.click();
                break;

        }

        switch (select2){

            case "option1":
                popUp.tennis2.click();
                break;

            case "option2":
                popUp.football2.click();
                break;

            case "option3":
                popUp.golf2.click();
                break;

        }

        popUp.url.click();
        popUp.url.clear();
        popUp.url.sendKeys(url);

        popUp.email.click();
        popUp.email.clear();
        popUp.email.sendKeys(email);

        popUp.password.click();
        popUp.password.clear();
        popUp.password.sendKeys(password);

        popUp.password2.click();
        popUp.password2.clear();
        popUp.password2.sendKeys(password2);

        popUp.mimimunSize.click();
        popUp.mimimunSize.clear();
        popUp.mimimunSize.sendKeys(min);

        popUp.maximunSize.click();
        popUp.maximunSize.clear();
        popUp.maximunSize.sendKeys(max);

        popUp.num.click();
        popUp.num.clear();
        popUp.num.sendKeys(num);

        popUp.ip.click();
        popUp.ip.clear();
        popUp.ip.sendKeys(ip);

        popUp.date.click();
        popUp.date.clear();
        popUp.date.sendKeys(date);

        popUp.dateE.click();
        popUp.dateE.clear();
        popUp.dateE.sendKeys(dateE);

    }

    public void validateForm(){
        popUp.validate.waitUntilClickable().click();
    }

    public String requiredEmpty(){
        return popUp.required.getText();
    }

}
