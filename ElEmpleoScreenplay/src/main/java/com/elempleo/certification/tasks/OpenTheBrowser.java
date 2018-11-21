package com.elempleo.certification.tasks;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.elempleo.certification.exceptions.WithoutConnectionToTheNetwork;
import com.elempleo.certification.questions.ElEmpleoPageVisible;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

/**
 * Clase Task (tarea) para realizar la apertura del navegador en la pagina
 * recibida como parametro PageObject en el metodo on.
 * 
 * @author juliana.garcia
 */
public class OpenTheBrowser implements Task {

	private PageObject page;

	public OpenTheBrowser(PageObject page) {
		this.page = page;
	}

	@Override
	@Step("{0} Opens the browser on ElEmpleo home page ")
	public <T extends Actor> void performAs(T actor) {
		// Llama la tarea Open que abre el navegador en la pagina page
		actor.attemptsTo(Open.browserOn(page));
		// Verifica que efectivamente se abre la pagina, de lo contrario arroja un
		// AssertionError
		actor.should(seeThat(ElEmpleoPageVisible.isVisible()).orComplainWith(WithoutConnectionToTheNetwork.class,
				getNoInternetConectionMessage()));
	}

	public String getNoInternetConectionMessage() {
		return String.format(WithoutConnectionToTheNetwork.getErrorNetworkMessage());

	}

	// metodo que llama al instrumented que crea una instancia en tiempo de
	// ejecuci�n, con el parametro de tipo PageObject
	public static OpenTheBrowser on(PageObject page) {
		return instrumented(OpenTheBrowser.class, page);
	}
}
