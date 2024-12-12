package contenedor;

import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class ContenedorPapel extends Contenedor{

    public ContenedorPapel(boolean esRecolectable) {
        super(esRecolectable, Tipo.PAPEL);
    }

    public ContenedorPapel() {
    }
}
