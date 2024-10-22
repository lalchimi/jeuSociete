package hb.fr.SrpingTp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import hb.fr.SrpingTp.models.Jeu;

@Service
public interface JeuService {
	Jeu saveJeu(Jeu jeu);

	List<Jeu> getJeux();

	boolean deleteJeu(Long id);

	public Jeu getJeu(Long id);

}
