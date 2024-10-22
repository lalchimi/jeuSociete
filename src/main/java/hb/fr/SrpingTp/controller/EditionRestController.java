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

import hb.fr.SrpingTp.models.Edition;
import hb.fr.SrpingTp.service.EditionService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/editions")
@AllArgsConstructor
@CrossOrigin
@Validated
public class EditionRestController {
    private EditionService editionService;

    @GetMapping("")
    public List<Edition> getEditions() {
        return editionService.getEditions();
    }

    @PostMapping("")
    public Edition saveEdition(@RequestBody Edition Edition) {
        return editionService.saveEdition(Edition);
    }

	@GetMapping("/{id}")
	public Edition getEdition(@PathVariable Long id) {
	  return editionService.getEdition(id);
	}

	@DeleteMapping("/{id}")
	public void deleteEdition(@PathVariable Long id) {
		editionService.deleteEdition(id);
	}
}
