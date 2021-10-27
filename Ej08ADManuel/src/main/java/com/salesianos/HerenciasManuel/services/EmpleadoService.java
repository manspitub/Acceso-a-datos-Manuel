package com.salesianos.HerenciasManuel.services;

import com.salesianos.HerenciasManuel.model.Empleado;
import com.salesianos.HerenciasManuel.repositories.EmpleadoRepository;
import com.salesianos.HerenciasManuel.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService extends BaseService<Empleado,Long, EmpleadoRepository> {
}
