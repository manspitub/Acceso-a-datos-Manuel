package com.salesianos.HerenciasManuel.services;

import com.salesianos.HerenciasManuel.model.Pedido;
import com.salesianos.HerenciasManuel.repositories.PedidoRepository;
import com.salesianos.HerenciasManuel.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PedidoService extends BaseService<Pedido, Long, PedidoRepository> {
}
