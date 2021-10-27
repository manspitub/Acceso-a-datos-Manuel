package com.salesianos.ModeloManyToMany.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Song {

    @Id
    @GeneratedValue
    private long id;

    private String title, album, year;

    @ManyToOne
    private Artist artist;

    @Builder.Default
    @OneToMany(mappedBy="song", cascade = CascadeType.REMOVE)
    private List<JustAdded> justAddeds = new ArrayList<>();

    public Song(String title, String album, String year, Artist artist) {
        this.title = title;
        this.album = album;
        this.year = year;
        this.artist = artist;
    }

    public Song(String title, String album, String year) {
        this.title = title;
        this.album = album;
        this.year = year;
    }

    public void addToArtist(Artist a) {
        artist = a;
        a.getSongs().add(this);
    }

    public void removeFromArtist(Artist a) {
        a.getSongs().remove(this);
        artist = null;
    }

}
