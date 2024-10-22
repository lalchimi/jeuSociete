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

import hb.fr.SrpingTp.models.Jeu;
import hb.fr.SrpingTp.service.JeuService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/jeus")
@AllArgsConstructor
@CrossOrigin
@Validated
public class JeuRestController {
    private JeuService jeuService;

    @GetMapping("")
    public List<Jeu> getJeus() {
        return jeuService.getJeux();
    }

    @PostMapping("")
    public Jeu saveJeu(@RequestBody Jeu Jeu) {
        return jeuService.saveJeu(Jeu);
    }

	@GetMapping("/{id}")
	public Jeu getJeu(@PathVariable Long id) {
	  return jeuService.getJeu(id);
	}

	@DeleteMapping("/{id}")
	public void deleteJeu(@PathVariable Long id) {
		jeuService.deleteJeu(id);
	}
}
