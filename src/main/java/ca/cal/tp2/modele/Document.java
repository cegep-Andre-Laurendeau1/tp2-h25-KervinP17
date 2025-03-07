package ca.cal.tp2.modele;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "discriminator")
public abstract class Document {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @Setter
    private String titre;
    @Setter
    private int nombreExemplaires;

    public Document(String titre, int nombreExemplaires) {
        this.titre = titre;
        this.nombreExemplaires = nombreExemplaires;
    }

    public Document(Long id) {
        this.id = id;
    }



}
