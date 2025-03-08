package ca.cal.tp2.repository;

import ca.cal.tp2.modele.Livre;
import ca.cal.tp2.service.dto.LivreDTO;

public interface LivreRepository {
    void save(Livre livre);

    LivreDTO findLivre(String titre, String auteur);
}
