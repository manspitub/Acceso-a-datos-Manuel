package com.salesianos.ModeloManyToMany.repositories;

import com.salesianos.ModeloManyToMany.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}
