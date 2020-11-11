package com.library2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{


    @FindBy(css = ".navbar-brand")
    public WebElement LibraryLink;
    @FindBy(xpath = "//*[@class=\"nav-item\"][2]")
    public WebElement UsersLink;
    @FindBy(xpath = "//*[@href=\"#books\"]")
    public WebElement BooksLink;
    @FindBy(css = ".nav-link.dropdown-toggle")
    public WebElement UserNameLink;
    @FindBy(id = "user_avatar")
    public WebElement User_Avatar;
    @FindBy(css = "#borrowed_books")
    public WebElement BorrowedBooks;
    @FindBy(xpath = "//*[@id=\"books\"]/div[1]/div[1]/h3")
    public WebElement book_Management_Title;
    @FindBy(xpath = "//*[@id=\"menu_item\"]/li/a/span")
    public WebElement dashboard_button;



}
