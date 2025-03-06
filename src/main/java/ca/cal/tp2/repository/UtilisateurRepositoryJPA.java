package ca.cal.tp2.repository;

import ca.cal.tp2.modele.Utilisateur;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UtilisateurRepositoryJPA implements UtilisateurRepository {

    @Override
    public void save(Utilisateur utilisateur) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotheque");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        //TODO save utilisateur dans db


        em.getTransaction().commit();
        em.close();

    }
}
