package com.salesianos.HerenciasManuel.repositories;

import com.salesianos.HerenciasManuel.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}