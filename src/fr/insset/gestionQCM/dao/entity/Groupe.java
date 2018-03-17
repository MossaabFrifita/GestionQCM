package fr.insset.gestionQCM.dao.entity;



import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "groupe", catalog = "qcm_db")
public class Groupe implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nomGroupe;
	private Date dateCreation;
	private int idAuteur;

	public Groupe() {
	}

	public Groupe(String nomGroupe, Date dateCreation, int idAuteur) {
		this.nomGroupe = nomGroupe;
		this.dateCreation = dateCreation;
		this.idAuteur = idAuteur;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "NomGroupe", nullable = false)
	public String getNomGroupe() {
		return this.nomGroupe;
	}

	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DateCreation", nullable = false, length = 10)
	public Date getDateCreation() {
		return this.dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Column(name = "id_auteur", nullable = false)
	public int getIdAuteur() {
		return this.idAuteur;
	}

	public void setIdAuteur(int idAuteur) {
		this.idAuteur = idAuteur;
	}

}
