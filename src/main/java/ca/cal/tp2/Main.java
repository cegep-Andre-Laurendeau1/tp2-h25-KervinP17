package ca.cal.tp2;

import ca.cal.tp2.modele.Utilisateur;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.h2.tools.Server;

import java.sql.SQLException;
import jakarta.persistence.EntityManager;

public class Main {
    public static void main(String[] args) throws SQLException {
        // Votre script qui utilise votre API ici
        //

        final Server tcpServer = Server.createTcpServer(
                "-tcp", "-tcpAllowOthers", "-tcpPort", "9092");
        System.out.println("Tcp server start: " + tcpServer.start());
        System.out.println(tcpServer.getStatus() + " " +
                tcpServer.getPort());
        System.out.println("jdbc:h2:tcp://localhost:9092/mem:bibliotheque");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotheque");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();


        em.getTransaction().commit();
        em.close();



    }
}
