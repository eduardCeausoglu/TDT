package org.example.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import org.jruby.RubyProcess;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.example.steps.serenity.EndUserSteps;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(SerenityRunner.class)
public class SearchByKeywordStory {

    @Managed(uniqueSession = true)
    public WebDriver driver;
    //public WebDriver driver = new ChromeDriver();


    @Steps
    public EndUserSteps anna;

    @Issue("#WIKI-1")
    @Test
    public void searching_by_keyword_apple_should_display_the_corresponding_article() {
        driver.get("https://" + "lhdemo" + ":" + "20LHdemo21!" + "@" +"lighthouse-demo.evozon.com/login");
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