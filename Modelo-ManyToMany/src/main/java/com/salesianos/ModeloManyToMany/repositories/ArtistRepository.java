package com.salesianos.ModeloManyToMany.repositories;

import com.salesianos.ModeloManyToMany.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
