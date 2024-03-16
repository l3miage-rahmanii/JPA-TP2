package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.*;
import java.util.*;
@Entity
@Table(name = "projet")
public class Projet {

    @Id
    private Long id;

    private String name;

    private String description;

    @ManyToMany
    private Set<DeveloperMiage> developerMiages;

}