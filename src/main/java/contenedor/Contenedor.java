package contenedor;

import jakarta.persistence.*;


@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public class Contenedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Long id;

    @Column(name = "recolectable")
    protected boolean esRecolectable;

    @Column(name = "tipo")
    protected Tipo tipo;

    public Contenedor(boolean esRecolectable, Tipo tipo) {
        this.esRecolectable = esRecolectable;
        this.tipo = tipo;
    }

    public Contenedor() {}

    public boolean isEsRecolectable() {
        return esRecolectable;
    }

    public void setEsRecolectable(boolean esRecolectable) {
        this.esRecolectable = esRecolectable;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
