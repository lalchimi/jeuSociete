package hb.fr.SrpingTp.models;


import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jeu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String description;
    private int nombreJoueursMin;
    private int nombreJoueursMax;
    private int duree;
    private Year year;

    @OneToMany(mappedBy = "jeu")
    private List<Edition> editions = new ArrayList<>();

    @ManyToOne
    private Categorie categorie;

    @ManyToMany(mappedBy = "jeux")
    private List<Joueur> joueurs = new ArrayList<>();


    @Override
    public String toString() {
        return "Jeu{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", nombreJoueursMin=" + nombreJoueursMin +
                ", nombreJoueursMax=" + nombreJoueursMax +
                ", duree=" + duree +
                ", year=" + year +
               // ", editions=" + editions +
                ", categorie=" + categorie +
               // ", joueurs=" + joueurs +
                '}';
    }
}
