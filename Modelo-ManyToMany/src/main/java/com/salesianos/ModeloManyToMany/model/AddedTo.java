package com.salesianos.ModeloManyToMany.model;

import lombok.*;


import javax.persistence.Embeddable;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Getter @Setter
public class AddedTo implements Serializable {

   private Long playlist_id;

   private Long song_id;
}
