package hb.fr.SrpingTp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import hb.fr.SrpingTp.models.Editeur;

@Service
public interface EditeurService {
	Editeur saveEditeur(Editeur editeur);

	List<Editeur> getEditeurs();

	boolean deleteEditeur(Long id);

	public Editeur getEditeur(Long id);
}
