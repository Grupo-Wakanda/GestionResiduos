package residuo;

import contenedor.Contenedor;
import jakarta.persistence.Entity;

@Entity
public class ResiduoPlastico extends Residuo {

    public ResiduoPlastico(Long id, String tipo, double peso) {
        super(tipo, peso);
    }

    public ResiduoPlastico(String tipo, double peso, Contenedor contenedor) {
        super(tipo, peso, contenedor);
    }

    public ResiduoPlastico() {
        super();
    }
}
