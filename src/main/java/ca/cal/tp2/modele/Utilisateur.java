package ca.cal.tp2.modele;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "UTILISATEUR")
@Access(AccessType.FIELD)
public class Utilisateur {

    @Id
    @Column(name = "ID")
    private int id;



    public Utilisateur(int id) {
        this.id = id;
    }

    public Utilisateur() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
