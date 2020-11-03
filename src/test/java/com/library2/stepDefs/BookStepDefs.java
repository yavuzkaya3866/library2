package com.library2.stepDefs;

import com.library2.pages.StBooksPage;
import com.library2.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BookStepDefs {
    Select bookCatagory= new Select(new StBooksPage().bookCatagory);

    @When("user click book_categories {string} selected by default")
    public void user_click_book_categories_selected_by_default(String option) {

        Assert.assertEquals(option,bookCatagory.getFirstSelectedOption().getText());

    }

    @Then("user should see categories following below")
    public void user_should_see_categories_following_below(List<String> catagory) {
        List<WebElement> actualOptions = bookCatagory.getOptions();
        List<String> actual = BrowserUtils.getElementsText(actualOptions);
        System.out.println("catagory.toString() = " + catagory.toString());
        System.out.println("actual.toString() = " + actual.toString());

        Assert.assertTrue(catagory.toString().equals(actual.toString()));

    }
}
