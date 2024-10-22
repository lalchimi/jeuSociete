package hb.fr.SrpingTp.serviceImplement;

import java.util.List;

import org.springframework.stereotype.Service;

import hb.fr.SrpingTp.models.Joueur;
import hb.fr.SrpingTp.repository.JoueurRepository;
import hb.fr.SrpingTp.service.JoueurService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class JoueurServiceImplement implements JoueurService {
	private final JoueurRepository joueurRepo;

	@Override
	public Joueur saveJoueur(Joueur Joueur) {
		return joueurRepo.save(Joueur);
	}

	@Override
	public List<Joueur> getJoueurs() {
		return joueurRepo.findAll();
	}

	@Override
	public Joueur getJoueur(Long id) {
		return joueurRepo.findById(id).orElse(null);
	}

	@Override
	public boolean deleteJoueur(Long id) {
		Joueur Joueur = joueurRepo.findById(id).orElse(null);
		if (Joueur == null) {
			return false;
		}
		joueurRepo.delete(Joueur);
		return true;
	}
}
