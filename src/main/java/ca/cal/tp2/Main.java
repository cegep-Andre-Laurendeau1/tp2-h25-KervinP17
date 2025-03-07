package ca.cal.tp2;

import ca.cal.tp2.modele.CD;
import ca.cal.tp2.repository.CDRepositoryJPA;
import ca.cal.tp2.repository.DocumentRepositoryJPA;
import ca.cal.tp2.repository.LivreRepositoryJPA;
import ca.cal.tp2.repository.UtilisateurRepositoryJPA;
import ca.cal.tp2.service.DocumentService;
import ca.cal.tp2.service.EmprunteurService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // Votre script qui utilise votre API ici
        //

        TcpServer.createServer();

        EmprunteurService emprunteurService = new EmprunteurService(new UtilisateurRepositoryJPA());
        emprunteurService.createUtilisateur("Jobin2", "Jobin25@gmail.com", "1234567890");
        emprunteurService.createUtilisateur("Jobin3", "Jobin35@gmail.com", "1234567890");

        DocumentService documentService = new DocumentService(new DocumentRepositoryJPA(), new LivreRepositoryJPA(),
                                                                new CDRepositoryJPA());

        documentService.createLivre("Namleur 2", 5, "65-49567-423", "Aut", "Edi", 210);
    }
}
