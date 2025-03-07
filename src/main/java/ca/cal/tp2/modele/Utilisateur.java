package ca.cal.tp2.modele;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "UTILISATEUR")
@Getter
public class Utilisateur {

    @Id
    @Column(name = "ID")
    private long id;
    private String name;
    private String email;
    private String phoneNumber;


    public Utilisateur(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

}
