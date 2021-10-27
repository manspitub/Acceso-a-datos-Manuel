package com.salesianos.ModeloManyToMany.service;

import com.salesianos.ModeloManyToMany.model.Song;
import com.salesianos.ModeloManyToMany.repositories.SongRepository;
import com.salesianos.ModeloManyToMany.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class SongService
        extends BaseService<Song, Long, SongRepository> {
}
