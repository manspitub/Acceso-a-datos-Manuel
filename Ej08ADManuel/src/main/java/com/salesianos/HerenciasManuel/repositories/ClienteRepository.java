package com.salesianos.HerenciasManuel.repositories;

import com.salesianos.HerenciasManuel.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}