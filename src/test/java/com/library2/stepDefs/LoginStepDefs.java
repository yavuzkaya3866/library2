package com.library2.stepDefs;

import com.library2.pages.DashboardPage;
import com.library2.pages.LoginPage;
import com.library2.utilities.BrowserUtils;
import com.library2.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class LoginStepDefs {

    @When("user login as a {string}")
    public void user_login_as_a(String user) {
        new LoginPage().login(user);
        BrowserUtils.waitForPageToLoad(5);
    }

    @Then("user on {string}")
    public void user_on(String page) {
        BrowserUtils.waitFor(10);
        System.out.println(Driver.get().getCurrentUrl());

        Assert.assertTrue( Driver.get().getCurrentUrl().contains(page));
    }

    @When("the user should able to click {string}")
    public void the_user_should_able_to_click(String option) {
        new DashboardPage().userAvatar.click();
        new DashboardPage().logOutLink.click();
    }

    @Then("user should able to {string} page")
    public void user_should_able_to_page(String page) {
        BrowserUtils.waitForPageToLoad(6);
        Assert.assertTrue(Driver.get().getCurrentUrl().contains(page));
    }
    @Then("user should able to access {string}")
    public void user_should_able_to_access(String module) {
        String actual=BrowserUtils.getElementsText(new DashboardPage().menuItem).toString();
        String actualModules=actual.substring(1,BrowserUtils.getElementsText(new DashboardPage().menuItem).toString().length()-1);
        Assert.assertEquals(module,actualModules);
        System.out.println("actualModules = " + actualModules);
    }
}


