package hb.fr.SrpingTp.models;

import java.time.Year;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Edition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Year anneeEdition;
    private String langue;

    @ManyToOne
    private Jeu jeu;
    @ManyToOne
    private Editeur editeur;

    @Override
    public String toString() {
        return "Edition{" +
                "id=" + id +
                ", anneeEdition=" + anneeEdition +
                ", langue='" + langue + '\'' +
                ", jeu=" + jeu +
                ", editeur=" + editeur +
                '}';
    }
}
