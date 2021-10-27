package com.salesianos.HerenciasManuel.repositories;

import com.salesianos.HerenciasManuel.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}