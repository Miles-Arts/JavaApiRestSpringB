package co.project.apiRest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 *  API REST
 *
 * Consumir End Points
 *
 * @version 1.0.0 2023-07-02
 * @author Milton Figueredo <gratno@gmail.com>
 * @since 1.0.0
 */

@Entity
@Data //Añade los Getter y Setters
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    private String title;
    private Float price;
}
