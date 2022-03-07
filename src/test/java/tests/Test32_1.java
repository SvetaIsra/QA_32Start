package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test32_1 {
    WebDriver wd;

    @BeforeMethod
    public void preConditions(){
        wd = new ChromeDriver();
        System.setProperty("webdriver.chromedriver","C:\Users\noamk\OneDrive\Documents\QA_32\QA_32Start\chromedriver.exe");
        wd.navigate().to("https://trello.com/");
    }

    @Test
    public void elements(){
        WebElement el = wd.findElement(By.tagName("a"));
        WebElement el2 = wd.findElement(By.tagName("div"));
        WebElement el3 = wd.findElement(By.id("hero"));
        WebElement el4 = wd.findElement(By.cssSelector("#hero"));
        WebElement el5 = wd.findElement(By.className("hero"));
        WebElement link = wd.findElement(By.linkText())

    }




    @AfterMethod
    public void postConditions(){
        wd.close();
        wd.quit();
    }




}
