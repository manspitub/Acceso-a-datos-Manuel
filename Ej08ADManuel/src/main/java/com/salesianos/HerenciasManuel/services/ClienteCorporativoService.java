package com.salesianos.HerenciasManuel.services;

import com.salesianos.HerenciasManuel.model.ClienteCorporativo;
import com.salesianos.HerenciasManuel.repositories.ClienteCorporativoRepository;
import com.salesianos.HerenciasManuel.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ClienteCorporativoService extends BaseService<ClienteCorporativo, Long, ClienteCorporativoRepository> {
}
