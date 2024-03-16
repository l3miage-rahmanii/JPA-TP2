package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.*;
import java.util.*;

@Entity
@Table
public class DeveloperMiage {

    @Id
    private String lastname;

    private String firstname;

    private String email;

    @ManyToMany(mappedBy = "developerMiages")
    private Set<Projet> projets;

}
