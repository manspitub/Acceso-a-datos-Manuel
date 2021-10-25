package com.salesianos.ModeloManyToMany.repositories;

import com.salesianos.ModeloManyToMany.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
