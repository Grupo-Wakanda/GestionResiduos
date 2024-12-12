package residuo;

import contenedor.Contenedor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ResiduoOrganico extends Residuo{

    public ResiduoOrganico( String tipo, double peso) {
        super(tipo, peso);
    }

    public ResiduoOrganico(String tipo, double peso, Contenedor contenedor) {
        super(tipo, peso, contenedor);
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
