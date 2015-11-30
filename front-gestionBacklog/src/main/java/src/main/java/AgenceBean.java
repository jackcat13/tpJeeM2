package src.main.java;

import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import src.main.model.Agence;

@Named
@RequestScoped
public class AgenceBean {
	
	private ArrayList<Agence> agencesList;
	
	public AgenceBean(){
		
		agencesList = new ArrayList<Agence>();
		agencesList.add(new Agence("test1"));
		agencesList.add(new Agence("test2"));
	}
	
	public ArrayList<Agence> getAgencesList(){
		return this.agencesList;
	}
}