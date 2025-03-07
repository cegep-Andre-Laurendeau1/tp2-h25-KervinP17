package ca.cal.tp2.repository;

import ca.cal.tp2.modele.CD;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CDRepositoryJPA implements CDRepository {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotheque");


    @Override
    public void save(CD cd) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(cd);
            em.getTransaction().commit();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
