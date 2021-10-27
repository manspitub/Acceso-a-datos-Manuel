package com.salesianos.HerenciasManuel.repositories;

import com.salesianos.HerenciasManuel.model.ClienteCorporativo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteCorporativoRepository extends JpaRepository<ClienteCorporativo, Long> {
}