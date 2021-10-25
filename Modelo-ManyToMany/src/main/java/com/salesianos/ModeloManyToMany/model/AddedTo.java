package com.salesianos.ModeloManyToMany.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data @NoArgsConstructor
@Embeddable
public class AddedTo implements Serializable {

    long playlist_id;

    long song_id;
}
