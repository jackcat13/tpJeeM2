package testServeurEJB;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class testEJB {

	public static void main(String[] args) {

		Properties prop = new Properties();
		prop.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.enterprise.naming.SerialInitContextFactory");
		prop.put(Context.PROVIDER_URL, "iiop://127.0.0.1:8080");

		try {
			Context context = new InitialContext(prop);
			SuiviColisRemote beanRemote = (SuiviColisRemote) context
					.lookup("SuiviColis");
			//Colis colis = new Colis(3, "testmodif", "test", "test", 15, 15, "test", 15, 15);
			//beanRemote.persist(colis);
			beanRemote.coucou();
			context.close();
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}