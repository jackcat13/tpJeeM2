package com.henryc.jaxws;

import javax.ejb.Remote;

import com.henryc.model.Colis;

@Remote(SuiviColis.class)
public interface SuiviColis {

	public String coucou(String aQui);
	public void persist(Colis colis);
}
