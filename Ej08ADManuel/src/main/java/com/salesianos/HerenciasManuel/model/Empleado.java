package com.salesianos.HerenciasManuel.model;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Empleado {

    @Id
    @GeneratedValue
    private Long id;

    private String name, surname;
    private double salary;

    private String department;

    @Builder.Default
    @OneToMany(mappedBy = "empleado")
    private List<ClienteCorporativo> clienteCorporativos = new ArrayList<>();
}
