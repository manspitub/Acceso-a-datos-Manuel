package com.salesianos.ModeloManyToMany.model;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@Entity @Getter
@Builder
@Setter
@EntityListeners({AuditingEntityListener.class})
public class JustAdded {

    @Builder.Default
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

    @CreatedDate
    @DateTimeFormat(pattern= "yyyy-mm-dd")
    private LocalDateTime creationDate;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orden;

    public void addToSong(Song s){
        this.song = s;
        s.getJustAddeds().add(this);
    }

    public void deleteFromSong(Song s){
        s.getJustAddeds().remove(this);
        this.song = null;
    }

    public void addToPlaylist(Playlist p){
        this.playlist = p;
        p.getJustAddeds().add(this);
    }

    public void deleteFromPlaylist(Playlist p){
        p.getJustAddeds().remove(this);
        this.playlist = null;
    }

    public void addSongToPlaylist(Song s, Playlist p){
        addToSong(s);
        addToPlaylist(p);
    }

    public void deleteSongFromPlaylist(Song s, Playlist p){
        deleteFromSong(s);
        deleteFromPlaylist(p);
    }

    public JustAdded(LocalDateTime creationDate, Integer orden) {
        this.creationDate = creationDate;
        this.orden = orden;
    }
}
