package com.salesianos.HerenciasManuel.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
@SuperBuilder
@Getter
@Setter
public class Empleado {

    @Id
    @GeneratedValue
    private Long id;

    private String name, surname;
    private double salary;

    private String department;

    @OneToMany(mappedBy = "empleado")
    private List<ClienteCorporativo> clienteCorporativos = new ArrayList<>();
}
