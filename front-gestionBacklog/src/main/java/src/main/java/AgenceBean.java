package src.main.java;

import java.util.ArrayList;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

@Named
//@ManagedBean
@RequestScoped
public class AgenceBean {

	//@EJB
	// GestionBacklogRemote gestionBacklog;

	private ArrayList<Agence> agencesList;

	/*
	 * public AgenceBean(){
	 * 
	 * agencesList = new ArrayList<Agence>(); agencesList =
	 * gestionBacklog.agencesList(); }
	 */

	public AgenceBean() {
		agencesList = new ArrayList<Agence>();
		agencesList.add(new Agence("test1"));
		agencesList.add(new Agence("test2"));
		agencesList.add(new Agence("test3"));
		agencesList.add(new Agence("test4"));
		agencesList.add(new Agence("test5"));
		agencesList.add(new Agence("test6"));
	}

	public ArrayList<Agence> getAgencesList() {
		return this.agencesList;
	}
}