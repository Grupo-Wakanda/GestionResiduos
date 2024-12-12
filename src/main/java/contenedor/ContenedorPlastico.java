package contenedor;

import jakarta.persistence.Entity;
import residuo.Residuo;

import java.util.List;

@Entity
public class ContenedorPlastico extends Contenedor{

    public ContenedorPlastico(Long id, double capacidad, List<Residuo> residuos) {
        super(id, capacidad, residuos);
    }

    public ContenedorPlastico() {
        super();
    }
}
