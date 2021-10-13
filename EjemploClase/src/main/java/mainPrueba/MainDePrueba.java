package mainPrueba;


import model.Alumno;
import org.springframework.stereotype.Component;
import repos.AlumnoRepository;

import javax.annotation.PostConstruct;

@Component
public class MainDePrueba {

    AlumnoRepository repository;

    @PostConstruct
    public void test() {
        Alumno alumno = Alumno.builder()
                .nombre("Manuel")
                .apellidos("Spinola Tubío")
                .email("manueL.spinola@triana.edu")
                .build();
        repository.save(alumno);

        repository.findAll().add(alumno);

    }
}
