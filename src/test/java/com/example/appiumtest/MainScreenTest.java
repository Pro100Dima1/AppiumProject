package com.example.appiumtest;
import io.appium.java_client.remote.options.BaseOptions;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
        public void sampleTest() {
            assertTrue(MainScreen.checkHeader(), "Нет хедера");
        }

        @After
        public void tearDown() {
            driver.quit();
        }

}
