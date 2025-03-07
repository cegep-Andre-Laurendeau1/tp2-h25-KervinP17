package ca.cal.tp2.modele;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("DVD")
public class DVD extends Document {
    @Setter
    private String director;
    @Setter
    private int duree;
    @Setter
    private String rating;

}
