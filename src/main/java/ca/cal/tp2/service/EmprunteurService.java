package ca.cal.tp2.service;

import ca.cal.tp2.modele.Utilisateur;
import ca.cal.tp2.repository.UtilisateurRepository;
import lombok.Data;

@Data
public class EmprunteurService {

    private final UtilisateurRepository utilisateurRepository;

    public void createUtilisateur( String name, String email, String phoneNumber) {
        utilisateurRepository.save(new Utilisateur(name, email, phoneNumber));
    }
}
