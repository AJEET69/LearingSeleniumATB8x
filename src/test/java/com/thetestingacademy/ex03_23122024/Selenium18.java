package com.thetestingacademy.ex03_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;



public class Selenium18 {

    @Test
    public void TestMethod01() throws Exception{

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");



//        <a - open HTML Tag
//        href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
//        class="text-link Td(n)"
//        data-qa="bericafeqo">
//        Start a free trial
//
//        </a> close html tag



        // Link Test - Full Match
        // Partial Link_free_trail - Partial Match

//        WebElement link_free_trail_element = driver.findElement(By.linkText("Start a free trial"));
//        link_free_trail_element.click();


        WebElement link_free_trail_element = driver.findElement(By.partialLinkText("free trial"));
        link_free_trail_element.click();



        Thread.sleep(3000);


        driver.quit();


    }

}
