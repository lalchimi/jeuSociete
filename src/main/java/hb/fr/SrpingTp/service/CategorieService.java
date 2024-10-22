package hb.fr.SrpingTp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import hb.fr.SrpingTp.models.Categorie;

@Service
public interface CategorieService {
	Categorie saveCategorie(Categorie categorie);

	List<Categorie> getCategories();

	boolean deleteCategorie(Long id);

	public Categorie getCategorie(Long id);

}
