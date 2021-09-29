package pe.edu.upc.trabajo.controller;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@ViewScoped
@Named("pageView")
public class pageView {

	   public String navega() {
	      
	         return "registro.xhtml";
	   }
}
