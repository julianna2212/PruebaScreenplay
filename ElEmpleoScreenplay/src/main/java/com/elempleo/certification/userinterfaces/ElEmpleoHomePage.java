package com.elempleo.certification.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
/**
 * Clase PageObject que contiene el mapeo de la pagina de inicio de El Empleo
 * con la URL por defecto
 *  
 * @author juliana.garcia
 */
@DefaultUrl("http://www.elempleo.com/co/")
public class ElEmpleoHomePage extends PageObject{
	
	public static final Target SEARCH = Target.the("search textbox").located(By.xpath("/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[1]/input")); //className("form-control input-lg js-searchbox-input tt-input"));
	public static final Target CITY_CLICK = Target.the("city click").located(By.xpath("/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[2]/input"));
	public static final Target CITY = Target.the("city click 2").located(By.xpath("/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[2]/div/div/div[2]"));  //className("form-control input-lg js-cities-searchbox ciudad-ux tt-input"));
	public static final Target SEARCH_BUTTON = Target.the("search button").located(By.xpath("/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[3]/button"));//className("btn btn-primary btn-lg js-searchHeader"));

}
