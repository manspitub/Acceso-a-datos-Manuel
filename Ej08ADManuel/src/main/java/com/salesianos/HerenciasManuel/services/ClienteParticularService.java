package com.salesianos.HerenciasManuel.services;

import com.salesianos.HerenciasManuel.model.ClienteParticular;
import com.salesianos.HerenciasManuel.repositories.ClienteParticularRepository;
import com.salesianos.HerenciasManuel.services.base.BaseService;
import org.springframework.stereotype.Service;


@Service
public class ClienteParticularService extends BaseService<ClienteParticular, Long, ClienteParticularRepository> {

}
