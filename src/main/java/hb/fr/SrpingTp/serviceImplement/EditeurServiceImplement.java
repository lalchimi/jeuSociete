package hb.fr.SrpingTp.serviceImplement;

import java.util.List;

import org.springframework.stereotype.Service;

import hb.fr.SrpingTp.models.Editeur;
import hb.fr.SrpingTp.repository.EditeurRepository;
import hb.fr.SrpingTp.service.EditeurService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EditeurServiceImplement implements EditeurService {

private final EditeurRepository editeurRepo;
	
	@Override
	public Editeur saveEditeur(Editeur Editeur) {
		return editeurRepo.save(Editeur);
	}
	
	@Override
	public List<Editeur> getEditeurs() {
		return editeurRepo.findAll();
	}
	
	@Override 
	public Editeur getEditeur(Long id) {
		return editeurRepo.findById(id).orElse(null);
	}
	
	@Override
	public boolean deleteEditeur(Long id) {
		Editeur Editeur = editeurRepo.findById(id).orElse(null);
		if (Editeur == null) {
			return false;
		}
		editeurRepo.delete(Editeur);
		return true;
	}
}
