package ca.cal.tp2.service;

import ca.cal.tp2.modele.CD;
import ca.cal.tp2.modele.DVD;
import ca.cal.tp2.modele.Document;
import ca.cal.tp2.modele.Livre;
import ca.cal.tp2.repository.CDRepository;
import ca.cal.tp2.repository.DVDRepository;
import ca.cal.tp2.repository.DocumentRepository;
import ca.cal.tp2.repository.LivreRepository;

public class DocumentService {

    private final DocumentRepository documentRepository;
    private final LivreRepository livreRepository;
    private final CDRepository cdRepository;
    private final DVDRepository dvdRepository;

    public DocumentService(DocumentRepository documentRepository, LivreRepository livreRepository, CDRepository cdRepository, DVDRepository dvdRepository) {
        this.documentRepository = documentRepository;
        this.livreRepository = livreRepository;
        this.cdRepository = cdRepository;
        this.dvdRepository = dvdRepository;
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

    public void createCD(String titre, int nombreExmplaires, String artiste, int duree, String genre) {
        CD cd = new CD();

        cd.setTitre(titre);
        cd.setNombreExemplaires(nombreExmplaires);

        cd.setArtiste(artiste);
        cd.setDuree(duree);
        cd.setGenre(genre);
        cdRepository.save(cd);
    }

    public void createDVD(String titre, int nombreExemplaires, String director, int duree, String rating) {
        DVD dvd = new DVD();

        dvd.setTitre(titre);
        dvd.setNombreExemplaires(nombreExemplaires);

        dvd.setDirector(director);
        dvd.setDuree(duree);
        dvd.setRating(rating);
        dvdRepository.save(dvd);
    }
}
