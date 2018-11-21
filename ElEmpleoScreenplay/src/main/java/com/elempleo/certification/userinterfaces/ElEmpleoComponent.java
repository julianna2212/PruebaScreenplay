package com.elempleo.certification.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
/**
 * Clase PageObject que contiene el mapeo de la imagen de El Empleo
 * 
 * @author juliana.garcia
 */

public class ElEmpleoComponent extends PageObject {

	public static final Target HOME_BUTTON = Target.the("Home button").located(By.className("img-responsive"));

}
