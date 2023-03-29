package co.com.certificacion.RetoDespegar.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/RetoDespegar.feature",
        glue = {"co.com.certificacion.RetoDespegar.stepdefinitions"},
        plugin = {"pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class DespegarRunner
{

}
