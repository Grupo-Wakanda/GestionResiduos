package contenedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import static contenedor.Tipo.PLASTICO;

@Component
public class ContenedorFabrica {

    @Autowired
    private ContenedorRepository contenedorRepository;

    //el problema es que no se donde poner la cantidad de contenedores que debo crear
    //los sensores dependen de la cantidad de contendores que haya
    public List<Contenedor> crearContenedores(Tipo tipo, int cantidad) {
        List<Contenedor> contenedores = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            Contenedor contenedor = crearContenedorPorTipo(tipo);
            contenedores.add(contenedor);
        }
        return contenedores;
    }

    private Contenedor crearContenedorPorTipo(Tipo tipo) {
        switch (tipo) {
            case PAPEL:
                return new ContenedorPapel(false);
            case ORGANICO:
                return new ContenedorOrganico(false);
            case PLASTICO:
                return new ContenedorPlastico(false);
            default:
                return null;
        }
    }
}
