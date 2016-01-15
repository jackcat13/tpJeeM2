package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the COLIS database table.
 * 
 */
@Entity
@Table(name="COLIS")
@NamedQuery(name="Colis.findAll", query="SELECT c FROM Colis c")
public class Colis implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idColis;

	private String destinationColis;

	private String emplacementColis;

	private String etatColis;

	private double latitudeColis;

	private double longitudeColis;

	private String origineColis;

	private double poidsColis;

	private double valeurColis;

	public Colis() {
	}

	public int getIdColis() {
		return this.idColis;
	}

	public void setIdColis(int idColis) {
		this.idColis = idColis;
	}

	public String getDestinationColis() {
		return this.destinationColis;
	}

	public void setDestinationColis(String destinationColis) {
		this.destinationColis = destinationColis;
	}

	public String getEmplacementColis() {
		return this.emplacementColis;
	}

	public void setEmplacementColis(String emplacementColis) {
		this.emplacementColis = emplacementColis;
	}

	public String getEtatColis() {
		return this.etatColis;
	}

	public void setEtatColis(String etatColis) {
		this.etatColis = etatColis;
	}

	public double getLatitudeColis() {
		return this.latitudeColis;
	}

	public void setLatitudeColis(double latitudeColis) {
		this.latitudeColis = latitudeColis;
	}

	public double getLongitudeColis() {
		return this.longitudeColis;
	}

	public void setLongitudeColis(double longitudeColis) {
		this.longitudeColis = longitudeColis;
	}

	public String getOrigineColis() {
		return this.origineColis;
	}

	public void setOrigineColis(String origineColis) {
		this.origineColis = origineColis;
	}

	public double getPoidsColis() {
		return this.poidsColis;
	}

	public void setPoidsColis(double poidsColis) {
		this.poidsColis = poidsColis;
	}

	public double getValeurColis() {
		return this.valeurColis;
	}

	public void setValeurColis(double valeurColis) {
		this.valeurColis = valeurColis;
	}

}