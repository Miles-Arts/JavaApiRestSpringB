package co.project.apiRest;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *  API REST
 *
 * Consumir End Points
 *
 * @version 1.0.0 2023-07-02
 * @author Milton Figueredo <gratno@gmail.com>
 * @since 1.0.0
 */

// Es una interfaz
@RepositoryRestResource // Crea servicios a partir d este repositorio
public interface CursoRepository extends JpaRepository<Curso, Integer> {


}
