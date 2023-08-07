package es.cic.ejerc008.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.cic.ejerc008.Entity.DetalleFigura;

@Repository
public interface DetalleFiguraRepository extends JpaRepository<DetalleFigura, Long> {
    // Puedes agregar métodos personalizados si es necesario
}