package com.salesianos.ModeloManyToMany.model;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data @NoArgsConstructor
@AllArgsConstructor
@Entity
public class Artist {
    @Id @GeneratedValue
    private Long id;

    private String name;

    public Artist(String n) {
        this.name = n;
    }
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @OneToMany(mappedBy="artist", fetch = FetchType.EAGER)
    private List<Song> songs = new ArrayList<>();


    public void addSong(Song s){
        this.songs.add(s);
        s.setArtist(this);
    }

    public void removeSong(Song s){
        this.songs.remove(s);
        s.setArtist(null);
    }
}
