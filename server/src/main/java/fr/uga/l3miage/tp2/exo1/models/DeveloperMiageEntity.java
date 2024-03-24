package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.*;
import java.util.*;

@Entity
@Table
public class DeveloperMiageEntity {

    @Id
    @Column
    private String lastname;

    @Column
    private String firstname;

    @Column
    private String email;

    @ManyToMany
    private Set<ProjetEntity> projets;

}
