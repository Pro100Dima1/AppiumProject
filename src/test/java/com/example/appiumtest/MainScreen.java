package com.example.appiumtest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MainScreen {

    @AndroidFindBy(xpath = "\t\n" +
            "//android.widget.ImageButton[@content-desc=\"Следующий месяц\"]")
    private WebElement header;

    public boolean checkHeader() {
        return header.isEnabled();
    }

    public MainScreen(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
