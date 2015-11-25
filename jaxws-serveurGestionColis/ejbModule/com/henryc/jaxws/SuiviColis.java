package com.henryc.jaxws;

import javax.ejb.Remote;

@Remote(SuiviColis.class)
public interface SuiviColis {

	public String coucou(String aQui);
}
