package ca.cal.tp2.service;

import ca.cal.tp2.modele.Emprunteur;
import ca.cal.tp2.modele.Utilisateur;
import ca.cal.tp2.repository.EmprunteurRepository;
import ca.cal.tp2.repository.UtilisateurRepository;
import lombok.Data;

@Data
public class EmprunteurService {

    private final UtilisateurRepository utilisateurRepository;
    private final EmprunteurRepository emprunteurRepository;

    public void createUtilisateur( String name, String email, String phoneNumber) {
        utilisateurRepository.save(new Utilisateur(name, email, phoneNumber));
    }

    public void createEmprunteur(String name, String email, String phoneNumber) {
        Emprunteur emprunteur = new Emprunteur();

        emprunteur.setName(name);
        emprunteur.setEmail(email);
        emprunteur.setPhoneNumber(phoneNumber);

        emprunteurRepository.save(emprunteur);
    }
}
