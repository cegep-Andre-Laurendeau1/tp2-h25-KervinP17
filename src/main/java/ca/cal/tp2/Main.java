package ca.cal.tp2;

import ca.cal.tp2.modele.Utilisateur;
import ca.cal.tp2.repository.UtilisateurRepositoryJPA;
import ca.cal.tp2.service.EmprunteurService;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.h2.tools.Server;

import java.sql.SQLException;
import jakarta.persistence.EntityManager;

public class Main {
    public static void main(String[] args) throws SQLException {
        // Votre script qui utilise votre API ici
        //

        TcpServer.createServer();



    }
}
