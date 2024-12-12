package contenedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContenedorService {

    @Autowired
    private ContenedorRepository contenedorRepository;

    @Autowired
    private ContenedorFabrica contenedorFabrica;

    public List<Contenedor> buscarContenedores(Tipo tipo, int cantidad){
        List<Contenedor> contenedoresExistentes = contenedorRepository.FindByTipo(tipo);
        if (!contenedoresExistentes.isEmpty()){
            return contenedoresExistentes;
        } else {
            List<Contenedor> nuevosContenedores = contenedorFabrica.crearContenedores(tipo, cantidad);
            return contenedorRepository.saveAll(nuevosContenedores);
        }
    }
}
