package com.elempleo.certification.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.elempleo.certification.models.ElEmpleoSearchModel;
import com.elempleo.certification.questions.ElEmpleoSearchResult;
import com.elempleo.certification.tasks.FillTheFields;
import com.elempleo.certification.tasks.OpenTheBrowser;
import com.elempleo.certification.userinterfaces.ElEmpleoHomePage;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class ElEmpleoSearchStepDefinitions {
	
	//Definición del driver
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;

	private Actor Pepito = Actor.named("Pepito");
	
	private ElEmpleoHomePage ElEmpleoHomePage;

	//Inicialización del driver a cargo del actor
		@Before
		public void setUp() {
			Pepito.can(BrowseTheWeb.with(hisBrowser));
		}


		@Given("^that Pepito is in the search el empleo page$")
		public void that_Pepito_is_in_the_search_el_empleo_page() {
			Pepito.wasAbleTo(OpenTheBrowser.on(ElEmpleoHomePage));
		}
		
		
		@When("^he enter the job he wants$")
		public void he_enter_the_job_he_wants(List<ElEmpleoSearchModel> data) {
			Pepito.attemptsTo(FillTheFields.withThe(data.get(0)));
		}
		
		@Then("^he should see the jobs he wants$")
		public void he_should_see_the_jobs_he_wants() {
			Pepito.should(seeThat(ElEmpleoSearchResult.page()));
		}

	
}
