package bean;

import java.util.ArrayList;

import javax.ejb.Remote;

import model.Agence;

@Remote
public interface GestionBacklogRemote {

	String coucou();
	ArrayList<Agence> agencesList();
	Agence getAgence(String idAgence);
	void saveAgence(Agence agence);
	void updateAgence(Agence agence);
}
