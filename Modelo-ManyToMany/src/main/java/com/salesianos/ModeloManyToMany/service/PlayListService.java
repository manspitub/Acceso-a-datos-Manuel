package com.salesianos.ModeloManyToMany.service;

import com.salesianos.ModeloManyToMany.model.Playlist;
import com.salesianos.ModeloManyToMany.repositories.PlaylistRepository;
import com.salesianos.ModeloManyToMany.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PlayListService
        extends BaseService<Playlist, Long, PlaylistRepository> {
}
