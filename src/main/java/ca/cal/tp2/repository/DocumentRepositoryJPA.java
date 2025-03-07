package ca.cal.tp2.repository;

import ca.cal.tp2.modele.Document;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DocumentRepositoryJPA implements DocumentRepository {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotheque");


    @Override
    public void save(Document document) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(document);
            em.getTransaction().commit();
        }
    }
}
