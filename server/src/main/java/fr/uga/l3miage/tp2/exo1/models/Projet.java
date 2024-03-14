package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.*;
import java.util.*;
@Entity
@Table(name = "projet")
public class Projet {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToMany
    private Set<DeveloperMiage> developerMiage;

}