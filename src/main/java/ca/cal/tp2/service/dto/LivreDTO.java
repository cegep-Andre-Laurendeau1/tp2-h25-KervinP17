package ca.cal.tp2.service.dto;

import ca.cal.tp2.modele.Livre;

public record LivreDTO(long id, String titre, int nombreExemplaires, String ISBN, String auteur, String editeur, int nombrePages) {
    public static LivreDTO toDTO(LivreDTO livreDTO) {
        return new LivreDTO(livreDTO.id(), livreDTO.titre(), livreDTO.nombreExemplaires, livreDTO.ISBN, livreDTO.auteur(), livreDTO.editeur(), livreDTO.nombrePages());
    }
}
