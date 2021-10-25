package com.salesianos.ModeloManyToMany.repositories;

import com.salesianos.ModeloManyToMany.model.JustAdded;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JustAddedRepository extends JpaRepository<JustAdded, Long> {
}
