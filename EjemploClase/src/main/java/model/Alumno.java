package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
//@Getter @Setter @EqualsAndHashCode
@Data
@AllArgsConstructor @Builder
public class Alumno implements Serializable {
    @Column(nullable = false)
    @Id
    @GeneratedValue
    private Long id;

    private String nombre, apellidos, email;



}
