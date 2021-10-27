package com.salesianos.HerenciasManuel.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.ArrayList;

@Entity
@AllArgsConstructor @NoArgsConstructor
@SuperBuilder
@Getter @Setter
public class ClienteCorporativo extends Cliente{

    private String contactName, creditRating;

    private float creditLimit;

    @ManyToOne
    @JoinColumn(name = "empleado")
    private Empleado empleado;

    public void addEmpleado(Empleado e) {
        this.empleado = e;
        if (e.getClienteCorporativos() == null)
            e.setClienteCorporativos((new ArrayList<>()));
        e.getClienteCorporativos().add(this);
    }

    public void removeEmpleado(Empleado e) {
        empleado = null;
        e.getClienteCorporativos().remove(this);
    }

}
