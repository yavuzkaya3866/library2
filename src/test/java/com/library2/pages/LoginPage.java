package com.library2.pages;

import com.library2.utilities.ConfigurationReader;
import com.library2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "#inputEmail")
    public WebElement emailInput;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signIn;

    public void login(String usertype){
        String username="";
        String password="";
        if(usertype.contains("student")){
            username= ConfigurationReader.get("studentUsername");
            password= ConfigurationReader.get("studentPassword");
        }else if(usertype.contains("librarian")){
            username= ConfigurationReader.get("librarianUsername");
            password= ConfigurationReader.get("librarianPassword");
        }
        emailInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signIn.click();

    }





}
