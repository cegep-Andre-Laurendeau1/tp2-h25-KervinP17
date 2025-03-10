package ca.cal.tp2.repository;

import ca.cal.tp2.modele.Emprunteur;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EmprunteurRepositoryJPA implements EmprunteurRepository {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotheque");


    @Override
    public void save(Emprunteur emprunteur) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(emprunteur);
            em.getTransaction().commit();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
