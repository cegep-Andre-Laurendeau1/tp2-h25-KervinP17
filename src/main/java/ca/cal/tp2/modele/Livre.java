package ca.cal.tp2.modele;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("Livre")
public class Livre extends Document {
    @Setter
    private String ISBN;
    @Setter
    private String auteur;
    @Setter
    private String editeur;
    @Setter
    private int nombrePages;

}
