package hb.fr.SrpingTp.serviceImplement;

import java.util.List;

import org.springframework.stereotype.Service;

import hb.fr.SrpingTp.models.Categorie;
import hb.fr.SrpingTp.repository.CategoryRepository;
import hb.fr.SrpingTp.service.CategorieService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategorieServiceImplement implements CategorieService {


private final CategoryRepository categorieRepo;
	
	@Override
	public Categorie saveCategorie(Categorie Categorie) {
		return categorieRepo.save(Categorie);
	}
	
	@Override
	public List<Categorie> getCategories() {
		return categorieRepo.findAll();
	}
	
	@Override 
	public Categorie getCategorie(Long id) {
		return categorieRepo.findById(id).orElse(null);
	}
	
	@Override
	public boolean deleteCategorie(Long id) {
		Categorie Categorie = categorieRepo.findById(id).orElse(null);
		if (Categorie == null) {
			return false;
		}
		categorieRepo.delete(Categorie);
		return true;
	}
}
