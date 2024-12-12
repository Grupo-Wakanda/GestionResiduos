package contenedor;

import jakarta.persistence.*;
import residuo.Residuo;

import java.util.List;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public class Contenedor {


    @Id
    @Column(name = "id")
    protected Long id;

    @Column(name = "capacidad")
    protected double capacidad;

    @OneToMany(mappedBy = "contenedor", cascade = CascadeType.ALL, orphanRemoval = true)
    protected List<Residuo> residuos;

    public Contenedor(Long id, double capacidad, List<Residuo> residuos) {
        this.id = id;
        this.capacidad = capacidad;
        this.residuos = residuos;
    }

    public Contenedor() {

    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public List<Residuo> getResiduos() {
        return residuos;
    }

    public void setResiduos(List<Residuo> residuos) {
        this.residuos = residuos;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
