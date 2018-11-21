package com.elempleo.certification.questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.elempleo.certification.userinterfaces.ElEmpleoComponent;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * Clase Question para verificar la conexion de internet, comparando con un elemento del menu de El Empleo
 * @author juliana.garcia
 */

public class ElEmpleoPageVisible implements Question<Boolean>  {
	
	//verifica si el boton HOME_BUTTON esta visible por el actor
	@Override
	public Boolean answeredBy(Actor actor) {
		return the(ElEmpleoComponent.HOME_BUTTON).answeredBy(actor).isCurrentlyVisible();
	}

	public static Question<Boolean> isVisible() {
		return new ElEmpleoPageVisible();
	}

}
