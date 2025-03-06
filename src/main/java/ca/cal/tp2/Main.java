package ca.cal.tp2;

import ca.cal.tp2.repository.UtilisateurRepositoryJPA;
import ca.cal.tp2.service.EmprunteurService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // Votre script qui utilise votre API ici
        //

        TcpServer.createServer();

        EmprunteurService emprunteurService = new EmprunteurService(new UtilisateurRepositoryJPA());
        emprunteurService.createUtilisateur(0, "Jobin", "Jobin25@gmail.com", "1234567890");

    }
}
