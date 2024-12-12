package contenedor;

import jakarta.persistence.Entity;

@Entity
public class ContenedorPlastico extends Contenedor{

    public ContenedorPlastico(boolean esRecolectable) {
        super(esRecolectable, Tipo.PLASTICO);
    }

    public ContenedorPlastico() {
    }
}
