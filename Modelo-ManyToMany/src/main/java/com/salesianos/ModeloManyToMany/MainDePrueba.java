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
import java.util.List;

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

        artistService.save(artist);

        List<Song> songs = List.of(
                Song.builder().title("Zapatillas").year("2005").album("Zapatillas").build(),
                Song.builder().title("La madre de Jose").year("2003").album("Estados de Ánimo").build(),
                Song.builder().title("Son Sueños").year("2002").album("A contracorriente").build(),
                Song.builder().title("Insoportable").year("2003").album("Estados de Ánimo").build()
                );

        Song song = Song.builder()
                        .title("Volver a Disfrutar")
                        .year("2003")
                                .album("Estados de animo")
                                        .build();

        songService.saveAll(songs);


        Playlist playlist = Playlist.builder()
                .name("Top 100")
                .description("Las mejores Canciones")
                .build();
        playListService.save(playlist);

        for(int i = 0; i < songs.size(); i++){
            songs.get(i).addToArtist(artist);
        }

        songService.saveAll(songs);


        artistService.edit(artist);


        song = justAddedService.added(song, playlist);




    }

}
