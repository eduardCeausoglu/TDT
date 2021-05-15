package org.example.features.login;

import com.paulhammant.ngwebdriver.ByAngularPartialButtonText;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.example.steps.serenity.EndUserSteps;
import org.openqa.selenium.WebElement;

@RunWith(SerenityRunner.class)
public class TestLogin {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserSteps anna;


    @Issue("#WIKI-1")
    @Test
    public void searching_by_keyword_apple_should_display_the_corresponding_article() {
        /*
        WebElement email = webdriver.findElement(ByAngularPartialButtonText("Sign in"));
        WebElement login = webdriver.findElement(By.Id());
        email.sendKeys("abc@xyz.com");
        login.click();*/
        webdriver.switchTo().alert().dismiss();
    }

    @Test
    public void searching_by_keyword_banana_should_display_the_corresponding_article() {
        anna.is_the_home_page();
        anna.looks_for("pear");
        anna.should_see_definition("An edible fruit produced by the pear tree, similar to an apple but elongated towards the stem.");
    }

    @Pending @Test
    public void searching_by_ambiguious_keyword_should_display_the_disambiguation_page() {
    }
}