package com.salesianos.ModeloManyToMany.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Playlist {
    @Id @GeneratedValue
    private Long id;

    private String name, description;

    @OneToMany(mappedBy = "playlist", fetch = FetchType.EAGER)
    private List<JustAdded> justAddeds = new ArrayList<>();

    public Playlist(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
