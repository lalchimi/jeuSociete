package hb.fr.SrpingTp.serviceImplement;

import java.util.List;

import org.springframework.stereotype.Service;

import hb.fr.SrpingTp.models.Jeu;
import hb.fr.SrpingTp.repository.JeuRepository;
import hb.fr.SrpingTp.service.JeuService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class JeuServiceImplement implements JeuService {
	
private final JeuRepository jeuRepo;
	
	@Override
	public Jeu saveJeu(Jeu jeu) {
		return jeuRepo.save(jeu);
	}
	
	@Override
	public List<Jeu> getJeux() {
		return jeuRepo.findAll();
	}
	
	@Override 
	public Jeu getJeu(Long id) {
		return jeuRepo.findById(id).orElse(null);
	}
	
	@Override
	public boolean deleteJeu(Long id) {
		Jeu Jeu = jeuRepo.findById(id).orElse(null);
		if (Jeu == null) {
			return false;
		}
		jeuRepo.delete(Jeu);
		return true;
	}
}
