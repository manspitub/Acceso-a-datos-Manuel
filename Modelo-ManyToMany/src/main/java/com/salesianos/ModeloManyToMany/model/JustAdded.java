package com.salesianos.ModeloManyToMany.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.persistence.criteria.Order;
import java.time.LocalDateTime;

@Data @NoArgsConstructor
@Entity

public class JustAdded {

    @EmbeddedId
    private AddedTo id = new AddedTo();

    @ManyToOne
    @MapsId("song_id")
    @JoinColumn(name = "song_id")
    private Song song;

    @ManyToOne
    @MapsId("playlist_id")
    @JoinColumn(name = "playlist_id")
    private Playlist playlist;

    @DateTimeFormat(pattern= "yyyy-mm-dd")
    private LocalDateTime creationDate;



}
