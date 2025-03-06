package ca.cal.tp2.service;

import ca.cal.tp2.modele.Utilisateur;
import ca.cal.tp2.repository.UtilisateurRepository;
import lombok.Data;

@Data
public class EmprunteurService {

    private final UtilisateurRepository utilisateurRepository;

    public void createUtilisateur(int id, String name, String email, String phoneNumber) {

        utilisateurRepository.save(new Utilisateur(id));

    }
}
