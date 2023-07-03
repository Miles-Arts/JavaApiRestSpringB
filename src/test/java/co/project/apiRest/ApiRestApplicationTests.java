package co.project.apiRest;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

/**
 *  API REST
 *
 * Consumir End Points
 *
 * @version 1.0.0 2023-07-02
 * @author Milton Figueredo <gratno@gmail.com>
 * @since 1.0.0
 */

@SpringBootTest
class ApiRestApplicationTests {

//	@Test
//	void contextLoads() {
//	}

	@Mock
	private CursoRepository cursoRepository;

	@Test
	public void  testFindAllCursos() {
		Curso curso1 = new Curso("Maven para Java", 300f);
		Curso curso2 = new Curso("Lombok para Java", 290f);
		List<Curso> cursos = Arrays.asList(curso1, curso2);

		//cuando vaya a consultar all cursos,
		// creados anteror mente, me debe traer todos los cursos
		when(cursoRepository.findAll()).thenReturn(cursos) ;
		/*curso1.setPrice(300f);  //la F para dato flotante
		curso1.setTitle("Maven para Java");*/
	}
}
