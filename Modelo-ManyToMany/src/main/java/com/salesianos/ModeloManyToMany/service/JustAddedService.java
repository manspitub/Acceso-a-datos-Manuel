package com.salesianos.ModeloManyToMany.service;

import com.salesianos.ModeloManyToMany.model.JustAdded;
import com.salesianos.ModeloManyToMany.model.Playlist;
import com.salesianos.ModeloManyToMany.model.Song;
import com.salesianos.ModeloManyToMany.repositories.JustAddedRepository;
import com.salesianos.ModeloManyToMany.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class JustAddedService
        extends BaseService<JustAdded, Long, JustAddedRepository> {

    public void addSongToPlaylist(Playlist p, Song s, PlayListService pService, SongService sService) {

        JustAdded justAdded = new JustAdded();

        justAdded.addSongToPlaylist(s,p);

        save(justAdded);

        pService.edit(p);
        sService.edit(s);

    }

    public Song added(Song s, Playlist p) {
        s.getJustAddeds().forEach(justAdded -> {
            JustAdded j = JustAdded.builder()
                    .song(s)
                    .playlist(p)
                    .build();
            save(j);
        });

        return s;
    }

}
