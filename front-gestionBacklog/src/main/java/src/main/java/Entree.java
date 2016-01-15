package src.main.java;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ENTREE database table.
 * 
 */
@Entity
@Table(name="ENTREE")
@NamedQuery(name="Entree.findAll", query="SELECT e FROM Entree e")
public class Entree implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="IDENTREE")
	private String identree;

	@Lob
	@Column(name="COMMENTAIRE")
	private String commentaire;

	//bi-directional many-to-one association to Backlog
	@ManyToOne
	@JoinColumn(name="IDBACKLOG")
	private Backlog backlog;

	public Entree() {
	}

	public String getIdentree() {
		return this.identree;
	}

	public void setIdentree(String identree) {
		this.identree = identree;
	}

	public String getCommentaire() {
		return this.commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Backlog getBacklog() {
		return this.backlog;
	}

	public void setBacklog(Backlog backlog) {
		this.backlog = backlog;
	}

}