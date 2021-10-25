package com.salesianos.ModeloManyToMany.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Song {

    @Id
    @GeneratedValue
    private long id;

    private String title, album, year;

    @ManyToOne
    private Artist artist;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @OneToMany(mappedBy="song", fetch = FetchType.EAGER)
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
}
