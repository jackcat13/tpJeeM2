package com.henryc.jaxws;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.henryc.model.Colis;

@Stateless(mappedName = "SuiviColis")
public class SuiviColisBean implements SuiviColis {

	@PersistenceContext
	protected EntityManager entityManager;

	public String coucou(String aQui) {
		return entityManager.find(Colis.class, 1).toString();
	}

	// Stores a new Colis:
	public void persist(Colis colis) {
		entityManager.persist(colis);
	}
}
