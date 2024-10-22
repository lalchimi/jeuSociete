package hb.fr.SrpingTp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import hb.fr.SrpingTp.models.Edition;

@Service
public interface EditionService {
	Edition saveEdition(Edition edition);

	List<Edition> getEditions();

	boolean deleteEdition(Long id);

	public Edition getEdition(Long id);
}
