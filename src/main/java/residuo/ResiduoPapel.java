package residuo;

import jakarta.persistence.Entity;

@Entity
public class ResiduoPapel extends  Residuo{

    public ResiduoPapel(Long id, String tipo, double peso) {
        super(id, tipo, peso);
    }

    public ResiduoPapel() {
        super();
    }
}
