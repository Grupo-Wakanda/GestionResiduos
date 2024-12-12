package residuo;

import contenedor.Contenedor;
import jakarta.persistence.Entity;

@Entity
public class ResiduoPapel extends  Residuo{

    public ResiduoPapel( String tipo, double peso) {
        super(tipo, peso);
    }

    public ResiduoPapel(String tipo, double peso, Contenedor contenedor) {
        super(tipo, peso, contenedor);
    }

    public ResiduoPapel() {
        super();
    }
}
