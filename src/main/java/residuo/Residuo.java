package residuo;

import contenedor.Contenedor;
import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Residuo {

    @Id
    protected Long id;

    @Column(name = "tipo")
    protected String tipo;

    @Column(name = "peso")
    protected double peso;

    @ManyToOne
    @JoinColumn(name = "contenedor_id", nullable = false)
    private Contenedor contenedor;

    public Residuo(String tipo, double peso) {
        this.tipo = tipo;
        this.peso = peso;
    }

    public Residuo(String tipo, double peso, Contenedor contenedor) {
        this.tipo = tipo;
        this.peso = peso;
        this.contenedor = contenedor;
    }

    public Residuo() {

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Contenedor getContenedor() {
        return contenedor;
    }

    public void setContenedor(Contenedor contenedor) {
        this.contenedor = contenedor;
    }
}
