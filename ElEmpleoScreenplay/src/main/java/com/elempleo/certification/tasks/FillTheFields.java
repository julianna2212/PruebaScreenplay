package com.elempleo.certification.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.elempleo.certification.models.ElEmpleoSearchModel;
import com.elempleo.certification.userinterfaces.ElEmpleoHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

/**
 * Clase Task (tarea) para realizar el ingreso de los datos al registro, traidos
 * desde el feature como un model (ElEmpleoSearchModel)
 * 
 * @author juliana.garcia
 */

public class FillTheFields implements Task {

	// modelo de busqueda
	private ElEmpleoSearchModel searchModel;

	// constructor de la tarea
	public FillTheFields(ElEmpleoSearchModel searchModel) {
		this.searchModel = searchModel;
	}

	//Ingresa los atributos del modelo en los campos del registro
	@Override
	@Step("{0} fill the job he wants on El Empleo Page")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(searchModel.getJob()).into(ElEmpleoHomePage.SEARCH),
				Click.on(ElEmpleoHomePage.CITY_CLICK),
				Click.on(ElEmpleoHomePage.CITY),
				//Selector para el menu desplegable CITY
				//SelectFromOptions.byVisibleText(searchModel.getCity()).from(ElEmpleoHomePage.CITY_CLICK),
				Click.on(ElEmpleoHomePage.SEARCH_BUTTON));
	}

	// metodo que llama al instrumented que crea una instancia en tiempo de
	// ejecución, con el parametro de tipo searchModel
	public static FillTheFields withThe(ElEmpleoSearchModel searchModel) {
		return instrumented(FillTheFields.class, searchModel);
	}

}