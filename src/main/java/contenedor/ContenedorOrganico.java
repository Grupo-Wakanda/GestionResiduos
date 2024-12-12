package contenedor;

import jakarta.persistence.Entity;

@Entity
public class ContenedorOrganico extends Contenedor{

    public ContenedorOrganico( boolean esRecolectable) {
        super(esRecolectable, Tipo.ORGANICO);
    }

    public ContenedorOrganico() {
    }

}
