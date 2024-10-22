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

import hb.fr.SrpingTp.models.Joueur;
import hb.fr.SrpingTp.service.JoueurService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/joueurs")
@AllArgsConstructor
@CrossOrigin
@Validated
public class JoueurRestController {
    private JoueurService joueurService;

    @GetMapping("")
    public List<Joueur> getJoueurs() {
        return joueurService.getJoueurs();
    }

    @PostMapping("")
    public Joueur saveJoueur(@RequestBody Joueur Joueur) {
        return joueurService.saveJoueur(Joueur);
    }

	@GetMapping("/{id}")
	public Joueur getJoueur(@PathVariable Long id) {
	  return joueurService.getJoueur(id);
	}

	@DeleteMapping("/{id}")
	public void deleteJoueur(@PathVariable Long id) {
		joueurService.deleteJoueur(id);
	}
}
