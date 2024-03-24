package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.*;
@Entity
@Table
public class ProjetEntity {

    @Id
    @Column
    private BigInteger id;

    @Column
    private String name;

    @Column
    private String description;

    @ManyToMany(mappedBy = "projet")
    private Set<DeveloperMiageEntity> developerMiage;
}