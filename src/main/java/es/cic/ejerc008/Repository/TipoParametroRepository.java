package es.cic.ejerc008.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.cic.ejerc008.Entity.TipoParametro;
@Repository
public interface TipoParametroRepository extends JpaRepository<TipoParametro, Long> {
    // Puedes agregar métodos personalizados aquí si es necesario
}
