package java;

public class Person {

private int idPersonne;
private String loginPersonne;
private String mdpPersonne;
private boolean isAdmin;



public Person(int idPersonne, String loginPersonne, String mdpPersonne, boolean isAdmin) {
	this.idPersonne = idPersonne;
	this.loginPersonne = loginPersonne;
	this.mdpPersonne = mdpPersonne;
	this.isAdmin = isAdmin;
}

public int getidPersonne() {
	return idPersonne;
}

public void setidPersonne(int idPersonne) {
	this.idPersonne = idPersonne;
}

public String getloginPersonne() {
	return loginPersonne;
}

public void setloginPersonne(String loginPersonne) {
	this.loginPersonne = loginPersonne;
}

public String getmdpPersonne() {
	return mdpPersonne;
}

public void setmdpPersonne(String mdpPersonne) {
	this.mdpPersonne = mdpPersonne;
}

public boolean isisAdmin() {
	return isAdmin;
}

public void setisAdmin(boolean isAdmin) {
	this.isAdmin = isAdmin;
}

}