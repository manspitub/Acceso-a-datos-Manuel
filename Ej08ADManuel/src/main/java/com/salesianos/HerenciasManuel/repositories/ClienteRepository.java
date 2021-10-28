package com.salesianos.HerenciasManuel.repositories;

import com.salesianos.HerenciasManuel.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    @Query("select c from Cliente c WHERE TYPE(c) !=ClienteCorporativo and TYPE(c) != ClienteParticular")
    List<Cliente> listarClientesNormales();

    @Query("select c from Cliente c WHERE TYPE(c) = ClienteCorporativo")
    List<Cliente> listarClientesCorporativos();
}