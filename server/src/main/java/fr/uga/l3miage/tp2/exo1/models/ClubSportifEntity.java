package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "club_sportif")
public class ClubSportifEntity {

    @Id
    private Long id;

    private String nom;

    private String description;

    @ManyToMany
    private Set<EtudiantEntity> etudiants;
}
