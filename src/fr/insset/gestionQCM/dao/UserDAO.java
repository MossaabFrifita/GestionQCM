package fr.insset.gestionQCM.dao;

import java.util.List;

import fr.insset.gestionQCM.dao.entity.Utilisateur;

public interface UserDAO {
	
	public List<Utilisateur> getStatus(String email, String password);
	

}
