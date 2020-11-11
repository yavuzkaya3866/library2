package com.library2.stepDefs;

import com.library2.pages.DashboardPage;
import com.library2.pages.LoginPage;
import com.library2.utilities.BrowserUtils;
import com.library2.utilities.ConfigurationReader;
import com.library2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class LoginStepDefs {

    @Given("user on the login page")
    public void user_on_the_login_page() {

        Driver.get().get(ConfigurationReader.get("url"));

    }


    @When("user enters {string} and {string}")
    public void user_enters_and(String email, String password) {
        LoginPage loginPage = new LoginPage();

        loginPage.usernameBox.sendKeys(email);
        loginPage.passwordBox.sendKeys(password);

        loginPage.signInBtn.click();

//        BrowserUtils.waitFor(10);
    }

    @Then("{string} on  {string}")
    public void on(String role, String page) {

        if (role.contains("student")) {

            String actualTitle = new DashboardPage().book_Management_Title.getText();

            Assert.assertTrue(actualTitle.contains(page));

        } else {

            String dashboardLogoText = new DashboardPage().dashboard_button.getText();

            Assert.assertTrue(dashboardLogoText.contains(page));

        }

    }
}

