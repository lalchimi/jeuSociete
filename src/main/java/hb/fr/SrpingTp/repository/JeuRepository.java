package hb.fr.SrpingTp.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hb.fr.SrpingTp.models.Jeu;

@Repository
@Configuration
public interface JeuRepository extends JpaRepository <Jeu, Long> {

}
