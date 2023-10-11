package org.study;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class Main {

    public static void main(String [] args){
        testWebForm();
    }

    @Test
    public static void testWebForm() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        String title = driver.getTitle();
        assertEquals("Web form", title); // Corrigido o título esperado

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2500));
        WebElement messageInput = driver.findElement(By.name("my-text")); // Corrigido o nome da variável
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        messageInput.sendKeys("Teste 123"); // Corrigido o nome da variável
        submitButton.click();

        WebElement messageElement = driver.findElement(By.id("message")); // Corrigido o nome da variável
        String value = messageElement.getText(); // Corrigido o nome da variável
        assertEquals("Received!", value);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2500));
        driver.quit();
    }
}
