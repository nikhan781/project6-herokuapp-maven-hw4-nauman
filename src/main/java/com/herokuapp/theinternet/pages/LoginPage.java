package com.herokuapp.theinternet.pages;

import com.herokuapp.theinternet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    //Declaring By type variables
    By userNameField = By.name("username");
    By passwordField = By.name("password");
    By logInButton = By.cssSelector("i[class='fa fa-2x fa-sign-in']");

    By errorMessage = By.xpath("//div[1]/div/div|/text()");

    //This method will send text to user field
    public void enterUserName(String userName) {
        sendTextToElement(userNameField, userName);
    }
    //This method will send text to password field
    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    //This method will click on log in button
    public void clickOnLogInButton() {
        clickOnElement(logInButton);
    }

    //This method will get error message in case of using invalid credentials
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }

}
