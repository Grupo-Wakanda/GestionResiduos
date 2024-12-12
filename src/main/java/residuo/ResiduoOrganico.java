package residuo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ResiduoOrganico extends Residuo{

    public ResiduoOrganico(Long id, String tipo, double peso) {
        super(id, tipo, peso);
    }

    public ResiduoOrganico() {
        super();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
