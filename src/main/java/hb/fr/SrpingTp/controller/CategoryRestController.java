package hb.fr.SrpingTp.controller;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hb.fr.SrpingTp.models.Categorie;
import hb.fr.SrpingTp.service.CategorieService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/categories")
@AllArgsConstructor
@CrossOrigin
@Validated
public class CategoryRestController {
    private CategorieService categorieService;

    @GetMapping("")
    public List<Categorie> getCategories() {
        return categorieService.getCategories();
    }

    @PostMapping("")
    public Categorie saveCategorie(@RequestBody Categorie categorie) {
        return categorieService.saveCategorie(categorie);
    }

	@GetMapping("/{id}")
	public Categorie getCategorie(@PathVariable Long id) {
	  return categorieService.getCategorie(id);
	}

	@DeleteMapping("/{id}")
	public void deleteCategorie(@PathVariable Long id) {
		categorieService.deleteCategorie(id);
	}
}
