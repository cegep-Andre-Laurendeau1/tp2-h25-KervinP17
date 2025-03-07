package ca.cal.tp2.repository;

import ca.cal.tp2.modele.Livre;
import jakarta.persistence.EntityManager;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class LivreRepositoryJPA implements LivreRepository {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotheque");

    @Override
    public void save(Livre livre) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(livre);
            em.getTransaction().commit();

        }
    }
}
