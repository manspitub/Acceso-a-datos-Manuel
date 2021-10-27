package com.salesianos.HerenciasManuel.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter @Getter
@SuperBuilder
public abstract class Cliente {
    @Id
    @GeneratedValue
    private Long id;

    private String name, adress, phone;

    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos = new ArrayList<>();



    public Cliente(String name, String adress, String phone) {
        this.name = name;
        this.adress = adress;
        this.phone = phone;
    }
}
