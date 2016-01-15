package bean;

import java.util.ArrayList;

import javax.ejb.Remote;

import model.Colis;

@Remote
public interface SuiviColisRemote {

	String coucou();
	ArrayList<Colis> colisList();
	Colis getColis(String idColis);
	void saveColis(Colis colis);
	void updateColis(Colis colis);
	
}
