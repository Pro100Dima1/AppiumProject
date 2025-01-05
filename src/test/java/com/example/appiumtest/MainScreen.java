package com.example.appiumtest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MainScreen {

    @AndroidFindBy(xpath = "\t\n" +
            "//android.widget.ImageButton[@content-desc=\"Следующий месяц\"]")
    private WebElement nextMonth;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Прошлый месяц\"]")
    private WebElement pastMonth;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"android:id/date_picker_header\"]/android.widget.LinearLayout\n")
    private WebElement headWidget;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id=\"android:id/month_view\"]")
    private WebElement layoutCalendar;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.calendar.clever.cod:id/button2\"]")
    private WebElement headData;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Календарь\"]")
    private WebElement toolBar;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=\"com.calendar.clever.cod:id/imageview7\"]")
    private WebElement banner;

    @AndroidFindBy(xpath = "\t\n" +
            "//android.widget.TextView[@resource-id=\"com.calendar.clever.cod:id/textview3\"]")
    private WebElement rateTheApp;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/alertTitle\"]")
    private WebElement estimation;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.calendar.clever.cod:id/textview1\"]")
    private WebElement toolBarText;

    public boolean checkNextMonth() {
        return nextMonth.isEnabled();
    }

    public boolean checkPastMonth() {
        return pastMonth.isEnabled();
    }

    public boolean checkHeadWidget() {
        return headWidget.isEnabled();
    }

    public boolean checkLayoutCalendar() {
        return layoutCalendar.isEnabled();
    }

    public boolean checkHeadData() {
        return headData.isEnabled();
    }

    public boolean checkToolBar() {
        return toolBar.isEnabled();
    }

    public boolean checkToolBarIsClickable() {
        toolBar.click();
        return banner.isEnabled();
    }

    public boolean checkRateTheApp() {
        toolBar.click();
        return rateTheApp.isEnabled();
    }

    public boolean checkRateTheAppIsClickable() {
        toolBar.click();
        rateTheApp.click();
        return estimation.isEnabled();
    }

    public String checkToolBarText() {
        toolBar.click();
        return toolBarText.getText();
    }

    public MainScreen(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
