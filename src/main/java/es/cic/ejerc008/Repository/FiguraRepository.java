package es.cic.ejerc008.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.cic.ejerc008.Entity.Figura;
@Repository
public interface FiguraRepository extends JpaRepository<Figura, Long>{

}
