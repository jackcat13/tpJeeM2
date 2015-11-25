package com.henryc.jaxws;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.henryc.model.Colis;

@Stateless(mappedName="SuiviColis")
public class SuiviColisBean implements SuiviColis {

	@PersistenceContext protected EntityManager entityManager;
	
	public String coucou(String aQui) {
		return entityManager.find(Colis.class, 0).toString();
	}
}
