package com.salesianos.ModeloManyToMany.service;

import com.salesianos.ModeloManyToMany.model.Artist;
import com.salesianos.ModeloManyToMany.repositories.ArtistRepository;
import com.salesianos.ModeloManyToMany.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ArtistService
        extends BaseService<Artist, Long, ArtistRepository> {
}
