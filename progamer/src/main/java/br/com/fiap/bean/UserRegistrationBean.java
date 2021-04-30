package br.com.fiap.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.com.fiap.dao.UserRegistrationDAO;
import br.com.fiap.model.UserRegistration;

@Named
@RequestScoped
public class UserRegistrationBean {
	
	private UserRegistration userRegistration = new UserRegistration();
	
	public void save() {
		
		new UserRegistrationDAO().save(this.userRegistration);
		System.out.print("Salvando..." + this.userRegistration);
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage("Successful registration"));
	}
	
	public List<UserRegistration> getUsers() {
		return new UserRegistrationDAO().getAll();
	}

	public UserRegistration getUserRegistration() {
		return userRegistration;
	}

	public void setUserRegistration(UserRegistration user) {
		this.userRegistration = user;
	}

}
