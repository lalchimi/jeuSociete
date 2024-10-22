package hb.fr.SrpingTp.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hb.fr.SrpingTp.models.Categorie;

@Repository
@Configuration
public interface CategoryRepository extends JpaRepository <Categorie, Long> {

}
