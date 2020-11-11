package com.library2.pages;

import com.library2.utilities.ConfigurationReader;
import com.library2.utilities.Driver;
import io.cucumber.java.nl.Stel;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class LoginPage {

    public LoginPage(){ PageFactory.initElements(Driver.get(),this); }

    @FindBy(id = "inputEmail")
    public WebElement usernameBox;

    @FindBy(id = "inputPassword")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInBtn;


//    public void login(String role){
//
//        if(role.equals("student98")){
//            usernameBox.sendKeys(ConfigurationReader.get("studentUsername"));
//            passwordBox.sendKeys(ConfigurationReader.get("studentPassword"));
//            signInBtn.click();
//        }else if (role.equals("librarian15")) {
//            usernameBox.sendKeys(ConfigurationReader.get("librarianUsername"));
//            passwordBox.sendKeys(ConfigurationReader.get("librarianPassword"));
//            signInBtn.click();
//        }
//    }

//        usernameBox.sendKeys(ConfigurationReader.get("studentUsername"));
//        passwordBox.sendKeys(ConfigurationReader.get("studentPassword"));
//        signInBtn.click();

   }








