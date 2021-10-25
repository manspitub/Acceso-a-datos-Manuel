package com.salesianos.ModeloManyToMany;


import com.salesianos.ModeloManyToMany.model.Artist;
import com.salesianos.ModeloManyToMany.model.JustAdded;
import com.salesianos.ModeloManyToMany.model.Playlist;
import com.salesianos.ModeloManyToMany.model.Song;
import com.salesianos.ModeloManyToMany.service.ArtistService;
import com.salesianos.ModeloManyToMany.service.JustAddedService;
import com.salesianos.ModeloManyToMany.service.PlayListService;
import com.salesianos.ModeloManyToMany.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final ArtistService artistService;
    private final SongService songService;
    private final PlayListService playListService;
    private final JustAddedService justAddedService;

    @PostConstruct
    public void test() {

        Artist artist = Artist.builder()
                .name("Dani Martin")
                .build();

        artistService.edit(artist);

        Song song = Song.builder()
                .title("Zapatillas")
                .year("2005")
                .artist(artist)
                .build();

        songService.save(song);

        Playlist playlist = Playlist.builder()
                .name("Top 100")
                .description("Las mejores Canciones")
                .build();
        playListService.edit(playlist);


    }

}
