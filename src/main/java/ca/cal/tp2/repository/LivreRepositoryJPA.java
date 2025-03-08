package ca.cal.tp2.repository;

import ca.cal.tp2.modele.Livre;
import ca.cal.tp2.service.dto.LivreDTO;
import jakarta.persistence.EntityManager;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

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

    @Override
    public LivreDTO findLivre(String titre, String auteur) {
        try (EntityManager em = emf.createEntityManager()) {
            TypedQuery<Livre> query = em.createQuery("SELECT l FROM Livre l " +
                    "WHERE l.titre = :titre AND l.auteur = :auteur", Livre.class);
            query.setParameter("titre", titre);
            query.setParameter("auteur", auteur);
            return query.getSingleResult().toDTO();

        }
    }

}
