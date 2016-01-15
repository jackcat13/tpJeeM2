package bean;

import java.util.ArrayList;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Agence;
import model.Colis;

@Stateless(mappedName = "SuiviColis")
@LocalBean
public class SuiviColis implements SuiviColisRemote {

	@PersistenceContext
	EntityManager em;

	public String coucou() {
		return "Salut";
	}

	public ArrayList<Colis> colisList() {
		Query query = em.createNamedQuery("Colis.findAll", Colis.class);
		return (ArrayList<Colis>) query.getResultList();
	}

	public Colis getColis(String idColis) {
		return em.find(Colis.class, idColis);
	}

	public void saveColis(Colis colis) {
		em.persist(colis);
	}

	public void updateColis(Colis colis) {
		em.merge(colis);
	}

}
