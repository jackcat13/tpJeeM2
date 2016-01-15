package bean;

import java.util.ArrayList;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Agence;

@Stateless(mappedName = "GestionBacklog")
@LocalBean
public class GestionBacklog implements GestionBacklogRemote {

	@PersistenceContext
	EntityManager em;

	public String coucou() {
		return "test";
	}

	public ArrayList<Agence> agencesList() {
		Query query = em.createNamedQuery("Agence.findAll", Agence.class);
		return (ArrayList<Agence>) query.getResultList();
	}

	public Agence getAgence(String idAgence) {
		return em.find(Agence.class, idAgence);
	}

	public void saveAgence(Agence agence) {
		em.persist(agence);

	}

	public void updateAgence(Agence agence) {
		em.merge(agence);

	}

}
