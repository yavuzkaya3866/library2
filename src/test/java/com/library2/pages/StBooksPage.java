package com.library2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StBooksPage extends BasePage{

    @FindBy(id = "book_categories")
    public WebElement bookCatagory;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchInput;

}
