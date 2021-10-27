package com.salesianos.HerenciasManuel.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data @NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Cliente {
    @Id
    @GeneratedValue
    private Long id;

    private String name, adress, phone;



}
