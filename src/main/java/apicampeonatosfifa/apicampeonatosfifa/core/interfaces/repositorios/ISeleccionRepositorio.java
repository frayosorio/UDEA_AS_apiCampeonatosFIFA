package apicampeonatosfifa.apicampeonatosfifa.core.interfaces.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apicampeonatosfifa.apicampeonatosfifa.core.dominio.Seleccion;

@Repository
public interface ISeleccionRepositorio extends JpaRepository<Seleccion, Long> {
    


}
