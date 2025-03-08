package ca.cal.tp2;

import ca.cal.tp2.modele.CD;
import ca.cal.tp2.repository.*;
import ca.cal.tp2.service.DocumentService;
import ca.cal.tp2.service.EmprunteurService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // Votre script qui utilise votre API ici
        //

        TcpServer.createServer();

        EmprunteurService emprunteurService = new EmprunteurService(new UtilisateurRepositoryJPA(),
                                                                    new EmprunteurRepositoryJPA());
        emprunteurService.createEmprunteur("Jobin2", "Jobin25@gmail.com", "1234567890");

        DocumentService documentService = new DocumentService(new DocumentRepositoryJPA(), new LivreRepositoryJPA(),
                                        new CDRepositoryJPA(), new DVDRepositoryJPA());

        documentService.createLivre("Namleur 2", 5, "65-49567-423",  "Aut", "Edi", 210);
        documentService.createCD("Featherlight", 2, "Mistorlore", 50, "Jazz");
        documentService.createDVD("Road Blocks: Le film", 6, "Christopher Longitude", 120, "PG-13");

        System.out.println(documentService.findLivre("Namleur 2", "Aut"));
    }
}
