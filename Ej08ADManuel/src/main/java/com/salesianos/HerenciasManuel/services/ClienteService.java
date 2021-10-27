package com.salesianos.HerenciasManuel.services;

import com.salesianos.HerenciasManuel.model.Cliente;
import com.salesianos.HerenciasManuel.repositories.ClienteRepository;
import com.salesianos.HerenciasManuel.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ClienteService extends BaseService<Cliente,Long , ClienteRepository> {
}
