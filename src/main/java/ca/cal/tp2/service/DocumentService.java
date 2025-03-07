package ca.cal.tp2.service;

import ca.cal.tp2.modele.Document;
import ca.cal.tp2.modele.Livre;
import ca.cal.tp2.repository.DocumentRepository;
import ca.cal.tp2.repository.LivreRepository;

public class DocumentService {

    private final DocumentRepository documentRepository;
    private final LivreRepository livreRepository;

    public DocumentService(DocumentRepository documentRepository, LivreRepository livreRepository) {
        this.documentRepository = documentRepository;
        this.livreRepository = livreRepository;
    }

    public void createLivre( String ISBN, String auteur, String editeur, int nombrePages) {
        Livre livre = new Livre();
        livre.setISBN(ISBN);
        livre.setAuteur(auteur);
        livre.setEditeur(editeur);
        livre.setNombrePages(nombrePages);
        livreRepository.save(livre);
    }
}
