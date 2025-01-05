package com.example.appiumtest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainScreenTest {

    private AndroidDriver driver;
    private URL serverUrl;
    private MainScreen MainScreen;

    @Before
    public void setUp() throws MalformedURLException {
        BaseOptions options = new BaseOptions()
                .amend("appium:app", "G:\\apk\\Простой Календарь_4.1.9_APKPure.apk")
                .amend("platformName", "Android")
                .amend("appium:deviceName", "SamsungS20FE")
                .amend("appium:automationName", "uiAutomator2")
                .amend("appium:ensureWebviewsHavePages", true)
                .amend("appium:nativeWebScreenshot", true)
                .amend("appium:newCommandTimeout", 3600)
                .amend("appium:connectHardwareKeyboard", true);

        // Создаем URL сервера Appium
        serverUrl = new URL("http://127.0.0.1:4723");

        // Инициализация драйвера
        driver = new AndroidDriver(serverUrl, options);

        MainScreen = new MainScreen(driver);
    }

    @Test
    public void checkNextMonthIsEnabled() {
        assertTrue(MainScreen.checkNextMonth(), "Кнопка перехода на следующий месяц доступна");
    }

    @Test
    public void checkPastMonthIsEnabled() {
        assertTrue(MainScreen.checkPastMonth(), "Кнопка перехода на прошлый месяц доступна");
    }

    @Test
    public void checkHeadWidgetIsEnabled() {
        assertTrue(MainScreen.checkHeadWidget(), "Виджет на главной странице есть");
    }

    @Test
    public void checkLayoutCalendarIsEnabled() {
        assertTrue(MainScreen.checkLayoutCalendar(), "Календарь есть на главной странице");
    }

    @Test
    public void checkHeadDataIsEnabled() {
        assertTrue(MainScreen.checkHeadData(), "Дата есть в шапке главной страницы");
    }

    @Test
    public void checkToolBarIsEnabled() {
        assertTrue(MainScreen.checkToolBar(), "На главной странице доступен тулбар");
    }

    @Test
    public void checkToolBarIsClickable() {
        assertTrue(MainScreen.checkToolBarIsClickable(), "На главной странице тулбар при нажатии открывает менюшку");
    }

    @Test
    public void checkRateTheApp() {
        assertTrue(MainScreen.checkRateTheApp(), "В менюшке тулбара есть кнопка Оценить приложение");
    }

    @Test
    public void checkRateTheAppIsClickable() {
        assertTrue(MainScreen.checkRateTheAppIsClickable(), "В меню тулбара кнопка Оценить приложение кликабельна");
    }

    @Test
    public void checkToolBarTextIsCorrect() {
        String expectedText = "Календарь Clever";
        String actualText = MainScreen.checkToolBarText();
        assertEquals(expectedText, actualText, "Текст не совпадают");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
