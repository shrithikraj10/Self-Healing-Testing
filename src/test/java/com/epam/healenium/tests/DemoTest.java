package com.epam.healenium.tests;

import com.epam.healenium.SelfHealingDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {
    WebDriver driver;

    @Test
    public void tesfirst(){
        WebDriverManager.chromedriver().setup();
        WebDriver delegate = new ChromeDriver();

        //setting debuggerAddress value

        //add options to browser capabilities

        driver = SelfHealingDriver.create(delegate);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//a[text()='Gmail']")).click();



    }

}
