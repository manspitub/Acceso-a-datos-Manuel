package com.salesianos.dam.apirest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class InitData {

    private final TaskRepository repository;

    @PostConstruct
    public void init() {
        repository.saveAll(
                Arrays.asList(
                        new Task("Rellenar initdata", "Llena de datos el repositorio"),
                        new Task("Cerrar el proyecto", "El proyecto se cierra"),
                        new Task("Irte pa casa", "Se va pa su casa")
                )
        );
    }
}
