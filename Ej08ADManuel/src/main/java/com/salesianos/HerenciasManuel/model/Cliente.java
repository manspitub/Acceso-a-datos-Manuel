package com.salesianos.HerenciasManuel.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter @Getter
@SuperBuilder
@DiscriminatorValue("CN")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Cliente implements Serializable{
    @Id
    @GeneratedValue
    private Long id;

    private String name, adress, phone;

    @Builder.Default
    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos = new ArrayList<>();



    public Cliente(String name, String adress, String phone) {
        this.name = name;
        this.adress = adress;
        this.phone = phone;
    }
}
