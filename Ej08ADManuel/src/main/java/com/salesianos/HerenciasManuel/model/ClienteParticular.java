package com.salesianos.HerenciasManuel.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
@DiscriminatorValue("CP")
public class ClienteParticular extends Cliente{

    private int discountPercentage;

    private String userName;

    private String password;

}
