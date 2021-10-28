package com.salesianos.HerenciasManuel.model;

import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder()
@Getter @Setter
@EntityListeners(AuditingEntityListener.class)
public class Pedido {


    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String address;
    private float price;

    @ManyToOne
    @JoinColumn(name = "cliente", foreignKey = @ForeignKey( name = "FK_PEDIDO_CLIENTE"))
    private Cliente cliente;


    public void addCliente(Cliente c) {
        cliente = c;
        c.getPedidos().add(this);
    }

    public void removeCliente(Cliente c) {
        c.getPedidos().remove(this);
        cliente = null;
    }

    public Pedido(String n, String a, float p){
        this.name = n;
        this.address = a;
        this.price = p;
    }



}
