package co.project.apiRest;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 *  API REST
 *
 * Consumir End Points
 *
 * @version 1.0.0 2023-07-02
 * @author Milton Figueredo <gratno@gmail.com>
 * @since 1.0.0
 */
@Data
@Entity
@RequiredArgsConstructor  //Añade los Getter y Setters
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NonNull  // se puede utilizar junto con @RequiredArgsConstructor
    @NotBlank  //Para que no que de en blanco
    private String title;

    @NonNull
    @NotNull
    @Positive  //Positive para que sea un valor positivo
    private Float price;
}
