package contenedor;

import jakarta.persistence.Entity;
import residuo.Residuo;

import java.util.List;

@Entity
public class ContenedorOrganico extends Contenedor{

    public ContenedorOrganico(Long id, double capacidad, List<Residuo> residuos) {
        super(id, capacidad, residuos);
    }

    public ContenedorOrganico() {
        super();
    }
}
