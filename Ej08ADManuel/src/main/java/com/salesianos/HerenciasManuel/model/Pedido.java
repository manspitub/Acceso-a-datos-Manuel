package com.salesianos.HerenciasManuel.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String address;
    private float price;

    public Pedido(String n, String a, float p){
        this.name = n;
        this.address = a;
        this.price = p;
    }




}
