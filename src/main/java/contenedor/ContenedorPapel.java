package contenedor;

import jakarta.persistence.Entity;
import residuo.Residuo;

import java.util.List;

@Entity
public class ContenedorPapel extends Contenedor{

    public ContenedorPapel(Long id, double capacidad, List<Residuo> residuos) {
        super(id, capacidad, residuos);
    }

    public ContenedorPapel(double capacidad) {
        super(capacidad);
    }

    public ContenedorPapel() {
        super();
    }
}
