package com.elempleo.certification.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
/**
 * Clase PageObject que contiene el mapeo de la pagina de exito de la busqueda en El Empleo
 *  
 * @author juliana.garcia
 */
public class ElEmpleoSearchSuccessPage extends PageObject {
	public static final Target MESSAGE = Target.the("message").located(By.xpath("/html/body/div[8]/div[2]/h1"));
}
