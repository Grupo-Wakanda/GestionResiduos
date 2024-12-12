package residuo;

import jakarta.persistence.Entity;

@Entity
public class ResiduoPlastico extends Residuo {

    public ResiduoPlastico(Long id, String tipo, double peso) {
        super(id, tipo, peso);
    }

    public ResiduoPlastico() {
        super();
    }
}
