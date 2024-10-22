package hb.fr.SrpingTp.serviceImplement;

import java.util.List;

import org.springframework.stereotype.Service;

import hb.fr.SrpingTp.models.Edition;
import hb.fr.SrpingTp.repository.EditionRepository;
import hb.fr.SrpingTp.service.EditionService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EditionServiceImplement implements EditionService {
private final EditionRepository editionRepo;
	
	@Override
	public Edition saveEdition(Edition Edition) {
		return editionRepo.save(Edition);
	}
	
	@Override
	public List<Edition> getEditions() {
		return editionRepo.findAll();
	}
	
	@Override 
	public Edition getEdition(Long id) {
		return editionRepo.findById(id).orElse(null);
	}
	
	@Override
	public boolean deleteEdition(Long id) {
		Edition Edition = editionRepo.findById(id).orElse(null);
		if (Edition == null) {
			return false;
		}
		editionRepo.delete(Edition);
		return true;
	}
}
