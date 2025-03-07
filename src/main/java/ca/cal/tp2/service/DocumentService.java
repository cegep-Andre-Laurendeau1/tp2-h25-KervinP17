package ca.cal.tp2.service;

import ca.cal.tp2.modele.CD;
import ca.cal.tp2.modele.Document;
import ca.cal.tp2.modele.Livre;
import ca.cal.tp2.repository.CDRepository;
import ca.cal.tp2.repository.DocumentRepository;
import ca.cal.tp2.repository.LivreRepository;

public class DocumentService {

    private final DocumentRepository documentRepository;
    private final LivreRepository livreRepository;
    private final CDRepository cdRepository;

    public DocumentService(DocumentRepository documentRepository, LivreRepository livreRepository, CDRepository cdRepository) {
        this.documentRepository = documentRepository;
        this.livreRepository = livreRepository;
        this.cdRepository = cdRepository;
    }

    public void createLivre(String titre, int nombreExmplaires, String ISBN, String auteur, String editeur, int nombrePages) {
        Livre livre = new Livre();

        livre.setTitre(titre);
        livre.setNombreExemplaires(nombreExmplaires);

        livre.setISBN(ISBN);
        livre.setAuteur(auteur);
        livre.setEditeur(editeur);
        livre.setNombrePages(nombrePages);
        livreRepository.save(livre);
    }
}
