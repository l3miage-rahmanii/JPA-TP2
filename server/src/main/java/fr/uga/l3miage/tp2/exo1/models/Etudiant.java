package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "etudiant")
public class Etudiant {

    @Id
    private Long agalan;

    private String nom;

    private String email;

    @ManyToMany(mappedBy = "etudiants")
    private Set<ClubSportif> ClubSportifs;

}
