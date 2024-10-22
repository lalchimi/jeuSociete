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

import hb.fr.SrpingTp.models.Editeur;
import hb.fr.SrpingTp.service.EditeurService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/editeurs")
@AllArgsConstructor
@CrossOrigin
@Validated
public class EditeurRestController {
    private EditeurService editeurService;

    @GetMapping("")
    public List<Editeur> getEditeurs() {
        return editeurService.getEditeurs();
    }

    @PostMapping("")
    public Editeur saveEditeur(@RequestBody Editeur Editeur) {
        return editeurService.saveEditeur(Editeur);
    }

	@GetMapping("/{id}")
	public Editeur getEditeur(@PathVariable Long id) {
	  return editeurService.getEditeur(id);
	}

	@DeleteMapping("/{id}")
	public void deleteEditeur(@PathVariable Long id) {
		editeurService.deleteEditeur(id);
	}
}
