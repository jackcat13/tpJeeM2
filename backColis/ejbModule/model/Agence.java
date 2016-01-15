package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the AGENCE database table.
 * 
 */
@Entity
@Table(name="AGENCE")
@NamedQuery(name="Agence.findAll", query="SELECT a FROM Agence a")
public class Agence implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="IDAGENCE")
	private String idagence;

	//bi-directional many-to-one association to Backlog
	@OneToMany(mappedBy="agence")
	private List<Backlog> backlogs;

	public Agence() {
	}
	
	public Agence(String idAgence){
		this.idagence = idAgence;
	}

	public String getIdagence() {
		return this.idagence;
	}

	public void setIdagence(String idagence) {
		this.idagence = idagence;
	}

	public List<Backlog> getBacklogs() {
		return this.backlogs;
	}

	public void setBacklogs(List<Backlog> backlogs) {
		this.backlogs = backlogs;
	}

	public Backlog addBacklog(Backlog backlog) {
		getBacklogs().add(backlog);
		backlog.setAgence(this);

		return backlog;
	}

	public Backlog removeBacklog(Backlog backlog) {
		getBacklogs().remove(backlog);
		backlog.setAgence(null);

		return backlog;
	}

}