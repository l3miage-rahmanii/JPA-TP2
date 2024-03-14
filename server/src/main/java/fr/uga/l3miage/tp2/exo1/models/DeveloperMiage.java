package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "developer_miage")
public class DeveloperMiage {

    @Id
    @Column(name = "lastname")
    private String lastname;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "email")
    private String email;

    @ManyToMany
    private ArrayList<Projet> projets;

}
