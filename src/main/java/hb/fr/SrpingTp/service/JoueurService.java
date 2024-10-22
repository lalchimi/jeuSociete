package hb.fr.SrpingTp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import hb.fr.SrpingTp.models.Joueur;

@Service
public interface JoueurService {
	Joueur saveJoueur(Joueur joueur);

	List<Joueur> getJoueurs();

	boolean deleteJoueur(Long id);

	public Joueur getJoueur(Long id);
}
