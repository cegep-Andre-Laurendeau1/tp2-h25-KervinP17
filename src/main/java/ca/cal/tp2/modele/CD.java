package ca.cal.tp2.modele;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("CD")
public class CD extends Document {
    @Setter
    private String artiste;
    @Setter
    private int duree;
    @Setter
    private String genre;

}
