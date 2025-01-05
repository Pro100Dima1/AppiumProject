package com.example.appiumtest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

public class MainScreen {
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(MainScreen.class));

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
        LOG.info("Переход на страницу Get Started");
        return nextMonth.isEnabled();
    }

    public boolean checkPastMonth() {
        LOG.info("Переход на страницу Get Started");
        return pastMonth.isEnabled();
    }

    public boolean checkHeadWidget() {
        LOG.info("Переход на страницу Get Started");
        return headWidget.isEnabled();
    }

    public boolean checkLayoutCalendar() {
        LOG.info("Переход на страницу Get Started");
        return layoutCalendar.isEnabled();
    }

    public boolean checkHeadData() {
        LOG.info("Переход на страницу Get Started");
        return headData.isEnabled();
    }

    public boolean checkToolBar() {
        LOG.info("Переход на страницу Get Started");
        return toolBar.isEnabled();
    }

    public boolean checkToolBarIsClickable() {
        LOG.info("Переход на страницу Get Started");
        toolBar.click();
        return banner.isEnabled();
    }

    public boolean checkRateTheApp() {
        LOG.info("Переход на страницу Get Started");
        toolBar.click();
        return rateTheApp.isEnabled();
    }

    public boolean checkRateTheAppIsClickable() {
        LOG.info("Переход на страницу Get Started");
        toolBar.click();
        rateTheApp.click();
        return estimation.isEnabled();
    }

    public String checkToolBarText() {
        LOG.info("Переход на страницу Get Started");
        toolBar.click();
        return toolBarText.getText();
    }

    public MainScreen(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
