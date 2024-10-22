package hb.fr.SrpingTp.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Joueur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private String email;
    private Date dateInscription;

    @ManyToMany
    @JoinTable(
            name = "joueur_jeu", // nom de la table d'association
            joinColumns = @JoinColumn(name = "joueur_id"), // Clé étrangère pour la table Etudiant
            inverseJoinColumns = @JoinColumn(name = "jeu_id") // Clé étrangère pour la table Cours
    )
    private List<Jeu> jeux = new ArrayList<>();

    @Override
    public String toString() {
        return "Joueur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", dateInscription=" + dateInscription +
              //  ", jeux=" + jeux +
                '}';
    }
}
