package testServeurEJB;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.henryc.jaxws.SuiviColis;

public class testEJB {

	public static void main(String[] args) {

		Properties prop = new Properties();
		prop.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.enterprise.naming.SerialInitContextFactory");
		prop.put(Context.PROVIDER_URL, "iiop://127.0.0.1:8080");

		try {
			Context context = new InitialContext(prop);
			SuiviColis beanRemote = (SuiviColis) context
					.lookup("SuiviColis");
			System.out.println(beanRemote.coucou("baltringue"));
			context.close();
		} catch (NamingException e) {
			e.printStackTrace();
		}

		
	}
}
