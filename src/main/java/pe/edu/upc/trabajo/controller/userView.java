package pe.edu.upc.trabajo.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.xml.registry.infomodel.User;

import pe.edu.upc.trabajo.business.crud.UserService;


@Named("userView")
@ViewScoped
public class userView implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<User> users;
	
	@Inject
	private UserService regionService;
	

	
	public List<User> getUsers() {
		return users;
	}

}
