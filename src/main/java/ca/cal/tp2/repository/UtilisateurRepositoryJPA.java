package ca.cal.tp2.repository;

import ca.cal.tp2.modele.Utilisateur;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UtilisateurRepositoryJPA implements UtilisateurRepository {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotheque");

    @Override
    public void save(Utilisateur utilisateur) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(utilisateur);
            em.getTransaction().commit();

        }
    }
}
