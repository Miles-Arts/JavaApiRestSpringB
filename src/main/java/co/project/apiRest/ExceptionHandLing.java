package co.project.apiRest;

import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *  API REST
 *
 * Consumir End Points
 *
 * @version 1.0.0 2023-07-02
 * @author Milton Figueredo <gratno@gmail.com>
 * @since 1.0.0
 */

@RestControllerAdvice  //controlar exception de Notnull
public class ExceptionHandLing {

    //Manejar exceptions
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ConstraintViolationException.class)
    ProblemDetail handleConstraintViolationException() {
        //añadir texto declarativo sobre el error para el cliente
        return ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, "La solicitud HTTP tiene errores");
    }
}
