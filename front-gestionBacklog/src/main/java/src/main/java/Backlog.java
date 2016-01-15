package src.main.java;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the BACKLOG database table.
 * 
 */
@Entity
@Table(name="BACKLOG")
@NamedQuery(name="Backlog.findAll", query="SELECT b FROM Backlog b")
public class Backlog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="IDBACKLOG")
	private String idbacklog;

	@Lob
	@Column(name="COMMENTAIRE")
	private String commentaire;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_DE_CREATION")
	private Date dateDeCreation;

	@Lob
	@Column(name="DESCRIPTION")
	private String description;

	@Column(name="ESTIMATION")
	private int estimation;

	@Column(name="NOM")
	private String nom;

	@Column(name="PRIORITE")
	private int priorite;

	//bi-directional many-to-one association to Agence
	@ManyToOne
	@JoinColumn(name="IDAGENCE")
	private Agence agence;

	//bi-directional many-to-one association to Entree
	@OneToMany(mappedBy="backlog")
	private List<Entree> entrees;

	public Backlog() {
	}

	public String getIdbacklog() {
		return this.idbacklog;
	}

	public void setIdbacklog(String idbacklog) {
		this.idbacklog = idbacklog;
	}

	public String getCommentaire() {
		return this.commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Date getDateDeCreation() {
		return this.dateDeCreation;
	}

	public void setDateDeCreation(Date dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getEstimation() {
		return this.estimation;
	}

	public void setEstimation(int estimation) {
		this.estimation = estimation;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPriorite() {
		return this.priorite;
	}

	public void setPriorite(int priorite) {
		this.priorite = priorite;
	}

	public Agence getAgence() {
		return this.agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	public List<Entree> getEntrees() {
		return this.entrees;
	}

	public void setEntrees(List<Entree> entrees) {
		this.entrees = entrees;
	}

	public Entree addEntree(Entree entree) {
		getEntrees().add(entree);
		entree.setBacklog(this);

		return entree;
	}

	public Entree removeEntree(Entree entree) {
		getEntrees().remove(entree);
		entree.setBacklog(null);

		return entree;
	}

}