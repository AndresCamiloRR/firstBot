package com.pom.certificacion.colorlib.definition;

import com.pom.certificacion.colorlib.common.BasePage;
import com.pom.certificacion.colorlib.step.TaskAction_Popup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.junit.Assert.assertEquals;

public class VFormDef extends BasePage {

    private String user;

    private String password;

    @Steps
    TaskAction_Popup taskAction;
    @Given("I enter with my credentials")
    public void iEnterWithMyCredentials(io.cucumber.datatable.DataTable dataTable) {
        this.user = dataTable.cell(1,0);
        this.password = dataTable.cell(1,1);
    }

    @When("I proceed with the authentication")
    public void iProceedWithTheAuthentication() {
        try{
            taskAction.openPage();
            taskAction.signIn(user, password);
        }catch (NullPointerException e){
            driver.quit();
            System.out.println("Something Went Wrong");
        }
    }

    @And("deploy submenu of Forms")
    public void deploySubmenuFormValidation() {
        taskAction.openFormsSubmenu();
    }

    @And("choose Form Validation")
    public void chooseFormValidation() {
        taskAction.selectValidationForm();
    }

    @And("check the title of the form on the screen")
    public void checkTheTitleOfTheFormOnTheScreen() {
        try {
            taskAction.checkTitle();
        } catch (Exception e) {
            System.out.println("Wrong site");
        }
    }

    @And("fill all Popup fields")
    public void fillAllFields(io.cucumber.datatable.DataTable dataTable) {
        taskAction.fillForm(dataTable.cell(1,0), dataTable.cell(1,1), dataTable.cell(1,2)
                , dataTable.cell(1,3), dataTable.cell(1,4), dataTable.cell(1,5), dataTable.cell(1,6)
                , dataTable.cell(1,7), dataTable.cell(1,8), dataTable.cell(1,9), dataTable.cell(1,10)
                , dataTable.cell(1,11), dataTable.cell(1,12));
    }

    @And("click button validate")
    public void clickButtonValidate() {
        taskAction.validateForm();
    }

    @Then("field required will be empty")
    public void fieldRequiredWillBeEmpty() {
        assertEquals(taskAction.requiredEmpty(), "");
    }
}
