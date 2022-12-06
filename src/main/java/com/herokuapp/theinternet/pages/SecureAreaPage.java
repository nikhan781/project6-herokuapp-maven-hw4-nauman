package com.herokuapp.theinternet.pages;

import com.herokuapp.theinternet.utility.Utility;
import org.openqa.selenium.By;

public class SecureAreaPage extends Utility {

    //Declaring variable of By to get text
    By loginVerificationText = By.xpath("//h2[text() =' Secure Area']");

    //This method will get text after successful login
    public String getTextUponSuccessfulLogIn() {
        return getTextFromElement(loginVerificationText);
    }
}
