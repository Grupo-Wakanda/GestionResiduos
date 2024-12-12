package contenedor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContenedorRepository extends JpaRepository<Contenedor, Long> {

    List<Contenedor> findAll();
    List<Contenedor> FindByTipo(Tipo tipo);
}
