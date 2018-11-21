package com.elempleo.certification.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/elempleoSearch.feature",
			glue = "com.elempleo.certification.stepdefinitions",
			snippets = SnippetType.CAMELCASE,
			tags = "@search")

public class ElEmpleoSearchRunner {

}
