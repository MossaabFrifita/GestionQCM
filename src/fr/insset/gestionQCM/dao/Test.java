package fr.insset.gestionQCM.dao;







import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.insset.gestionQCM.dao.entity.Auteur;
import fr.insset.gestionQCM.dao.entity.Groupe;
import fr.insset.gestionQCM.metier.GroupeMetier;
import fr.insset.gestionQCM.metier.UserMetier;
import fr.insset.gestionQCM.utils.HibernateUtil;




public class Test {
	public static Logger log = Logger.getLogger(Test.class);
	public static void main(String[] args) {
		

		


		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"config/config.xml"});
		GroupeMetier metier = (GroupeMetier) context.getBean("groupeMetier"); 
		context.close();
		
		
		metier.deleteGroupe(new Integer(2));
		
		//metier.addAuteur(new Auteur("ALEX","BERNOIS","123","ALEX@gmail.com"));
		
	/*	Session session = HibernateUtil.getSessionFactory().openSession();
		
	
		Auteur a = (Auteur)session.get(Auteur.class, new Integer(1));
		
		Groupe g = a.getListGroupes().get(0);
		System.out.println(g.getNomGroupe());*/


		

		
	}

}
