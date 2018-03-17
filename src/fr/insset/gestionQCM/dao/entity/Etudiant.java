package fr.insset.gestionQCM.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "etudiant", catalog = "qcm_db")
public class Etudiant implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String filiere;
	private int idUser;

	public Etudiant() {
	}

	public Etudiant(String filiere, int idUser) {
		this.filiere = filiere;
		this.idUser = idUser;
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

	@Column(name = "Filiere", nullable = false)
	public String getFiliere() {
		return this.filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

	@Column(name = "id_user", nullable = false)
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

}
