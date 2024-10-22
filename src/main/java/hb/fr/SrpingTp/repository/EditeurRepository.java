package hb.fr.SrpingTp.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hb.fr.SrpingTp.models.Editeur;

@Repository
@Configuration
public interface EditeurRepository extends JpaRepository <Editeur, Long>  {

}
