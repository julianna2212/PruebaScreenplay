package com.elempleo.certification.questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import com.elempleo.certification.userinterfaces.ElEmpleoSearchSuccessPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * Clase Question para vereficar la correcta busqueda de el empleo
 * @author juliana.garcia
 */

public class ElEmpleoSearchResult implements Question<Boolean> {

	private static String errorMessage = "wrong register";

	//verifica si el boton SIGN_OFF_BUTTON esta visible por el actor
	@Override
	public Boolean answeredBy(Actor actor) {
		return the(ElEmpleoSearchSuccessPage.MESSAGE).answeredBy(actor).isCurrentlyVisible();

	}

	public static ElEmpleoSearchResult page() {
		return new ElEmpleoSearchResult();
	}

	public static String getErrorMessage() {
		return errorMessage;
	}
}
